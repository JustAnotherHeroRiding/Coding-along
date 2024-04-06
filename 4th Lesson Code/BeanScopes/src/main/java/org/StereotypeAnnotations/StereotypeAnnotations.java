package org.StereotypeAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// This indicates that this Spring Bean is a service and there is business logic inside
@Service
class BusinessService {

    public void doProcessing() {
        System.out.println("Processing task");
    }
}

// This class interacts with the database
@Repository
class DBdataService {
    public int[] retrieveData() {
        return new int[] { 11, 22, 33, 44, 55 };
    }
}

@Configuration
public class StereotypeAnnotations {

    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(StereotypeAnnotations.class);)

        {
        }
    }

}
