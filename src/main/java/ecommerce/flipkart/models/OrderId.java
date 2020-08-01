package ecommerce.flipkart.models;

public class OrderId {
    int userId;
    int itemid;

    public OrderId(int userId, int itemid) {
        this.userId = userId;
        this.itemid = itemid;
    }
}
