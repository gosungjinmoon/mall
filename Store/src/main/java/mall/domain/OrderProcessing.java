package mall.domain;

import mall.domain.OrderAccpted;
import mall.domain.CookStarted;
import mall.domain.OrderRejected;
import mall.domain.CookFinished;
import mall.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="OrderProcessing_table")
@Data

public class OrderProcessing  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Long menuId;
    
    
    
    
    
    private Integer orderStatus;
    
    
    
    
    
    private String options;

    @PostPersist
    public void onPostPersist(){


        OrderAccpted orderAccpted = new OrderAccpted(this);
        orderAccpted.publishAfterCommit();



        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();



        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }

    public static OrderProcessingRepository repository(){
        OrderProcessingRepository orderProcessingRepository = StoreApplication.applicationContext.getBean(OrderProcessingRepository.class);
        return orderProcessingRepository;
    }




    public static void updateStatus(PaymentAuthorized paymentAuthorized){

        /** Example 1:  new item 
        OrderProcessing orderProcessing = new OrderProcessing();
        repository().save(orderProcessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentAuthorized.get???()).ifPresent(orderProcessing->{
            
            orderProcessing // do something
            repository().save(orderProcessing);


         });
        */

        
    }
    public static void updateStatus(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        OrderProcessing orderProcessing = new OrderProcessing();
        repository().save(orderProcessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(orderProcessing->{
            
            orderProcessing // do something
            repository().save(orderProcessing);


         });
        */

        
    }
    public static void orderCancel(PaymentCancelled paymentCancelled){

        /** Example 1:  new item 
        OrderProcessing orderProcessing = new OrderProcessing();
        repository().save(orderProcessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCancelled.get???()).ifPresent(orderProcessing->{
            
            orderProcessing // do something
            repository().save(orderProcessing);


         });
        */

        
    }
    public static void orderCancel(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        OrderProcessing orderProcessing = new OrderProcessing();
        repository().save(orderProcessing);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(orderProcessing->{
            
            orderProcessing // do something
            repository().save(orderProcessing);


         });
        */

        
    }


}
