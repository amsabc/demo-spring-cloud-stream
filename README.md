# demo-spring-cloud-stream

```
/Library/Java/Home/bin/java -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=61941 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -Djava.rmi.server.hostname=127.0.0.1 -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=61942:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/Home/jre/lib/charsets.jar:/Library/Java/Home/jre/lib/deploy.jar:/Library/Java/Home/jre/lib/ext/cldrdata.jar:/Library/Java/Home/jre/lib/ext/dnsns.jar:/Library/Java/Home/jre/lib/ext/jaccess.jar:/Library/Java/Home/jre/lib/ext/jfxrt.jar:/Library/Java/Home/jre/lib/ext/localedata.jar:/Library/Java/Home/jre/lib/ext/nashorn.jar:/Library/Java/Home/jre/lib/ext/sunec.jar:/Library/Java/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/Home/jre/lib/ext/zipfs.jar:/Library/Java/Home/jre/lib/javaws.jar:/Library/Java/Home/jre/lib/jce.jar:/Library/Java/Home/jre/lib/jfr.jar:/Library/Java/Home/jre/lib/jfxswt.jar:/Library/Java/Home/jre/lib/jsse.jar:/Library/Java/Home/jre/lib/management-agent.jar:/Library/Java/Home/jre/lib/plugin.jar:/Library/Java/Home/jre/lib/resources.jar:/Library/Java/Home/jre/lib/rt.jar:/Library/Java/Home/lib/ant-javafx.jar:/Library/Java/Home/lib/dt.jar:/Library/Java/Home/lib/javafx-mx.jar:/Library/Java/Home/lib/jconsole.jar:/Library/Java/Home/lib/packager.jar:/Library/Java/Home/lib/sa-jdi.jar:/Library/Java/Home/lib/tools.jar:/Users/asaikali/git/playground/demo-spring-cloud-stream/target/classes:/Users/asaikali/.m2/repository/org/springframework/boot/spring-boot-starter-amqp/2.0.2.RELEASE/spring-boot-starter-amqp-2.0.2.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/boot/spring-boot-starter/2.0.2.RELEASE/spring-boot-starter-2.0.2.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/boot/spring-boot/2.0.2.RELEASE/spring-boot-2.0.2.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.0.2.RELEASE/spring-boot-starter-logging-2.0.2.RELEASE.jar:/Users/asaikali/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/asaikali/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/asaikali/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.10.0/log4j-to-slf4j-2.10.0.jar:/Users/asaikali/.m2/repository/org/apache/logging/log4j/log4j-api/2.10.0/log4j-api-2.10.0.jar:/Users/asaikali/.m2/repository/org/slf4j/jul-to-slf4j/1.7.25/jul-to-slf4j-1.7.25.jar:/Users/asaikali/.m2/repository/javax/annotation/javax.annotation-api/1.3.2/javax.annotation-api-1.3.2.jar:/Users/asaikali/.m2/repository/org/yaml/snakeyaml/1.19/snakeyaml-1.19.jar:/Users/asaikali/.m2/repository/org/springframework/spring-messaging/5.0.6.RELEASE/spring-messaging-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/spring-beans/5.0.6.RELEASE/spring-beans-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/amqp/spring-rabbit/2.0.3.RELEASE/spring-rabbit-2.0.3.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/amqp/spring-amqp/2.0.3.RELEASE/spring-amqp-2.0.3.RELEASE.jar:/Users/asaikali/.m2/repository/com/rabbitmq/amqp-client/5.1.2/amqp-client-5.1.2.jar:/Users/asaikali/.m2/repository/org/springframework/spring-context/5.0.6.RELEASE/spring-context-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/spring-expression/5.0.6.RELEASE/spring-expression-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/spring-tx/5.0.6.RELEASE/spring-tx-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/spring-web/5.0.6.RELEASE/spring-web-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/cloud/spring-cloud-stream/2.0.0.RELEASE/spring-cloud-stream-2.0.0.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.0.2.RELEASE/spring-boot-starter-validation-2.0.2.RELEASE.jar:/Users/asaikali/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/8.5.31/tomcat-embed-el-8.5.31.jar:/Users/asaikali/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.9.Final/hibernate-validator-6.0.9.Final.jar:/Users/asaikali/.m2/repository/javax/validation/validation-api/2.0.1.Final/validation-api-2.0.1.Final.jar:/Users/asaikali/.m2/repository/org/jboss/logging/jboss-logging/3.3.2.Final/jboss-logging-3.3.2.Final.jar:/Users/asaikali/.m2/repository/com/fasterxml/classmate/1.3.4/classmate-1.3.4.jar:/Users/asaikali/.m2/repository/org/springframework/integration/spring-integration-core/5.0.5.RELEASE/spring-integration-core-5.0.5.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/spring-aop/5.0.6.RELEASE/spring-aop-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/io/projectreactor/reactor-core/3.1.7.RELEASE/reactor-core-3.1.7.RELEASE.jar:/Users/asaikali/.m2/repository/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar:/Users/asaikali/.m2/repository/org/springframework/integration/spring-integration-jmx/5.0.5.RELEASE/spring-integration-jmx-5.0.5.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/spring-tuple/1.0.0.RELEASE/spring-tuple-1.0.0.RELEASE.jar:/Users/asaikali/.m2/repository/com/esotericsoftware/kryo-shaded/3.0.3/kryo-shaded-3.0.3.jar:/Users/asaikali/.m2/repository/com/esotericsoftware/minlog/1.3.0/minlog-1.3.0.jar:/Users/asaikali/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.9.3/jackson-databind-2.9.3.jar:/Users/asaikali/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.9.0/jackson-annotations-2.9.0.jar:/Users/asaikali/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.9.3/jackson-core-2.9.3.jar:/Users/asaikali/.m2/repository/org/springframework/integration/spring-integration-tuple/1.0.0.RELEASE/spring-integration-tuple-1.0.0.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/retry/spring-retry/1.2.2.RELEASE/spring-retry-1.2.2.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/cloud/spring-cloud-stream-binder-rabbit/2.0.0.RELEASE/spring-cloud-stream-binder-rabbit-2.0.0.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/cloud/spring-cloud-stream-binder-rabbit-core/2.0.0.RELEASE/spring-cloud-stream-binder-rabbit-core-2.0.0.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/integration/spring-integration-amqp/5.0.5.RELEASE/spring-integration-amqp-5.0.5.RELEASE.jar:/Users/asaikali/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/Users/asaikali/.m2/repository/org/objenesis/objenesis/2.6/objenesis-2.6.jar:/Users/asaikali/.m2/repository/org/springframework/spring-core/5.0.6.RELEASE/spring-core-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/spring-jcl/5.0.6.RELEASE/spring-jcl-5.0.6.RELEASE.jar:/Users/asaikali/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.0.2.RELEASE/spring-boot-autoconfigure-2.0.2.RELEASE.jar com.example.demospringcloudstream.DemoSpringCloudStreamApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.2.RELEASE)

2018-06-14 10:51:35.807  INFO 25887 --- [           main] c.e.d.DemoSpringCloudStreamApplication   : Starting DemoSpringCloudStreamApplication on ams.local with PID 25887 (/Users/asaikali/git/playground/demo-spring-cloud-stream/target/classes started by asaikali in /Users/asaikali/git/playground/demo-spring-cloud-stream)
2018-06-14 10:51:35.819  INFO 25887 --- [           main] c.e.d.DemoSpringCloudStreamApplication   : No active profile set, falling back to default profiles: default
2018-06-14 10:51:35.871  INFO 25887 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@2aa3cd93: startup date [Thu Jun 14 10:51:35 EDT 2018]; root of context hierarchy
2018-06-14 10:51:36.216  INFO 25887 --- [           main] o.s.i.config.IntegrationRegistrar        : No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
2018-06-14 10:51:36.400  INFO 25887 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
2018-06-14 10:51:36.402  INFO 25887 --- [           main] faultConfiguringBeanFactoryPostProcessor : No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
2018-06-14 10:51:36.457  INFO 25887 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration' of type [org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration$$EnhancerBySpringCGLIB$$1aa1960e] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2018-06-14 10:51:36.519  INFO 25887 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.integration.config.IntegrationManagementConfiguration' of type [org.springframework.integration.config.IntegrationManagementConfiguration$$EnhancerBySpringCGLIB$$bf27930f] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2018-06-14 10:51:36.750  INFO 25887 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService  'taskScheduler'
2018-06-14 10:51:37.148  INFO 25887 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-06-14 10:51:37.153  INFO 25887 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'rabbitConnectionFactory' has been autodetected for JMX exposure
2018-06-14 10:51:37.154  INFO 25887 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'integrationMbeanExporter' has been autodetected for JMX exposure
2018-06-14 10:51:37.155  INFO 25887 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'integrationMbeanExporter': registering with JMX server as MBean [org.springframework.integration.monitor:name=integrationMbeanExporter,type=IntegrationMBeanExporter]
2018-06-14 10:51:37.177  INFO 25887 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'rabbitConnectionFactory': registering with JMX server as MBean [org.springframework.amqp.rabbit.connection:name=rabbitConnectionFactory,type=CachingConnectionFactory]
2018-06-14 10:51:37.184  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering beans for JMX exposure on startup
2018-06-14 10:51:37.184  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel nullChannel
2018-06-14 10:51:37.186  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=nullChannel': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=nullChannel]
2018-06-14 10:51:37.193  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel errorChannel
2018-06-14 10:51:37.193  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=errorChannel': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=errorChannel]
2018-06-14 10:51:37.211  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageChannel orders
2018-06-14 10:51:37.212  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageChannel,name=orders': registering with JMX server as MBean [org.springframework.integration:type=MessageChannel,name=orders]
2018-06-14 10:51:37.219  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Registering MessageHandler errorLogger
2018-06-14 10:51:37.219  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Located managed bean 'org.springframework.integration:type=MessageHandler,name=errorLogger,bean=internal': registering with JMX server as MBean [org.springframework.integration:type=MessageHandler,name=errorLogger,bean=internal]
2018-06-14 10:51:37.229  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase -2147482648
2018-06-14 10:51:37.230  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
2018-06-14 10:51:37.230  INFO 25887 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
2018-06-14 10:51:37.230  INFO 25887 --- [           main] o.s.i.channel.PublishSubscribeChannel    : Channel 'application.errorChannel' has 1 subscriber(s).
2018-06-14 10:51:37.230  INFO 25887 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : started _org.springframework.integration.errorLogger
2018-06-14 10:51:37.230  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147482647
2018-06-14 10:51:37.248  INFO 25887 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@7d2a6eac: startup date [Thu Jun 14 10:51:37 EDT 2018]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@2aa3cd93
2018-06-14 10:51:37.285  INFO 25887 --- [           main] o.s.c.support.GenericApplicationContext  : Refreshing org.springframework.context.support.GenericApplicationContext@15515c51: startup date [Thu Jun 14 10:51:37 EDT 2018]; root of context hierarchy
2018-06-14 10:51:37.407  INFO 25887 --- [           main] c.s.b.r.p.RabbitExchangeQueueProvisioner : declaring queue for inbound: orders.anonymous.fwfXcPooRn62qNk0tfcaeQ, bound to: orders
2018-06-14 10:51:37.408  INFO 25887 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Attempting to connect to: [localhost:5672]
2018-06-14 10:51:37.442  INFO 25887 --- [           main] o.s.a.r.c.CachingConnectionFactory       : Created new connection: rabbitConnectionFactory#27eb3298:0/SimpleConnection@65327f5 [delegate=amqp://guest@127.0.0.1:5672/, localPort= 61950]
2018-06-14 10:51:37.499  INFO 25887 --- [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'application-1.orders.anonymous.fwfXcPooRn62qNk0tfcaeQ.errors' has 1 subscriber(s).
2018-06-14 10:51:37.500  INFO 25887 --- [           main] o.s.c.stream.binder.BinderErrorChannel   : Channel 'application-1.orders.anonymous.fwfXcPooRn62qNk0tfcaeQ.errors' has 2 subscriber(s).
2018-06-14 10:51:37.526  INFO 25887 --- [           main] o.s.i.a.i.AmqpInboundChannelAdapter      : started inbound.orders.anonymous.fwfXcPooRn62qNk0tfcaeQ
2018-06-14 10:51:37.527  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147483647
2018-06-14 10:51:37.533  INFO 25887 --- [           main] c.e.d.DemoSpringCloudStreamApplication   : Started DemoSpringCloudStreamApplication in 1.945 seconds (JVM running for 2.503)
2018-06-14 10:51:37.538  INFO 25887 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2018-06-14 10:51:37.546 ERROR 25887 --- [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalStateException: Failed to execute ApplicationRunner
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:791) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:778) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:335) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1255) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1243) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	at com.example.demospringcloudstream.DemoSpringCloudStreamApplication.main(DemoSpringCloudStreamApplication.java:12) [classes/:na]
Caused by: org.springframework.messaging.MessageDeliveryException: Dispatcher has no subscribers for channel 'application.orders'.; nested exception is org.springframework.integration.MessageDispatchingException: Dispatcher has no subscribers, failedMessage=GenericMessage [payload=test, headers={id=5f1e0b87-fc60-6827-f7d9-8836b5e77d2e, contentType=application/json, timestamp=1528987897535}]
	at org.springframework.integration.channel.AbstractSubscribableChannel.doSend(AbstractSubscribableChannel.java:77) ~[spring-integration-core-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:445) ~[spring-integration-core-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:394) ~[spring-integration-core-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at com.example.demospringcloudstream.StartupApplicationRunner.run(StartupApplicationRunner.java:23) ~[classes/:na]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:788) [spring-boot-2.0.2.RELEASE.jar:2.0.2.RELEASE]
	... 5 common frames omitted
Caused by: org.springframework.integration.MessageDispatchingException: Dispatcher has no subscribers
	at org.springframework.integration.dispatcher.UnicastingDispatcher.doDispatch(UnicastingDispatcher.java:138) ~[spring-integration-core-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.integration.dispatcher.UnicastingDispatcher.dispatch(UnicastingDispatcher.java:105) ~[spring-integration-core-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	at org.springframework.integration.channel.AbstractSubscribableChannel.doSend(AbstractSubscribableChannel.java:73) ~[spring-integration-core-5.0.5.RELEASE.jar:5.0.5.RELEASE]
	... 9 common frames omitted

2018-06-14 10:51:37.547  INFO 25887 --- [           main] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@2aa3cd93: startup date [Thu Jun 14 10:51:35 EDT 2018]; root of context hierarchy
2018-06-14 10:51:37.547  INFO 25887 --- [           main] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@7d2a6eac: startup date [Thu Jun 14 10:51:37 EDT 2018]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@2aa3cd93
2018-06-14 10:51:37.549  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase 2147483647
2018-06-14 10:51:37.549  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase 2147482647
2018-06-14 10:51:37.562  INFO 25887 --- [           main] o.s.a.r.l.SimpleMessageListenerContainer : Waiting for workers to finish.
2018-06-14 10:51:38.538  INFO 25887 --- [           main] o.s.a.r.l.SimpleMessageListenerContainer : Successfully waited for workers to finish.
2018-06-14 10:51:38.538  INFO 25887 --- [           main] o.s.i.a.i.AmqpInboundChannelAdapter      : stopped inbound.orders.anonymous.fwfXcPooRn62qNk0tfcaeQ
2018-06-14 10:51:38.538  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase 0
2018-06-14 10:51:38.540  INFO 25887 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : Removing {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
2018-06-14 10:51:38.540  INFO 25887 --- [           main] o.s.i.channel.PublishSubscribeChannel    : Channel 'application.errorChannel' has 0 subscriber(s).
2018-06-14 10:51:38.540  INFO 25887 --- [           main] o.s.i.endpoint.EventDrivenConsumer       : stopped _org.springframework.integration.errorLogger
2018-06-14 10:51:38.540  INFO 25887 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase -2147482648
2018-06-14 10:51:38.544  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Unregistering JMX-exposed beans on shutdown
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Unregistering JMX-exposed beans
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Summary on shutdown: nullChannel
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Summary on shutdown: errorChannel
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Summary on shutdown: orders
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.i.monitor.IntegrationMBeanExporter   : Summary on shutdown: _org.springframework.integration.errorLogger.handler
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans
2018-06-14 10:51:38.545  INFO 25887 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Shutting down ExecutorService 'taskScheduler'

Process finished with exit code 1
```