yum install docker
service docker stop
dockerd -H tcp://127.0.0.1:2375 &
export DOCKER_HOST=tcp://127.0.0.1:2375
service docker start
