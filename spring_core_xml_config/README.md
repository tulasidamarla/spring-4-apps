Spring helps in reducing the configuration code using autowiring.

Spring Autowiring can be set in 4 ways.
  
    byName
    byType
    constructor
    No

Ex:

      <bean name="customerRepository" class="com.springsample.repository.CustomerRepositoryImpl"/>
      <bean name="customerService" class="com.springsample.service.CustomerServiceImpl" autowire="byName"/>

Note: If there are two beans of same type when using byType, an exception is thrown.


