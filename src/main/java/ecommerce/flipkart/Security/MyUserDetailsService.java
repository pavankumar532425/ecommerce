package ecommerce.flipkart.Security;


import ecommerce.flipkart.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    ecommerce.flipkart.repositories.userRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> uer=userRepo.findByusername(username);
        uer.orElseThrow(()->new UsernameNotFoundException("not found username"+username));
        UserDetails userDetails= new MyUserDetails(uer.get());
        return userDetails;
    }
}
