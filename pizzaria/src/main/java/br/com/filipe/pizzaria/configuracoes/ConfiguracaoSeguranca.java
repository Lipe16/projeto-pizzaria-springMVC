package br.com.filipe.pizzaria.configuracoes;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class ConfiguracaoSeguranca extends WebSecurityConfigurerAdapter{
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
		.inMemoryAuthentication().withUser("admin").password("admin").roles("pizzaria");
		/* 	CRIA UM USUARIO NA MEMORIA
		auth
		.inMemoryAuthentication().withUser("admin").password("admin").roles("pizzaria");
		*/
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
			http
			.authorizeRequests()
			.antMatchers("/app/*").hasRole("pizzaria")
		.and()
			.formLogin()
				.loginPage("/login.jsp")
				.loginProcessingUrl("/autenticar")
				.defaultSuccessUrl("/app/pizzas")
				.failureUrl("/login.jsp?semacesso=true")
				.usernameParameter("usuario")
				.passwordParameter("senha")
		.and()
			.logout()
			.logoutUrl("/sair")
			.logoutSuccessUrl("/login.jsp?sair=true");
			
		/* Modelo de autenticacao pronto por janela que abre no navegador
		http
			.authorizeRequests()
			.antMatchers("/app/pizzas/**", "/app/ingredientes/**").hasRole("pizzaria")
		.and()
			.httpBasic();
		*/
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}

}
