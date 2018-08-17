package de.dc.spring.data.model.template

class ConfigTemplate implements IGenerator<Data>{
  
  def String gen()'''
  // Thymeleaf
  spring.thymeleaf.cache=false
  spring.thymeleaf.enabled=true
  spring.thymeleaf.prefix=classpath:/templates/
  spring.thymeleaf.suffix=.html

  // Data Source
  spring.datasource.driver-class-name=org.h2.Driver
  spring.datasource.url=jdbc:h2:mem:bootapp;DB_CLOSE_DELAY=-1
  spring.datasource.username=sa
  spring.datasource.password=

  // Application
  spring.application.name=Bootstrap Spring Boot
  '''
}
