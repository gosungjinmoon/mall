package mall.common;


import mall.FoodDeliveryAppApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FoodDeliveryAppApplication.class })
public class CucumberSpingConfiguration {
    
}
