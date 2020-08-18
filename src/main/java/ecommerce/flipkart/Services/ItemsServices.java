package ecommerce.flipkart.Services;

import ecommerce.flipkart.models.Items;
import ecommerce.flipkart.repositories.ItemsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServices {
    @Autowired
    ItemsRepo itemsRepo;
    public List<Items> getAllItems(){
        return itemsRepo.findAll();
    }
}
