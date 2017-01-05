package pk.edu.nust.seecs.gradebook.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pk.edu.nust.seecs.gradebook.gradeBo;
import pk.edu.nust.seecs.gradebook.gradeBoImpl;

/**
 *
 * @author shafiq
 */
@Configuration
@ComponentScan(basePackages={"pk.edu.nust.seecs.gradebook"})
public class SupplimentaryAnnotatedConfig {
     @Bean
    public gradeBo gradeManager() 
    {
        return new gradeBoImpl();
    }
   
}
