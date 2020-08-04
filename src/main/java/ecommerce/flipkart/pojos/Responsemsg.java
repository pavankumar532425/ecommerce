package ecommerce.flipkart.pojos;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class Responsemsg {
    String response;
    HttpStatus Status;

    public Responsemsg(String response, HttpStatus status) {
        this.response = response;
        Status = status;
    }

    public Responsemsg() {
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public HttpStatus getStatus() {
        return Status;
    }

    public void setStatus(HttpStatus status) {
        Status = status;
    }
}
