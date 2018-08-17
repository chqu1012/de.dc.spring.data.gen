package de.dc.spring.data.model.template.security

class SecurityConfigTemplate implements IGenerator<Data>{
  
  def String gen()'''
  @Configuration
  @EnableWebSecurity
  public class %NAME%SecurityConfig extends WebSecurityConfigurerAdapter {

      @Override
      protected void configure(HttpSecurity http) throws Exception {
          http.authorizeRequests()
              .anyRequest()
              .permitAll()
              .and().csrf().disable();
      }
  }
  '''
}
