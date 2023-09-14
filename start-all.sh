#!/bin/bash

echo "** Starting all"
docker-compose --file weather-service/docker-compose-weather.yml \
               --file mission-service/docker-compose-mission.yml \
               --file rocket-service/docker-compose-rocket.yml up -d

read -p "Press any key to continue... "

echo "** All services started"
