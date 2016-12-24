Java configuration in spring is the latest model available for wiring the application.

In this we have no application context xml. But we use Java to configure our application. This is generally named as AppConfig. Name doesn't matter. But the class should be annotated with @Configuration.

so, applicationContext.xml file is replaced by class with @Configuration annotation to bootstrap the application. @Configuration is a class level annotation. Spring Beans are defined with @Bean annotation. @Bean is at method level. For ex,


@Configuration

public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		CustomerService service = new CustomerServiceImpl();
		service.setCustomerRepository(getCustomerRepository());
		return service;
	}

	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new CustomerRepositoryImpl();
	}
}

For Autowiring, Use ComponentScan Annotation like this:

@Configuration

@ComponentScan(basePackages = {"com.springsample"})

public class AppConfigAutowire {
	
}


Bean Scopes
-----------
Spring uses some standard design patterns like (Singleton, factory etc..) to eliminate developer to write some design patterns manually and run into any issues. There are 5 bean scopes provided by spring.

Singleton (one object for the entire context. This is the default behavior)
Prototype (returns a different object for every invocation)
Request
Session
Global

Request,Session,Global are only used with web aware applications. Singleton is the default. To use these, For ex:

@Service("customerService")

@Scope("singleton")

class CustomerServiceImpl implements CustomerService{}

or 

@Service("customerService")

@Scope(ConfiguraleBeanFactory.SCOPE_SINGLETON)

class CustomerServiceImpl implements CustomerService{}
