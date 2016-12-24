Spring With XML and Annotation is another way of wiring the application.

There are three main annotations given in spring that helps finding the components(beans)  inside our application. They are called as stereotype annotations. They are @Component, @Service, @Repository. Functionally they are all same. Both Service and Repository extend Component. Anything inside our application we want to mark as a bean we use Component. @Service typically used to represent business logic layer. @Repository typically used to represent data layer.

Spring needs a place to boot strap the annotation scanner. In this example we do it from application context xml file.

To work with annotations, we need context namespace in addition to beans. once context namespace is added, we need two make the following changes.

&lt;context:annotation-config/&gt; 
&lt;context:component-scan base-package="com.springsample"/&gt;

The first configuration indicates that the application is configured using annotations.
The second configuration indicates where to check for those annotations.


