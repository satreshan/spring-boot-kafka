
1. Create the jar using $mvn clean install.
2. Create Dockerfile.
3. Build the docker container 
    $docker build -f <dockerfile-name> -t <container-tag> .
4. Run the container 
    $docker run -p <host-port>:<container-port> <container-tag>
5. Access the application at port <host-port>
