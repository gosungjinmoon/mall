package mall.domain;

import mall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class UserRegistered extends AbstractEvent {

    private Long userId;
    private String userName;
    private String email;
    private String homeAddress;
    private String cardNumber;
    private String phoneNumber;
}
