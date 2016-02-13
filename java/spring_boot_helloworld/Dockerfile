FROM rhel7

MAINTAINER burrsutter@gmail.com

RUN yum -y install java

ADD target/springboot-helloworld.jar .

EXPOSE 8080

CMD java -jar springboot-helloworld.jar
