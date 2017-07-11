FROM openjdk:8
ADD target/leedsGp.jar leedsGp.jar
EXPOSE 8282
ENTRYPOINT [ "java" , "-jar" , "leedsGp.jar" ]