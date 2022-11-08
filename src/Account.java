import java.util.Date;
import java.util.List;

public class Account {
    private ShoppingCart shoppingCart;
    private String id;
    private String billing_address;
    private boolean is_closed;
    private Date opened;
    private Date closed;
    private int balance;
    private List<Order> orders;
    private Customer customer;


}
