package ecommerce.flipkart.Controllers;

import ecommerce.flipkart.Services.UserDetailsService;
import ecommerce.flipkart.pojos.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDetailsService userDetailsService;
    @RequestMapping(value = "/getusername/{email}",method = RequestMethod.GET)
    public String getusername(@PathVariable String email){
        return userDetailsService.getusername(email);
    }
    @RequestMapping(value = "/getuserdetails/{email}",method = RequestMethod.GET)
    public UserDetails getuserdetails(@PathVariable String email){
        return userDetailsService.getuserdetails(email);
    }
}
