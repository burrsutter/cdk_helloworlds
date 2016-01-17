FROM rhel7

MAINTAINER burrsutter@gmail.com

RUN yum -y install java

ADD target/swarm-helloworld-1.0-SNAPSHOT-swarm.jar .

EXPOSE 8080

CMD java -jar swarm-helloworld-1.0-SNAPSHOT-swarm.jar
