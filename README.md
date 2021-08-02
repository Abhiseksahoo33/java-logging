# java-logging
this repo contains how to setup logging in intellij 


link of logfile - https://www.srccodes.com/logback-using-slf4j-hello-world-example/

1. open intellij idea 

2. create project (maven architype quickstart) 

3. create package in java folder (com.logging)  //  for renaming folder (shift+fn+f6)

4.Add the logfile dependacy in pom.xml



<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.logging</groupId>
  <artifactId>simple-logging-example</artifactId>
  <version>1.0-SNAPSHOT</version>
  <packaging>jar</packaging>


  <name>simple-logging-example standalone app</name>
  <!-- FIXME change it to the project's website JAR, WAR, EAR -->
  <url>http://www.example.com</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
    <slf4j.version>1.6.6</slf4j.version>
    <logback.version>1.0.7</logback.version>
  </properties>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.slf4j</groupId>
      <artifactId>slf4j-api</artifactId>
      <version>${slf4j.version}</version>
    </dependency>
    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>${logback.version}</version>
    </dependency>
    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-core</artifactId>
      <version>${logback.version}</version>
    </dependency>
  </dependencies>



5.do mvn clean -> mvn clean install 
6. build project again
7.add resources folder in the main 
8. Add logback.xml file in resources folder 
9.copy in logback.xml


<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <appender name="fileAppender" class="ch.qos.logback.core.FileAppender">
        <file>myLogFile.log</file>
        <append>true</append>
        <encoder>
            <pattern>%d [%thread] %-5level  %logger{35} - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="TRACE">
        <appender-ref ref="fileAppender" />
    </root>
</configuration>


10.log file will created .


to print the log in console 

write 

<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <appender name="fileAppender" class="ch.qos.logback.core.ConsoleAppender">

        <encoder>
            <pattern>%d [%thread] %-5level  %logger{35} - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="TRACE">
        <appender-ref ref="fileAppender" />
    </root>
</configuration>

in logback.xml
         
         
         
 11.        never write log file for user credentials 
         
         
            <root level="OFF">
        <appender-ref ref="fileAppender" />
        <appender-ref ref="ConsoleAppender"/>
    </root>
         
         
12.  //ORDERING : TRACE - DEBUG - INFO- WARN - ERROR
            LOGGER.trace("result : {} ",x);
            LOGGER.debug("result : {} ",x);
            LOGGER.info("result : {} ",x);
            LOGGER.warn("result : {} ",x);
            LOGGER.error("result : {} ",x);
         
         
11. to open the .jar file 
         
         a- copy it to anew folder 
         
         open cmd write jar -xvf jarfile_name
         
