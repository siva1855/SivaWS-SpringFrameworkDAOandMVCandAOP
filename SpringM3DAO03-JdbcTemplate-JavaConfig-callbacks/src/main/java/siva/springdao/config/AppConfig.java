package siva.springdao.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="siva.springdao")
@PropertySource("classpath:connection.properties")
public class AppConfig {
	@Autowired
	Environment  env;
	
	@Bean
	public  JdbcTemplate  jt() {
		return  new  JdbcTemplate(ds());
	}
	
	@Bean
	public  DataSource   ds() {
		DriverManagerDataSource  dmds =new  DriverManagerDataSource();
		dmds.setDriverClassName(env.getProperty("jdbc.driver"));
		dmds.setUrl(env.getProperty("jdbc.url"));
		dmds.setUsername(env.getProperty("jdbc.user"));
		dmds.setPassword(env.getProperty("jdbc.pwd"));
		return  dmds;
	}
	

}
