package mall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import mall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import mall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    @Autowired UserRepository userRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='UserRegistered'")
    public void wheneverUserRegistered_SendEmail(@Payload UserRegistered userRegistered){

        UserRegistered event = userRegistered;
        System.out.println("\n\n##### listener SendEmail : " + userRegistered + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='UserRegistered'")
    public void wheneverUserRegistered_ValidPaymentDetails(@Payload UserRegistered userRegistered){

        UserRegistered event = userRegistered;
        System.out.println("\n\n##### listener ValidPaymentDetails : " + userRegistered + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Picked'")
    public void wheneverPicked_ChangeOrderStatus(@Payload Picked picked){

        Picked event = picked;
        System.out.println("\n\n##### listener ChangeOrderStatus : " + picked + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_ChangeOrderStatus(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener ChangeOrderStatus : " + delivered + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccpted'")
    public void wheneverOrderAccpted_ChangeOrderStatus(@Payload OrderAccpted orderAccpted){

        OrderAccpted event = orderAccpted;
        System.out.println("\n\n##### listener ChangeOrderStatus : " + orderAccpted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_ChangeOrderStatus(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener ChangeOrderStatus : " + orderRejected + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_ChangeOrderStatus(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener ChangeOrderStatus : " + cookStarted + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookFinished'")
    public void wheneverCookFinished_ChangeOrderStatus(@Payload CookFinished cookFinished){

        CookFinished event = cookFinished;
        System.out.println("\n\n##### listener ChangeOrderStatus : " + cookFinished + "\n\n");


        

        // Sample Logic //

        

    }

}


