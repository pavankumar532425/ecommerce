package ecommerce.flipkart.Services;

import ecommerce.flipkart.models.UsersDetails;
import ecommerce.flipkart.pojos.UserDetails;
import ecommerce.flipkart.repositories.UsersDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
    @Autowired
    UsersDetailsRepo usersDetailsRepo;
    public String getusername(String id){
        return usersDetailsRepo.findById(id).get().getUsername();
    }
    public UserDetails getuserdetails(String id){
        UsersDetails user= usersDetailsRepo.findById(id).get();
        return new UserDetails(user.getEmail(),user.getUsername(),user.getPhonenumber(),user.getAddress());
    }
}
