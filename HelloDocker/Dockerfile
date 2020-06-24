FROM frolvlad/alpine-oraclejdk8
#FROM ubuntu:latest

LABEL maintainer="Anil Chalumuri <anil.chalumuri1@gmail.com>"
LABEL description="Standalone Java Program"

#RUN apt-get update && apt-get install -y openjdk-8-jre

COPY *.class /opt/aspire/
WORKDIR /opt/aspire/

#CMD ["java", "Welcome"]
#ENTRYPOINT ["java", "Welcome"]

CMD ["Sample"]
ENTRYPOINT ["java"]
