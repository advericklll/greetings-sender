# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.greetings-sender' is invalid and this project uses 'com.example.greetingssender' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.5/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.5/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#using.devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.0.5/reference/htmlsingle/#io.email)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


### JDK Version

This project uses JDK 17 from amazon corretto. Please download if from here: 

* [Amazon Corretto](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)


### Gradle

This project is built with gradle. Please download if from here:

* [Gradle](https://gradle.org/install/)


### Steps to run Jar.

The JDK must be installed on machine. JAVA_HOME should be set.
* [Setting Java home](https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html)

To run Jar file, please run following gradle commands in a terminal (jar directory)
* gradlew clean build copyReportsForArchiving

Then, open a terminal in jar directory and run this command:
java -jar .\greetings-sender-0.0.1-SNAPSHOT.jar

For testing purposes, feel free to update persons.txt file (keep in mind it should follow same pattern).

