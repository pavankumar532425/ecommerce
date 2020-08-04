package ecommerce.flipkart.Controllers;

import ecommerce.flipkart.Services.CommentsService;
import ecommerce.flipkart.models.Comments;
import ecommerce.flipkart.pojos.Responsemsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentsController {
    @Autowired
    CommentsService commentsService;
    @RequestMapping(value = "/addcomment",method = RequestMethod.POST)
    public Responsemsg addComment(@RequestBody Comments comments){
        return commentsService.addComment(comments);
    }
    @RequestMapping(value = "/getcommets",method = RequestMethod.GET)
    public List<Comments> getAllComments(){
        return commentsService.getAllCommet();
    }
}
