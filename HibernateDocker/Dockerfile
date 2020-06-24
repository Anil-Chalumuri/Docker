FROM frolvlad/alpine-oraclejdk8
LABEL maintainer="Anil Chalumuri<anil.chalumuri1@gmail.com>"
LABEL description="HIBERNATE Program"
COPY HibernateDocker.jar /opt/aspire/
WORKDIR /opt/aspire/
ENTRYPOINT ["java", "-jar", "HibernateDocker.jar"]