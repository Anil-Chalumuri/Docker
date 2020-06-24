FROM alpine:latest
LABEL maintainer="Anil Chalumuri<anil.chalumuri1@gmail.com>"
LABEL description="Nginx Server"
RUN apk add --update nginx && rm -rf /var/cache/apk/* && mkdir -p /tmp/nginx/
COPY files/nginx.conf  /etc/nginx/nginx.conf
COPY files/default.conf /etc/nginx/conf.d/default.conf
ADD files/html.tar.gz /usr/share/nginx/
CMD ["nginx", "-g", "daemon off;"]
