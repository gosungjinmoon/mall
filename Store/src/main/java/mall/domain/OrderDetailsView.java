package mall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderDetailsView_table")
@Data
public class OrderDetailsView {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}
