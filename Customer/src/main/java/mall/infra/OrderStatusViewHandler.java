package mall.infra;

import mall.domain.*;
import mall.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class OrderStatusViewHandler {


    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            OrderStatus orderStatus = new OrderStatus();
            // view 객체에 이벤트의 Value 를 set 함
            orderStatus.setId(orderPlaced.getId());
            // view 레파지 토리에 save
            orderStatusRepository.save(orderStatus);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderAccpted_then_UPDATE_1(@Payload OrderAccpted orderAccpted) {
        try {
            if (!orderAccpted.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(orderAccpted.getId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setId(Long.valueOf(orderAccpted.getOrderId()));    
                orderStatus.setCustomerId(String.valueOf(orderAccpted.getId()));    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookStarted_then_UPDATE_2(@Payload CookStarted cookStarted) {
        try {
            if (!cookStarted.validate()) return;
                // view 객체 조회
            Optional<OrderStatus> orderStatusOptional = orderStatusRepository.findById(cookStarted.getId());

            if( orderStatusOptional.isPresent()) {
                 OrderStatus orderStatus = orderStatusOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setId(Long.valueOf(cookStarted.getOrderId()));    
                orderStatus.setCustomerId(String.valueOf(cookStarted.getId()));    
                // view 레파지 토리에 save
                 orderStatusRepository.save(orderStatus);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenUserRegistered_then_DELETE_1(@Payload UserRegistered userRegistered) {
        try {
            if (!userRegistered.validate()) return;
            // view 레파지 토리에 삭제 쿼리
            orderStatusRepository.deleteById(userRegistered.getUserId());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

