package br.com.darius.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfiguracaoProjeto {
	
	public static void main(String args[]) {
		SpringApplication.run(ConfiguracaoProjeto.class, args);
	}

	/* Por conta do arquivo de propriedades posso remover essa parte de config... q do caraalhhoooo!!!
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/listavip_schema");
	    dataSource.setUsername("root");
	    dataSource.setPassword("welcome1");
	    return dataSource;
	}*/
}
