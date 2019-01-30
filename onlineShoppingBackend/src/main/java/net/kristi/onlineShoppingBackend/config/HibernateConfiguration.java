package net.kristi.onlineShoppingBackend.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"net.kristi.onlineShoppingBackend.dto"})
@EnableTransactionManagement
public class HibernateConfiguration {
	
	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/onlineShopping";
	private final static String DATABASE_DRIVER = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "root";
	private final static String DATABASE_PASSWORD = "root";

	

}
