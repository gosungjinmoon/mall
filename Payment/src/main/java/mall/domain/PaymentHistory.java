package mall.domain;

import mall.domain.PaymentAuthorized;
import mall.domain.PaymentCancelled;
import mall.PaymentApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="PaymentHistory_table")
@Data

public class PaymentHistory  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private Long amount;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String paymentMeothod;

    @PostPersist
    public void onPostPersist(){


        PaymentAuthorized paymentAuthorized = new PaymentAuthorized(this);
        paymentAuthorized.publishAfterCommit();



        PaymentCancelled paymentCancelled = new PaymentCancelled(this);
        paymentCancelled.publishAfterCommit();

    }

    public static PaymentHistoryRepository repository(){
        PaymentHistoryRepository paymentHistoryRepository = PaymentApplication.applicationContext.getBean(PaymentHistoryRepository.class);
        return paymentHistoryRepository;
    }




    public static void paymentRequest(OrderCancelled orderCancelled){

        /** Example 1:  new item 
        PaymentHistory paymentHistory = new PaymentHistory();
        repository().save(paymentHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCancelled.get???()).ifPresent(paymentHistory->{
            
            paymentHistory // do something
            repository().save(paymentHistory);


         });
        */

        
    }
    public static void paymentRequest(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        PaymentHistory paymentHistory = new PaymentHistory();
        repository().save(paymentHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(paymentHistory->{
            
            paymentHistory // do something
            repository().save(paymentHistory);


         });
        */

        
    }


}
