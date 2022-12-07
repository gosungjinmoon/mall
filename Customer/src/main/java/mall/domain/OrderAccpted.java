package mall.domain;

import mall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderAccpted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String menuId;
    private String phoneNo;
    private String status;
    private String deliveryAddress;
}
