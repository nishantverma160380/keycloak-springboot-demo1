FROM openjdk:8
ADD target/liverpoolGp.jar liverpoolGp.jar
EXPOSE 8081
ENTRYPOINT [ "java" , "-jar" , "liverpoolGp.jar" ]