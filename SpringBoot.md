# Spring-Boot
* It has embedded server, no need of creating war and deploy in jboss, tomcat, websphere, etc...
* We can directly deploy the jar file in any of the server. It's a production ready code.
* Spring-boot will configure automatically, if we want to customize the configurations, we can do it thry application.properties    

#### Dependency Injection
* Inversion of Control: We are giving a control from yourself to the framework you are using. Suppose if we are using Spring framework then it means we are giving control to create an object.  
* To implement Inversion of Control, we use dependency injection pattern. 

#### Annotations:
* @SpringBootApplication - This annotation has @SpringBootConfiguration, @EnableAutoConfiguration, @ComponentScan   
* @Controller - This annotation has @Component. No need to declare @component separately  
* @RestController - this will always return a @ResponseBody
* @GetMapping - This annotation has @RequestMapping(value = "/", method = RequestMethod.GET)


#### Adding loggers:
*     private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

#### Project Lombok:
*     Some annotations are:
      @Data
      @NoArgsConstructor
      @AllArgsConstructor
      @Builder

#### Exception Handling:
      class XXXXX extends Exception
      class XXXXX extends ResponseEntityExceptionHandler
