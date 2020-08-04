package ecommerce.flipkart.Controllers;

import ecommerce.flipkart.Services.ItemsServices;
import ecommerce.flipkart.models.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemsController {
    @Autowired
    ItemsServices itemsServices;
    @RequestMapping(value = "/getAllitmes",method = RequestMethod.GET)
    public List<Items> getAllItems(){
        return itemsServices.getAllItems();
    }
}
