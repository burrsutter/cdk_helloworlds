CDK Instructions:

Host: Mac or Windows Host machine, runs VirtualBox

VM: the RHEL-based VM, that which runs inside VirtualBox

# From the Host:
Place code in the same directory as your "vagrant up"

mvn clean compile package

java -jar target/swarm-helloworld-1.0-SNAPSHOT-swarm.jar

Ctrl-C

vagrant rsync

# From the VM (vagrant ssh)

cd /vagrant
ls

docker build -t burrsutter/wildflyswarm_helloworld .
docker run -p 8080:8080 burrsutter/wildflyswarm


