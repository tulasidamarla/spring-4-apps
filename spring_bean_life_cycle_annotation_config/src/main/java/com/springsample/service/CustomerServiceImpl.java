package com.springsample.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.stereotype.Service;

import com.springsample.model.Customer;
import com.springsample.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService, InitializingBean, DisposableBean,ApplicationContextAware,
											ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
											BeanNameAware, LoadTimeWeaverAware, MessageSourceAware,
											NotificationPublisherAware, ResourceLoaderAware, BeanPostProcessor {
	
	
	private CustomerRepository customerRepository;
	
	@PostConstruct
    public void postConstruct() 
    {
        System.out.println("Method postConstruct() invoked...");
    }
     
    @PreDestroy
    public void preDestroy() 
    {
        System.out.println("Method preDestroy() invoked...");
    }
    
    
    @Override
	public void destroy() throws Exception {
		
		System.out.println("Method destory() of DisposableBean");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Method afterPropertiesSet() of InitializingBean");
		
	}
	
	
	@Override
	public void setResourceLoader(ResourceLoader arg0) {
		System.out.println("Method setResourceLoader()");
		
	}

	@Override
	public void setNotificationPublisher(NotificationPublisher arg0) {
		System.out.println("Method setNotificationPublisher()");
		
	}

	@Override
	public void setMessageSource(MessageSource arg0) {
		System.out.println("Method setMessageSource()");
		
	}

	@Override
	public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
		System.out.println("Method setLoadTimeWeaver()");		
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("Method setBeanName()");		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("Method setBeanFactory()");		
	}

	@Override
	public void setBeanClassLoader(ClassLoader arg0) {
		System.out.println("Method setBeanClassLoader()");		
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		System.out.println("Method setApplicationEventPublisher()");		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("Method setApplicationContext()");		
	}
	
    
	
    
	@Override
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository repository) {
		System.out.println("<---------------customer repository property set --------->");
		this.customerRepository = repository;
		
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Method postProcessAfterInitialization " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("Method postProcessBeforeInitialization " + arg1);

		return arg0;
	}

	

	

}
