package consumer.cloud;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author QiaoGuanHui
 * @date 2019/11/21-18:17
 */
//@Component
public class MyRule extends AbstractLoadBalancerRule {

    private ILoadBalancer lb;
    public MyRule() {
    }


    @Override
    public Server choose(Object o) {
        ILoadBalancer lb = getLoadBalancer();
        List<Server> servers = lb.getAllServers();
        System.out.println("这是自定义规则类，输出服务器信息：");
        for (Server s : servers){
            System.out.println("服务器的端口号："+ s.getHostPort());
        }
        return servers.get(0);
    }


    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {

    }
}
