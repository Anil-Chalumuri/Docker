FROM tomcat:latest
LABEL maintainer="Anil.chalumuri@anil.chalumuri@gmail.com>"
LABEL description="JSP Program"
COPY JspDocker.war /usr/local/tomcat/webapps/
WORKDIR /usr/local/tomcat/bin/
EXPOSE 8181
CMD ["catalina.sh", "run"]