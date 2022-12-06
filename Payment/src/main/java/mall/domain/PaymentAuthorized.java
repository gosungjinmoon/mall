package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentAuthorized extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Double amount;

    public PaymentAuthorized(PaymentHistory aggregate){
        super(aggregate);
    }
    public PaymentAuthorized(){
        super();
    }
}
