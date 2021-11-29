FROM openjdk:latest
ENV JAVA_LIB_DIR=/Deployments/lib/* JAVA_MAIN_CLASS=coin.stech.jkube.helloConsole.App
COPY /jkube-generated-layer-original/Deployments /Deployments/
COPY /jkube-generated-layer-final-artifact/Deployments /Deployments/
CMD java -cp "/Deployments/helloConsole-1.0.1.jar:/Deployments/lib/slf4j-api-1.7.32.jar:/Deployments/lib/slf4j-simple-1.7.32.jar" coin.stech.jkube.helloConsole.App
