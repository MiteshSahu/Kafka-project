package com.example.kafkaexample.resource;

import com.example.kafkaexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Kafka")
public class UserResource {
    /* For String */
//    @Autowired
//    private KafkaTemplate<String,String> kafkaTemplate;
//    private static final String TOPIC = "my-topic";
//    @GetMapping("/publish/{message}")
//    public String post(@PathVariable("message") final String message){
//        kafkaTemplate.send(TOPIC,message);
//        return "Published succesfully";
//    }

    /* JSON Object */
    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC = "my-topic";
    @GetMapping("/publish/{name}")
    public String post(@PathVariable("name") final String name){
        kafkaTemplate.send(TOPIC,new User(name, "iauro systems", 12000L));
        return "Published succesfully";
    }
}
