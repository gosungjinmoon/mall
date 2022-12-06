package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class PaymentDetailsValidated extends AbstractEvent {

    private Long userid;
    private String cardNumber;

    public PaymentDetailsValidated(User aggregate){
        super(aggregate);
    }
    public PaymentDetailsValidated(){
        super();
    }
}
