package ecommerce.flipkart.Controllers;

import ecommerce.flipkart.Services.OrdersService;
import ecommerce.flipkart.models.Items;
import ecommerce.flipkart.models.Orders;
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
    @RequestMapping(value = "/placeorder/",method = RequestMethod.POST)
    public Responsemsg placeorder(@RequestBody Orders orders){
        return ordersService.placeOrder(orders);
    }
}
