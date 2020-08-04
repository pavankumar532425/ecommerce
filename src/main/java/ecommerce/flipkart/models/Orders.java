package ecommerce.flipkart.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="orders")
@IdClass(OrderId.class)
public class Orders {
    @Id
    String userid;
    @Id
    int itemid;
    Date orderplaceddata;
    String orderstatus;

    public Orders() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public Date getOrderplaceddata() {
        return orderplaceddata;
    }

    public void setOrderplaceddata(Date orderplaceddata) {
        this.orderplaceddata = orderplaceddata;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }
}
