package club.ouka.sc.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RefreshScope
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientAutoStartApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientAutoStartApp.class,args);
    }
}
