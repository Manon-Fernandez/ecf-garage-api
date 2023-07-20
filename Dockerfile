FROM arm64v8/maven:3.9-eclipse-temurin-17 AS MAVEN_BUILD

COPY src /home/app/src
COPY pom.xml /home/app

WORKDIR /home/app
RUN mvn clean package

FROM arm64v8/eclipse-temurin:17-jre

COPY --from=MAVEN_BUILD /home/app/target/*.war /usr/local/lib/app.war
EXPOSE 8081
ENTRYPOINT ["java","-jar", "/usr/local/lib/app.war"]