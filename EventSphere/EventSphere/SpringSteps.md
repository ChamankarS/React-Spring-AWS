# Installation Guide for Spring Backend Application in Ubuntu Instance

This guide provides step-by-step instructions for setting up and running a Spring backend application on Ubuntu.

## Prerequisites
- Ubuntu operating system
- Internet connection

## Instructions

1. **Update apt package index:**

    ```bash
    sudo apt update
    ```
2. **Install OpenJDK 17:**

    ```bash
    sudo apt install openjdk-17-jdk
    ```
3. **Install Maven:**

    ```bash
    sudo apt install maven
    ```

    ## Update the file with the <RDS_ENDPOINT> & DB username password
   ```bash
     cd spring-backend/src/main/resources/application.properties
    ```
    ## Update the file with the frontend Instance IP in the file with specific port
   ```bash
     cd EventSphere/EventSphere/src/main/java/com/eventmanagement/config/WebConfig.java
    ```
   
5. **Build the project using Maven:**

    ```bash
    mvn clean package -Dmaven.test.skip=true
    ```
6. **Run the application:**

    ```bash
    java -jar target/<.jar_file>
    ```
## Notes
- Make sure you have the necessary permissions to execute the commands with `sudo`.
- Ensure that you have the appropriate Java and Maven versions compatible with your Spring application.
- Adjust the file paths and application names as per your project's structure.

Feel free to modify this guide according to your specific requirements.



