# Notes API

## Overview
Simple REST API made using ktor to 
save, retrieve, and delete notes in memory


## Running
Run using:
```shell
./gradlew run
```

## Run Locally with OpenTelemetry autoconfiguration
Use:
```shell
scripts/start-with-otel.sh
```

Use the Jaeger UI to view traces:
http://localhost:16686