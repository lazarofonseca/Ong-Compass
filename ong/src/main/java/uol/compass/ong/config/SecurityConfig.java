package uol.compass.ong.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import uol.compass.ong.services.impl.UsuarioServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UsuarioServiceImpl usuarioServiceImpl;

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
        	.userDetailsService(usuarioServiceImpl)
        	.passwordEncoder(passwordEncoder());
    }

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
	      .csrf().disable()
	      .authorizeRequests()
	      	.antMatchers(HttpMethod.POST, "/**").permitAll()
	          .antMatchers("/animais/**").permitAll()
	          .antMatchers("/swagger-ui/**").permitAll()
	          .antMatchers("/enderecos/**").hasRole("ADMIN")
	          .antMatchers("/resgates/**").hasRole("ADMIN")
	          .antMatchers(HttpMethod.POST, "/usuarios/**").permitAll()
//	      .antMatchers("/usuarios/**").hasRole("ADMIN")
	          .anyRequest().authenticated()
	      .and()
	          .httpBasic();
	}
}
