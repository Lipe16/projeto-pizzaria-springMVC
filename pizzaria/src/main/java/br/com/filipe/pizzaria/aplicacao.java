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
		// mostra aonde carregar as configura��es do sistema
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation("br.com.filipe.pizzaria.configuracoes");
		
		//As requisi��es batem neste servlet context e ele redireciona elas...	
		Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(webApplicationContext));
		appServlet.setLoadOnStartup(1);// starta no come�o
		appServlet.addMapping("/app/*");// quais url ele estar� ouvindo
		
		// listner do spring
		servletContext.addListener(new ContextLoaderListener(webApplicationContext));
		
		FilterRegistration.Dynamic filter = servletContext.addFilter("openEntityManagerFilter", buildOpenEntityManagerFilter());
		filter.addMappingForUrlPatterns(getDispatcherTypes(), false, "/app/*");
		
	}
	
	private OpenEntityManagerInViewFilter buildOpenEntityManagerFilter() {
		OpenEntityManagerInViewFilter openEntityManagerInViewFilter = new OpenEntityManagerInViewFilter();
		openEntityManagerInViewFilter.setEntityManagerFactoryBeanName("entityManagerFactory");
		return openEntityManagerInViewFilter;
	}
	
	private EnumSet<DispatcherType> getDispatcherTypes() {
		return EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE, DispatcherType.ASYNC);
	}

}
