package consumer.controller;

import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author QiaoGuanHui
 * @date 2019/11/21-19:30
 */
@RestController
@Configuration
@RequestMapping("/invoker")
public class InvokerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SpringClientFactory factory;

    @GetMapping("/index")
    public String router() {

        return restTemplate.getForObject("http://provider/student/index",String.class);
    }

    @RequestMapping(value = "/defaultValue", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String defaultValue() {
        System.out.println("==== 输出默认配置：");
    // 获取默认的配置
        ZoneAwareLoadBalancer alb = (ZoneAwareLoadBalancer) factory
                .getLoadBalancer("default");
        System.out.println(" IClientConfig: "
                + factory.getLoadBalancer("default").getClass()
                .getName());
        System.out.println(" IRule: " + alb.getRule().getClass().getName());
        System.out.println(" IPing: " + alb.getPing().getClass().getName());
        System.out.println(" ServerList: "
                + alb.getServerListImpl().getClass().getName());
        System.out.println(" ServerListFilter: "
                + alb.getFilter().getClass().getName());
        System.out.println(" ILoadBalancer: " + alb.getClass().getName());
        System.out.println(" PingInterval: " + alb.getPingInterval());
        System.out.println("==== 输出cloud-provider 配置：");
    // 获取cloud-provider 的配置
        ZoneAwareLoadBalancer alb2 = (ZoneAwareLoadBalancer) factory
                .getLoadBalancer("cloud-provider");
        System.out.println(" IClientConfig: "
                + factory.getLoadBalancer("cloud-provider").getClass()
                .getName());
        System.out.println(" IRule: " + alb2.getRule().getClass().getName());
        System.out.println(" IPing: " + alb2.getPing().getClass().getName());
        System.out.println(" ServerList: "
                + alb2.getServerListImpl().getClass().getName());
        System.out.println(" ServerListFilter: "
                + alb2.getFilter().getClass().getName());
        System.out.println(" ILoadBalancer: " + alb2.getClass().getName());
        System.out.println(" PingInterval: " + alb2.getPingInterval());
        return "";
    }
}
