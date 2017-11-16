#!/bin/bash

export WS_URL=http://localhost:8001

export MODULE_PATH=`pwd`

mkdir -p ${MODULE_PATH}/build/tmp

if [ ! -f ${MODULE_PATH}/build/tmp/codegen.jar ]; then
    wget -O ${MODULE_PATH}/build/tmp/codegen.jar http://central.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.3/swagger-codegen-cli-2.2.3.jar
fi

java -jar ${MODULE_PATH}/build/tmp/codegen.jar generate -i ${WS_URL}/swagger.json -l java -o ${MODULE_PATH} -c ${MODULE_PATH}/config/codegen-java-config.json

