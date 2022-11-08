public class Customer {
    private String id;
    private String phone;
    private String email;
    private Address address;
    private Account account;
    private User user;

    public Customer(String id, String phone, String email, Address address, Account account, User user) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.account = account;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
