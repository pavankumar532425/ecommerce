package ecommerce.flipkart.Services;

import ecommerce.flipkart.models.Comments;
import ecommerce.flipkart.pojos.Commentspojo;
import ecommerce.flipkart.pojos.Responsemsg;
import ecommerce.flipkart.repositories.CommentsRepo;
import ecommerce.flipkart.repositories.UsersRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentsService {
    @Autowired
    CommentsRepo commentsRepo;
    @Autowired
    UsersRepo usersRepo;
    @Autowired
    Commentspojo commentspojo;
    public Responsemsg addComment(Comments comments){
        commentsRepo.save(comments);
        return new Responsemsg("comment added successfully", HttpStatus.OK);
    }
    public List<Commentspojo> getitemsCommet(int id){
        List<Comments> comments= commentsRepo.findAllByItemid(id);
        List<Commentspojo> commentspojos=new ArrayList<>();
        for(Comments x:comments){
            String username=usersRepo.findById(x.getUserid()).get().getUsername();
            String comment=x.getComment();
            double rating=x.getRating();
            Commentspojo c=new Commentspojo(username,comment,rating);
            commentspojos.add(c);
        }
        return commentspojos;

    }
}
