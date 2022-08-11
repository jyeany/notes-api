#!/bin/bash

docker-compose -f ../notes-api-compose/docker-compose.yml up -d

cd ..
./gradlew shadowJar
cd build/libs

export OTEL_SERVICE_NAME=notes_api
export OTEL_EXPORTER_OTLP_PROTOCOL=grpc
export OTEL_EXPORTER_OTLP_ENDPOINT=http://localhost:4317
export OTEL_EXPORTER_METRICS_ENDPOINT=http://localhost:4317
export OTEL_EXPORTER_OTLP_LOGS_ENDPOINT=http://localhost:4317

java -javaagent:../../otel/opentelemetry-javaagent.jar -jar notes-api-0.0.1-all.jar
