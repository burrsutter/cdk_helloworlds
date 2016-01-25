FROM rhel7

MAINTAINER burrsutter@gmail.com

RUN yum -y install java

ADD target/springboot-0.1.0.jar .

EXPOSE 8080

CMD java -jar springboot-0.1.0.jar
