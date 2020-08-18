package ecommerce.flipkart.Controllers;

import ecommerce.flipkart.Services.Authoservice;
import ecommerce.flipkart.models.UsersDetails;
import ecommerce.flipkart.pojos.Responsemsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthoController {
     @Autowired
    Authoservice authoservice;

    @RequestMapping(value = "/Signup",method = RequestMethod.POST)
    public Responsemsg singup(@RequestBody UsersDetails user){
             return  authoservice.signup(user);
    }
   /* @RequestMapping(value = "/signin/{email}/{password}",method = RequestMethod.GET)
    public Responsemsg singin(@PathVariable String email,@PathVariable String password){
        return authoservice.signin(email,password);
    }*/
    @RequestMapping(value = "/logoutsuccess")
    public Responsemsg logout(){
        return new Responsemsg("ok", HttpStatus.OK);
    }

}
