package ecommerce.flipkart.models;

import java.io.Serializable;

public class OrderId implements Serializable {
    String userid;
    int itemid;

    public OrderId(String userid, int itemid) {
        this.userid = userid;
        this.itemid = itemid;
    }

    public OrderId() {
    }
}
