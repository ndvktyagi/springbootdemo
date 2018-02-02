#FROM ubuntu:12.04

# Upgrading system
#RUN apt-get -y upgrade
#RUN apt-get -y update
#RUN apt-get install -y software-properties-common python-software-properties

# Install Java.
#RUN \
#  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
#  add-apt-repository -y ppa:webupd8team/java && \
#  apt-get -y update && \
#  apt-get install -y oracle-java8-installer && \
#  rm -rf /var/lib/apt/lists/* && \
#  rm -rf /var/cache/oracle-jdk8-installer


# Define working directory.
#WORKDIR /data

# Define commonly used JAVA_HOME variable
#ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

#EXPOSE 8080

#install Spring Boot artifact
FROM java:8
VOLUME /tmp
ADD /maven/SpringBoot-0.0.1-SNAPSHOT.jar SpringBoot.jar
RUN bash -c 'touch /SpringBoot.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/SpringBoot.jar"]