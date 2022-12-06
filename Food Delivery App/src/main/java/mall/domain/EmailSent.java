package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class EmailSent extends AbstractEvent {

    private Long userId;
    private String email;

    public EmailSent(User aggregate){
        super(aggregate);
    }
    public EmailSent(){
        super();
    }
}
