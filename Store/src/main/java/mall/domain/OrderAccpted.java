package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderAccpted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long menuId;
    private String phoneNo;
    private Long status;
    private String deliveryAddress;

    public OrderAccpted(OrderProcessing aggregate){
        super(aggregate);
    }
    public OrderAccpted(){
        super();
    }
}
