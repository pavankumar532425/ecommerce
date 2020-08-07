package ecommerce.flipkart.Services;

import ecommerce.flipkart.models.Users;
import ecommerce.flipkart.pojos.UserDetails;
import ecommerce.flipkart.repositories.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UsersRepo usersRepo;
    public String getusername(String id){
        return usersRepo.findById(id).get().getUsername();
    }
    public UserDetails getuserdetails(String id){
        Users user=usersRepo.findById(id).get();
        return new UserDetails(user.getEmail(),user.getUsername(),user.getPhonenumber(),user.getAddress());
    }
}
