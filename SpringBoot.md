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
      
#### MySql properties & Dependency
      spring.jpa.hibernate.ddl-auto=update
      spring.datasource.url=jdbc:mysql://localhost:3306/dcbapp
      spring.datasource.driverClassName=com.mysql.jdbc.Driver
      spring.datasource.username=root
      spring.datasource.password=XXXX
      spring.jpa.show-sql: true
      
      Dependency:
      <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
	</dependency>

#### Unit testing:
      Repository layer
      service layer
      controller layer 
      
	* Annotations:
		@BeforeEach		
		@BeforeAll		
		@Test		
		@SpringBootTest			
		@DataJpaTest		
		@WebMvcTest		
		@MockBean	
		@DisplayName("")
		@Disabled
	
#### Adding config in properties file.
	* Application.properties => welcome.message = Welcome to my project!
	* class level =>        @Value("${welcome.message}")
    				private String welcomeMessage;
				
#### Adding application.yml
	* It is also a default file supported by springboot.	
	* It's human readable file.	
	* It reduces the duplicate values.	

#### Springboot profiles:
	* Normally, we can create different yml files for different environments. 
	* Ex: for dev-> application-dev.yml
	* we can create a new document in yml file by using 3 hyphens(---)

#### Running springboot with multiple profiles:
	* Go to target folder: java -jar Spring-boot-1.0.0.jar --spring.profiles.active=prod
