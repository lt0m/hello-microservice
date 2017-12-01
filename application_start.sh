#!/bin/bash

java -jar /home/ec2-user/hello-service-1.0-SNAPSHOT.jar 2> /home/ec2-user/hello-service.err.log > /home/ec2-user/hello-service.log &
