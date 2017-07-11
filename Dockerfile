FROM openjdk:8
ADD target/userNhs.jar userNhs.jar
EXPOSE 8283
ENTRYPOINT [ "java" , "-jar" , "userNhs.jar" ]