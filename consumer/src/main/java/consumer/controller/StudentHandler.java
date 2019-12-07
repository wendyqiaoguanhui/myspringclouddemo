package consumer.controller;

import consumer.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author QiaoGuanHui
 * @date 2019/11/21-10:49
 */
@RequestMapping("/consumer")
@RestController
public class StudentHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }


        @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);

    }


}
