#!/bin/bash
set -ex
cd /usr/local/app
exec java -jar "bin/todo-app-0.0.1-SNAPSHOT.jar"

