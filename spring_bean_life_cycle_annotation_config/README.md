Spring framework given 5 ways to control the life cycle events of a bean.

1)InitializingBean(void afterPropertiesSet()) and DisposableBean(void destroy()) callback interfaces.

2)There are no of Aware interfaces for specific behaviors. They are
	a)ApplicationContextAware <br/>
	b)ApplicationEventPublisherAware
	c)BeanClassLoaderAware
	d)BeanFactoryAware
	e)BeanNameAware
	f)BootstrapContextAware
	g)LoadTimeWeaverAware
	h)MessageSourceAware
	i)NotificationPublisherAware
	j)PortletConfigAware
	k)PortletContextAware
	l)ResourceLoaderAware
	m)ServletConfigAware
	n)ServletContextAware

3)using custom init and destroy methods (XML configuration)

4)using @PostConstruct and @PreDestroy annotations.

5)Using BeanPostProcessor(postProcessBeforeInitialization,postProcessAfterInitialization methods)

Normally, Spring life cycle cares about post initialization and pre destructions. It gets complex, if use all the above ways in a bean. Here is the lifecycle events order.

Bean Instantiation --> 
populate properties --> 
BeanNameAware(setBean()) --> 
BeanClassLoaderAware(setBeanClassLoader()) --> 
BeanFactoryAware(setBeanFactory()) --> 
ResourceLoaderAware(setResourceLoader()) --> 
ApplicationEventPublisherAware(setApplicationEventPublisher()) --> 
MessageSourceAware(setMessageSource()) --> 
ApplicationContextAware(setApplicationContext()) --> 
@PostConstruct(Custom intialization) --> 
InitializingBean(afterPropertiesSet()) --> 
BeanPostProcessor(postProcessBeforeInitialization()) --> 
BeanPostProcessor(postProcessAfterInitialization()) --> 
DisposableBean(destroy())
