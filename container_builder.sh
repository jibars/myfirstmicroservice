#!/usr/bin/env bash
set -ex
VERSION=$(date +%Y%m%d%H%M%S)-$(git rev-parse --short HEAD)

./gradlew installDist --stacktrace

docker build -t ${DOCKER_IMAGE}:latest .
docker login --username="${ARTIFACTORY_WRITER_USER}" --password="${ARTIFACTORY_WRITER_PWD}" ${DOCKER_REGISTRY}
docker tag ${DOCKER_IMAGE}:latest ${DOCKER_IMAGE}:${VERSION}
docker push ${DOCKER_IMAGE}
