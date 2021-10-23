package siva.springaop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "siva.springaop")
@EnableAspectJAutoProxy
public class AccountAppConfiguration {

}
