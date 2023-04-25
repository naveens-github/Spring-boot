####
* If we want add validation to the request body we are passing as a json for the API's. we need to add hibernate dependency which is in spring-boot-starter-validation.
* 		<dependency>    
			<groupId>org.springframework.boot</groupId>     
			<artifactId>spring-boot-starter-validation</artifactId>     
		</dependency>    
* 		We can add multiple validation like below.
		* @NotBlank(message = "Please add the departmentName")
		* @Length(max =10, min=2)
		* @Size
		* @Email
		* @Positive
		* @Negative
		* @PostiveOrZero
		* @NegativeOrZero
		* @Future
		* @FutureOrPresent
		* @Past
		* @PastOrPresent
