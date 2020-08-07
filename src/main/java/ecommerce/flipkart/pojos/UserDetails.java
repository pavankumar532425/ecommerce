package ecommerce.flipkart.pojos;

public class UserDetails {
    String email;
    String username;
    String phonenumber;
    String address;

    public UserDetails(String email, String username, String phonenumber, String address) {
        this.email = email;
        this.username = username;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public UserDetails() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
