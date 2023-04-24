### Spring-data-JPA docs
* https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation.
* save: save() it directly comes from JPARepository.  
* findAll: findAll() it directly comes from JPARepository.  
* findById: findById() it directly comes from JPARepository.   
* deleteById: deleteById() it directly comes from JPARepository.    
* findByDepartmentNameIgnoreCase: If we want to get the record by name, we have to create a method in repository interface which extends JPARepository.
