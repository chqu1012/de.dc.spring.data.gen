package de.dc.spring.data.model.template.login

class SecSecurityConfigTemplate implements IGenerator<Data>{
  
  def String gen()'''
  @Configuration
  @EnableWebSecurity
  public class SecSecurityConfig extends WebSecurityConfigurerAdapter {
      @Override
      protected void configure(AuthenticationManagerBuilder auth) throws Exception {
          auth.inMemoryAuthentication()
            .withUser("user1").password(passwordEncoder().encoder("user1Pass")).roles("USER");
      }

      @Override
      protected void configure(HttpSecurity http) throws Exception {
          http
            .authorizeRequests()
            .antMatchers("/login*").anonymous()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login.html")
            .defaultSuccessUrl("/homepage.html")
            .failureUrl("/login.html?error=true")
            .and()
            .logout().logoutSuccessUrl("/login.html");
      }

      @Bean
      public PasswordEncoder passwordEncoder() {
          return new BCryptPasswordEncoder();
      }
  }
  '''
}
