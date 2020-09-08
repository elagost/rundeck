# original https://hub.docker.com/r/bwits/rundeck-build/
FROM container-registry.oracle.com/os/oraclelinux:7
RUN yum -y install oracle-epel-release-el7
RUN yum -y update
RUN yum -y install java-1.8.0-openjdk java-1.8.0-openjdk-devel
RUN useradd rundeck
#USER rundeck

ENV USERNAME=rundeck \
    USER=rundeck \
    HOME=/home/rundeck \
    LOGNAME=$USERNAME \
    TERM=xterm-256color


ENV JAVA_HOME=/etc/alternatives/java_sdk
ADD entry.sh /entry.sh
RUN chmod +x /entry.sh
VOLUME $HOME/rundeck
WORKDIR $HOME/rundeck


EXPOSE 4440
ENTRYPOINT ["/entry.sh"]
