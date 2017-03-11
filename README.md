# jsf-spring-hibernate
### Customer-Order is a sample web module developed using *jsf-spring-jpa* technologies.
This project helps to build a production class project without any extra efforts develop base structure.
This project implements the application flow for both the public functions and private functions. 
Below non-functional requirements are implemented, so developers can entirely focus on module development.
1. Spring Security 
2. Spring AOP for Logging
3. Exception Handling
4. Transaction Management


*JaCoCo*, has been added to generate the code coverage report. This can be integrated to SonarQube to analyze the code quality.

This module consists of three basic functions which are necessary for any standard web application
1. Registration
2. Login
3. CRUD Operations

Spring-JSF integration used at presentation layer and Spring-JPA used at persistance layer.
Technology stack:
1. Java 8
2. JSF
3. Spring
3. JPA
4. Hibernate

Testing Frameworks
1. Unit Testing
.* Junit
.* Mockito
2. Functional Testing
.* Selenium

System Requirements:
1. Maven 3.5
2. Tomcat 8.5
3. Database is vendor independent (Change the JDBC URL, Hibernate dialect, JDBC Driver based the Database vendor in dataaccess.properties)


