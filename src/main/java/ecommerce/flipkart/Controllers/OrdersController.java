package ecommerce.flipkart.Controllers;

import ecommerce.flipkart.Services.OrdersService;
import ecommerce.flipkart.models.Items;
import ecommerce.flipkart.pojos.Responsemsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;
    @RequestMapping(value = "/getuserorders/{userid}/",method = RequestMethod.GET)
    public List<Items> getUserOrders(@PathVariable String userid){
         return ordersService.getUserOrders(userid);
    }
    @RequestMapping(value = "/placeorder/{user_id}/{item_id}/{q}",method = RequestMethod.GET)
    public Responsemsg placeorder(@PathVariable String user_id,@PathVariable int item_id,@PathVariable int q){
        return ordersService.placeOrder(user_id,item_id,q);
    }
}
