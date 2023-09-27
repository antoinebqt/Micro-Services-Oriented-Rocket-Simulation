#!/bin/bash

docker-compose --file weather-service/docker-compose-weather.yml \
               --file mission-service/docker-compose-mission.yml \
               --file telemetry-service/docker-compose-telemetry.yml \
               --file rocket-hardware-mock-service/docker-compose-rocket-hardware.yml \
               --file payload-service/docker-compose-payload.yml \
               --file executive-service/docker-compose-executive.yml \
               --file rocket-service/docker-compose-rocket.yml logs --follow --since 0m
