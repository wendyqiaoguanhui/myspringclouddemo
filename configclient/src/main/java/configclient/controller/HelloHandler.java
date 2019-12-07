package configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiaoGuanHui
 * @date 2019/12/7-19:05
 */
@RequestMapping("/config")
@RestController
@RefreshScope
public class HelloHandler {
    @Value("${server.port}")
    private String port;


    @RequestMapping("/index")
    public String  index(){
        return "当前端口************："+this.port;
    }


}
