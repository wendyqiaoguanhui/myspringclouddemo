package provider2.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


/**
 * @author QiaoGuanHui
 * @date 2019/11/20-10:46
 */
@RequestMapping("/student")
@RestController
public class StudentHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "当前端口"+this.port;
    }


}
