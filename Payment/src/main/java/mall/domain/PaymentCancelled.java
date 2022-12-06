package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentCancelled extends AbstractEvent {

    private Long id;

    public PaymentCancelled(PaymentHistory aggregate){
        super(aggregate);
    }
    public PaymentCancelled(){
        super();
    }
}
