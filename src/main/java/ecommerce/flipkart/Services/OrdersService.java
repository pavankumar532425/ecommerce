package ecommerce.flipkart.Services;

import ecommerce.flipkart.models.Items;
import ecommerce.flipkart.models.Orders;
import ecommerce.flipkart.pojos.Responsemsg;
import ecommerce.flipkart.repositories.ItemsRepo;
import ecommerce.flipkart.repositories.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public Responsemsg placeOrder(Orders orders){
        ordersRepo.save(orders);
        return new Responsemsg("Order placed Successfully",HttpStatus.OK);
    }
}
