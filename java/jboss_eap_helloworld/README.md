Host:

mvn clean compile package

vagrant rsync

VM:

cd /vagrant/src/java/jboss_eap_helloworld

docker build -t burrsutter/jboss-eap-helloworld .

docker run -it -p 8080:8080 burrsutter/jboss-eap-helloworld

http://10.1.2.2:8080/


