package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long menuId;
    private String phoneNo;
    private String status;

    public CookStarted(OrderProcessing aggregate){
        super(aggregate);
    }
    public CookStarted(){
        super();
    }
}
