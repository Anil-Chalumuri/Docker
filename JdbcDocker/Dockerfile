FROM frolvlad/alpine-oraclejdk8
LABEL maintainer="Anil.chalumuri@anil.chalumuri@gmail.com>"
LABEL description="JDBC Program"
COPY JdbcDocker.jar /opt/aspire/
COPY connection.properties /opt/aspire/
WORKDIR /opt/aspire/

ENTRYPOINT ["java", "-jar", "JdbcDocker.jar"]