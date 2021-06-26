FROM java:8-jdk
ARG JAR_FILE=target/tkj-product.jar
EXPOSE 8800
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]