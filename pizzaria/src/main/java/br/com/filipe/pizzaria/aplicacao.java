/*
 * essa classe inicia o SISTEMA!!!
 */
package br.com.filipe.pizzaria;


import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class aplicacao implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// mostra aonde carregar as configurações do sistema
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation("br.com.filipe.pizzaria.configuracoes");
		
		//As requisições batem neste servlet context e ele redireciona elas...	
		Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(webApplicationContext));
		appServlet.setLoadOnStartup(1);// starta no começo
		appServlet.addMapping("/app/*");// quais url ele estará ouvindo
		
		// listner do spring
		servletContext.addListener(new ContextLoaderListener(webApplicationContext));
		
		
		//filtro para ser usado com metodo que vê a necessidade da view na hora de extrair informações no BD, controla requisicoes
		FilterRegistration.Dynamic filter = servletContext.addFilter("openEntityManagerFilter", buildOpenEntityManagerFilter());
		filter.addMappingForUrlPatterns(getDispatcherTypes(), false, "/*");
		
	}
	
	//metodo analiza o que vai precisar ser extraido no BD com base nas necessidades da view
	private OpenEntityManagerInViewFilter buildOpenEntityManagerFilter() {
		OpenEntityManagerInViewFilter openEntityManagerInViewFilter = new OpenEntityManagerInViewFilter();
		openEntityManagerInViewFilter.setEntityManagerFactoryBeanName("entityManagerFactory");
		return openEntityManagerInViewFilter;
	}
	
	//mostra qual tipo de requisições irão passar pelo filtro
	private EnumSet<DispatcherType> getDispatcherTypes() {
		return EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.ASYNC);
	}

}
