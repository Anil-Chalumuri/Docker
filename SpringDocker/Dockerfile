FROM frolvlad/alpine-oraclejdk8
LABEL maintainer="Anil.chalumuri@anil.chalumuri@gmail.com>"
LABEL description="Spring Boot Program"
COPY FormProcessing.jar /opt/aspire/
WORKDIR /opt/aspire/
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "FormProcessing.jar"]