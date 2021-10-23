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
@ComponentScan(basePackages = "siva.springdao")
@PropertySource("classpath:application.properties")
public class AppConfig {

	@Autowired
	Environment environment;

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(environment.getProperty("jdbc.driver"));
		driverManagerDataSource.setUrl(environment.getProperty("jdbc.url"));
		driverManagerDataSource.setUsername(environment.getProperty("jdbc.username"));
		driverManagerDataSource.setPassword(environment.getProperty("jdbc.password"));
		return driverManagerDataSource;
	}
}
