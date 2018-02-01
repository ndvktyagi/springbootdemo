FROM ubuntu:12.04
ENV JAVA_VERSION 8u31
ENV BUILD_VERSION b13
# Upgrading system
RUN apt-get -y upgrade
#RUN apt-get -y install wget
# Downloading & Config Java 8
#RUN wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/$JAVA_VERSION-$BUILD_VERSION/jdk-$JAVA_VERSION-linux-x64.rpm" -O /tmp/jdk-8-linux-x64.rpm
#RUN apt-get -y install /tmp/jdk-8-linux-x64.rpm
#RUN alternatives --install /usr/bin/java jar /usr/java/latest/bin/java 200000
#RUN alternatives --install /usr/bin/javaws javaws /usr/java/latest/bin/javaws 200000
#RUN alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 200000

# Install Java.
RUN \
  echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update && \
  apt-get install -y oracle-java8-installer && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer


# Define working directory.
WORKDIR /data

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/java-8-oracle

EXPOSE 8080
#install Spring Boot artifact
VOLUME /tmp
ADD /maven/sfg-thymeleaf-course-0.0.1-SNAPSHOT.jar sfg-thymeleaf-course.jar
RUN sh -c 'touch /sfg-thymeleaf-course.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/sfg-thymeleaf-course.jar"]