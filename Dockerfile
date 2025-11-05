FROM  eclipse-temurin:17
COPY target/automated.jar automated.jar
CMD [ "java","-jar","automated.jar" ]
