Spring framework given 5 ways to control the life cycle events of a bean.

1)InitializingBean(void afterPropertiesSet()) and DisposableBean(void destroy()) callback interfaces. <br/>
2)There are no of Aware interfaces for specific behaviors. They are <br/>
	a)ApplicationContextAware <br/>
	b)ApplicationEventPublisherAware <br/>
	c)BeanClassLoaderAware <br/>
	d)BeanFactoryAware <br/>
	e)BeanNameAware <br/>
	f)BootstrapContextAware <br/>
	g)LoadTimeWeaverAware <br/>
	h)MessageSourceAware <br/>
	i)NotificationPublisherAware <br/>
	j)PortletConfigAware <br/>
	k)PortletContextAware <br/>
	l)ResourceLoaderAware <br/>
	m)ServletConfigAware <br/>
	n)ServletContextAware <br/>
3)using custom init and destroy methods (XML configuration) <br/>
4)using @PostConstruct and @PreDestroy annotations. <br/>
5)Using BeanPostProcessor(postProcessBeforeInitialization,postProcessAfterInitialization methods). <br/> 

Normally, Spring life cycle cares about post initialization and pre destructions. It gets complex, if use all the above ways in a bean. Here is the lifecycle events order.

Bean Instantiation <br/> 
populate properties <br/> 
BeanNameAware(setBean()) <br/> 
BeanClassLoaderAware(setBeanClassLoader()) <br/> 
BeanFactoryAware(setBeanFactory()) <br/> 
ResourceLoaderAware(setResourceLoader()) <br/> 
ApplicationEventPublisherAware(setApplicationEventPublisher()) <br/> 
MessageSourceAware(setMessageSource()) <br/> 
ApplicationContextAware(setApplicationContext()) <br/> 
@PostConstruct(Custom intialization) <br/> 
InitializingBean(afterPropertiesSet()) <br/> 
BeanPostProcessor(postProcessBeforeInitialization()) <br/>
BeanPostProcessor(postProcessAfterInitialization()) <br/> 
DisposableBean(destroy())
