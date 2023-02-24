package com.codeup.codeupspringblog.services;


import com.codeup.codeupspringblog.models.Post;
import com.sendgrid.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service("EmailService")
public class EmailService {

    @Value("${spring.sendgrid.api-key}")
    private String apiKey;

    public String sendTextEmail(Post post){
        Email from = new Email("qiyuan.cui1989@gmail.com");
        String subject = "New post has been created!";
        Email to = new Email(post.getUser().getEmail());
        Content content = new Content("text/plain", "submitting a new post");
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(apiKey);

        Request rq = new Request();

        try {
            rq.setMethod(Method.POST);
            rq.setEndpoint("mail/send");
            rq.setBody(mail.build());
            Response resp = sg.api(rq);
            return resp.getBody();
        }catch (IOException e){
            return e.getMessage();
        }
    }

}
