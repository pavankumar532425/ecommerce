package ecommerce.flipkart.Services;


import ecommerce.flipkart.models.User;
import ecommerce.flipkart.models.UsersDetails;
import ecommerce.flipkart.pojos.Responsemsg;
import ecommerce.flipkart.repositories.UsersDetailsRepo;
import ecommerce.flipkart.repositories.userRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Authoservice {
    @Autowired
    UsersDetailsRepo usersDetailsRepo;
    @Autowired
    Responsemsg responsemsg;
    @Autowired
    userRepo userRepo;
    Logger logger= LoggerFactory.getLogger(Authoservice.class);
    public Responsemsg signup(UsersDetails user){
       List<UsersDetails>ls= usersDetailsRepo.findByEmail(user.getEmail());
        if(!ls.isEmpty()){
            responsemsg.setResponse("email already exits");
            responsemsg.setStatus(HttpStatus.CONFLICT);
            logger.info("A user email already exits");
        }
        else {
        usersDetailsRepo.save(user);
        User user1=new User();
        user1.setActive(true);
        user1.setPassword(user.getPassword());
        user1.setRoles("ROLE_USER");
        user1.setUsername(user.getEmail());
        userRepo.save(user1);
            responsemsg.setResponse("email already exits");
            responsemsg.setStatus(HttpStatus.OK);
        logger.info("A new user signup");
        }
        return responsemsg;

    }
    public Responsemsg signin(String email,String password){
        List<UsersDetails>ls= usersDetailsRepo.findByEmail(email);
        if(ls.isEmpty()){
            responsemsg.setResponse("incorrect mail");
            responsemsg.setStatus(HttpStatus.CONFLICT);
        }
        else{
            if(ls.get(0).getPassword().compareTo(password)==0){
                responsemsg.setResponse("user can sign");
                responsemsg.setStatus(HttpStatus.OK);
                logger.info("user with email :"+email+"has sign in");
            }
            else{
                responsemsg.setResponse("password is incorrect");
                responsemsg.setStatus(HttpStatus.CONFLICT);
            }
        }
        return responsemsg;
    }

}
