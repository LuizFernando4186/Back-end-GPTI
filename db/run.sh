#!/bin/bash
echo "Building JAR with maven..."
cd ../api/
mvn clean install

echo "Building and running docker images..."
docker rmi imagem_api_backend_gpti
cd ../db/
docker compose up 