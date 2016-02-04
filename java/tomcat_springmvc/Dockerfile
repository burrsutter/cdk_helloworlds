FROM rhel7

MAINTAINER burrsutter@gmail.com

RUN yum -y install java

# note, only installs JRE "java", not "javac"
# /usr/lib/jvm/jre/bin contains java
# to install JDK
# yum install java-1.8.0-openjdk-devel
# /usr/lib/jvm/java-1.8.0/bin contains javac

RUN yum -y install tomcat tomcat-webapps tomcat-admin-webapps
RUN rm -fR /usr/share/tomcat/webapps/*

# critical files are:
# /usr/share/tomcat/bin contains bootstrap.jar
# /usr/share/tomcat/conf contains server.xml, tomcat.conf, tomcat-users.xml, log4j.properties
# /usr/share/tomcat/webapps for .wars (ROOT, examples)
# /var/log/tomcat contains catalina.out

COPY target/tomcat-spring-mvc.war /usr/share/tomcat/webapps/ROOT.war

EXPOSE 8080

# CMD ["tomcat", "start"]

CMD ["/usr/libexec/tomcat/server", "start"]  


