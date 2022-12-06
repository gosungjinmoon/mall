package mall.domain;

import mall.domain.UserRegistered;
import mall.domain.EmailSent;
import mall.domain.PaymentDetailsValidated;
import mall.FoodDeliveryAppApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="User_table")
@Data

public class User  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long userId;
    
    
    
    
    
    private String userName;
    
    
    
    
    
    private String email;
    
    
    
    
    
    private String homeAddress;
    
    
    
    
    
    private String cardNumber;
    
    
    
    
    
    private String phoneNumber;

    @PostPersist
    public void onPostPersist(){


        UserRegistered userRegistered = new UserRegistered(this);
        userRegistered.publishAfterCommit();



        EmailSent emailSent = new EmailSent(this);
        emailSent.publishAfterCommit();



        PaymentDetailsValidated paymentDetailsValidated = new PaymentDetailsValidated(this);
        paymentDetailsValidated.publishAfterCommit();

    }

    public static UserRepository repository(){
        UserRepository userRepository = FoodDeliveryAppApplication.applicationContext.getBean(UserRepository.class);
        return userRepository;
    }






}
