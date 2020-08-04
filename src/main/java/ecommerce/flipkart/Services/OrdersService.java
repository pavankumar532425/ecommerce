package ecommerce.flipkart.Services;

import ecommerce.flipkart.models.Items;
import ecommerce.flipkart.models.Orders;
import ecommerce.flipkart.pojos.Responsemsg;
import ecommerce.flipkart.repositories.ItemsRepo;
import ecommerce.flipkart.repositories.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrdersService {
    @Autowired
    OrdersRepo ordersRepo;
    @Autowired
    ItemsRepo itemsRepo;
    public List<Items> getUserOrders(String email){
        List<Orders>ls= ordersRepo.findAllByUserid(email);
        List<Items> itemsList=new ArrayList<>();
        if(!ls.isEmpty()){
            for(Orders x:ls){
                itemsList.add(itemsRepo.findById(x.getItemid()).get());
            }
        }
        return itemsList;
    }
    public Responsemsg placeOrder(String user_id,int item_id,int q){
        Orders orders=new Orders();
        orders.setUserid(user_id);
        orders.setItemid(item_id);
        orders.setQuntity(q);
        orders.setOrderstatus("on_way");
        orders.setOrderplaceddata(new Date());
        ordersRepo.save(orders);
        return new Responsemsg("Order placed Successfully",HttpStatus.OK);
    }
}
