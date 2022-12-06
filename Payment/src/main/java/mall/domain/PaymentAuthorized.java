package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentAuthorized extends AbstractEvent {

    private Long id;
    private String orderId;
    private String amount;

    public PaymentAuthorized(PaymentHistory aggregate){
        super(aggregate);
    }
    public PaymentAuthorized(){
        super();
    }
}
