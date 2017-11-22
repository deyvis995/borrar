package pe.edu.upeu.abcjdbc.config;

import javax.sql.DataSource;
import javax.xml.ws.BindingType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import pe.edu.upeu.abcjdbc.dao.CursoDAO;
import pe.edu.upeu.abcjdbc.dao.DocenteDAO;
import pe.edu.upeu.abcjdbc.daoImp.CursoDaoImpl;
import pe.edu.upeu.abcjdbc.daoImp.DocenteDaoImp;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="pe.edu.upeu.abcjdbc")
public class AppConfig extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bdacademico1");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
    
        return dataSource;
    }
	
	@Bean
	public DocenteDAO getContactDAO() {
		// TODO Auto-generated method stub
		return new DocenteDaoImp(getDataSource());
	}
	
	@Bean
	public CursoDAO getContactDAOcurso() {
		// TODO Auto-generated method stub
		return new CursoDaoImpl(getDataSource());
	}
}
