package de.dc.spring.data.model.template

class ApplicationTemplate implements IGenerator<Data>{
  
  def String gen()'''
  @EnableJpaRepositories("%PACKAGE_PATH%.repositories") 
  @EntityScan("%PACKAGE_PATH%.model")
  @SpringBootApplication
  public class %NAME%Application {
      public static void main(String[] args) {
          SpringApplication.run(%NAME%Application.class, args);
      }
  }
  '''
}
