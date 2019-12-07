package consumer.cloud;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
import org.springframework.stereotype.Component;

/**
 * @author QiaoGuanHui
 * @date 2019/11/21-19:03
 */
//@Component
public class MyPing implements IPing {

    @Override
    public boolean isAlive(Server server) {
        System.out.println("自定义Ping 类，服务器信息：" + server.getHostPort());
        return true;
    }
}
