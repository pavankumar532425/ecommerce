package ecommerce.flipkart.models;

import java.io.Serializable;

public class OrderId implements Serializable {
    String userId;
    int itemid;

    public OrderId(String userId, int itemid) {
        this.userId = userId;
        this.itemid = itemid;
    }
}
