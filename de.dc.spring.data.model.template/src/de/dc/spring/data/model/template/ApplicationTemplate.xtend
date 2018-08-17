package de.dc.spring.data.model.template

class ApplicationTemplate implements IGenerator<Data>{
  
  def String gen()'''
  @SpringBootApplication
  public class Application {
      public static void main(String[] args) {
          SpringApplication.run(Application.class, args);
      }
  }
  '''
}
