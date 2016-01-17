FROM jboss-eap-6/eap64-openshift

MAINTAINER burrsutter@gmail.com

ENV USERNAME admin
ENV PASSWORD docker#admin1

#Create admin user
RUN /opt/eap/bin/add-user.sh -u $USERNAME -p $PASSWORD --silent

# Expose the ports we're interested in
EXPOSE 8080 9990

ADD target/jboss-eap-helloworld.war /opt/eap/standalone/deployments/

# Set the default command to run on boot
# This will boot EAP 6.4 in the standalone mode and bind to external interface
CMD /opt/eap/bin/standalone.sh -b 0.0.0.0