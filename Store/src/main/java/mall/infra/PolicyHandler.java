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
    @Autowired OrderProcessingRepository orderProcessingRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PaymentAuthorized'")
    public void wheneverPaymentAuthorized_UpdateStatus(@Payload PaymentAuthorized paymentAuthorized){

        PaymentAuthorized event = paymentAuthorized;
        System.out.println("\n\n##### listener UpdateStatus : " + paymentAuthorized + "\n\n");


        

        // Sample Logic //
        OrderProcessing.updateStatus(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCancelled'")
    public void wheneverOrderCancelled_UpdateStatus(@Payload OrderCancelled orderCancelled){

        OrderCancelled event = orderCancelled;
        System.out.println("\n\n##### listener UpdateStatus : " + orderCancelled + "\n\n");


        

        // Sample Logic //
        OrderProcessing.updateStatus(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PaymentCancelled'")
    public void wheneverPaymentCancelled_OrderCancel(@Payload PaymentCancelled paymentCancelled){

        PaymentCancelled event = paymentCancelled;
        System.out.println("\n\n##### listener OrderCancel : " + paymentCancelled + "\n\n");


        

        // Sample Logic //
        OrderProcessing.orderCancel(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCancelled'")
    public void wheneverOrderCancelled_OrderCancel(@Payload OrderCancelled orderCancelled){

        OrderCancelled event = orderCancelled;
        System.out.println("\n\n##### listener OrderCancel : " + orderCancelled + "\n\n");


        

        // Sample Logic //
        OrderProcessing.orderCancel(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_DuplicateOrders(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener DuplicateOrders : " + orderPlaced + "\n\n");


        

        // Sample Logic //

        

    }

}


