package registryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.swing.*;

/**
 * @author QiaoGuanHui
 * @date 2019/10/22-8:15
 */
@SpringBootApplication
@EnableEurekaServer//声明该类是一个微服务
public class RegistryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterApplication.class,args);
    }
}
