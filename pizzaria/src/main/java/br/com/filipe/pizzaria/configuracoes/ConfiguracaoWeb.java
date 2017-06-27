package br.com.filipe.pizzaria.configuracoes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages="br.com.filipe.pizzaria")// diz ao spring quais classes scanear
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter{
	
	// viewResouver pega a requisi��o spring e vai procurar as paginas que precisam ser renderizadas
	// para apresentar uma view especifica
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// precura views baseadas no url
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		//jstl � o c�digo java na sua forma html (for, if...)
		viewResolver.setViewClass(JstlView.class);
		registry.viewResolver(viewResolver);
	}

}
