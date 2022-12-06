package mall.domain;

import mall.domain.OrderPlaced;
import mall.domain.OrderCancelled;
import mall.FoodDeliveryAppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private Long amount;
    
    
    
    
    
    private Long quantity;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String options;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FoodDeliveryAppApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
