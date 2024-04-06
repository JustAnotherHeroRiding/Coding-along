package org.JakartaAPI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService {
    private DataService dataService;

    // @Autowired
    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setter injection");
        this.dataService = dataService;
    }

    public DataService getDataService() {
        return dataService;
    }
}

// @Component
@Named
class DataService {
}

@Configuration
@ComponentScan
public class JakartaContextDI {

    public static void launchContext(String[] args) {
        try (

                var context = new AnnotationConfigApplicationContext(JakartaContextDI.class);) {
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }

    }

}
