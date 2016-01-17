# From the Host:

javac src/HelloWorld.java -d bin/

java -cp bin HelloWorld

# From the VM (vagrant ssh)

docker build -t burrsutter/java_helloworld .

docker run burrsutter/java_helloworld
