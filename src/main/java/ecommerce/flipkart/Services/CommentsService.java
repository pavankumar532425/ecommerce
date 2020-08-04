package ecommerce.flipkart.Services;

import ecommerce.flipkart.models.Comments;
import ecommerce.flipkart.pojos.Responsemsg;
import ecommerce.flipkart.repositories.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsService {
    @Autowired
    CommentsRepo commentsRepo;
    public Responsemsg addComment(Comments comments){
        commentsRepo.save(comments);
        return new Responsemsg("comment added successfully", HttpStatus.OK);
    }
    public List<Comments> getAllCommet(){
        return commentsRepo.findAll();
    }
}
