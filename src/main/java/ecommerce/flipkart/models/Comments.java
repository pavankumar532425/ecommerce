package ecommerce.flipkart.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name='Comments')
@IdClass(OrderId.class)
public class Comments {
    @Id
    int userId;
    @Id
    int itemid;
    String comment;
}
