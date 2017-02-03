Spring helps in reducing the configuration code using autowiring.

Spring Autowiring can be set in 4 ways.
  
    byName
    byType
    constructor
    No

Ex:

      &lt;bean name="customerRepository" class="com.springsample.repository.CustomerRepositoryImpl" /&gt;
      &lt;bean name="customerService" class="com.springsample.service.CustomerServiceImpl" autowire="byName"/&gt;

Note: If you have two beans of same type when using byType, you will get an exception.


