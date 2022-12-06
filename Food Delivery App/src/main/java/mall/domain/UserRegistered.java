package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class UserRegistered extends AbstractEvent {

    private Long userId;
    private String userName;
    private String email;
    private String homeAddress;
    private String cardNumber;
    private String phoneNumber;

    public UserRegistered(User aggregate){
        super(aggregate);
    }
    public UserRegistered(){
        super();
    }
}
