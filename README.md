
The main advantage of using spring is to remove configuration code from your application.

Why is configuration code is such a bad thing in your application?

Configuration make things harder to move application to different environments.Also, we 
do only unit tests because its very hard to test our code base because of the complexity.
It is actually not the complexity of the code that makes testing the application hard, but the way it was written. It means the configuration is hard. References like JNDI, Jdbc etc. These configuration code often have nothing to do with normal flow of business logic.

To add Spring Framework to the code, Just copy the maven dependency from spring website 
(http://projects.spring.io/spring-framework/) and add it to pom.xml.

Adding the depedency to pom.xml, will download the following maven dependencies to the project.

    spring-context
    spring-aop
    spring-beans
    spring-core
    commons-logging
    spring-expression

This example demo spring using XML configuration. XML configuration is the first approach when spring started. There is a sepeartion of concerns that happen when configuration code is removed from code and placed in a seperate XML. This helps in changing your configuration file for different environments without recompiling the code. This technique is called seperation of concerns.

Spring provides different name spaces that aid in configuration and validation of the application.

    
