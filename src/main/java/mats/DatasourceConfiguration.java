package mats;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public CustomBean someOtherBeanThatDependsOnDataSource() {
        return new CustomBean(dataSource()); // <-- Invoking dataSource() here throws exception
    }
}
