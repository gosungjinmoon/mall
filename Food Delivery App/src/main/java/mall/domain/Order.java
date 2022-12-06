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
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private Long customerId;
    
    
    
    
    
    private Long menuId;
    
    
    
    
    
    private Integer amount;
    
    
    
    
    
    private Integer quantity;
    
    
    
    
    
    private Long storeId;

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
