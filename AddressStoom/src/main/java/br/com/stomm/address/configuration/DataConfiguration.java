package br.com.stomm.address.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;	
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfiguration {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource =  new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
		return dataSource;
		
	}
	
//	private Properties aditionalProperties(){
//        Properties props = new Properties();
//        props.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
//		props.setProperty("hibernate.show_sql", "true");
//		props.setProperty("hibernate.hbm2ddl.auto", "update");
//        return props;
//    }
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter(){
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.POSTGRESQL); //database que será utilizado
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true); //cria a tabela automaticamente
		adapter.setDatabasePlatform("org.hibernate.dialect.PostgreSQLDialect"); //dialeto
		adapter.setPrepareConnection(true); //prepara a conexão
		return adapter;
	}

}
