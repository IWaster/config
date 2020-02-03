package club.ouka.sc.configclient.config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * Description:
 * User: ouka
 * Date: 2019-09-28
 * Time: 下午9:50
 */
@RefreshScope
@Configuration
public class RedisConfig {
    @Bean
    public StringRedisTemplate template(RedisConnectionFactory factory){
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(factory);
        return template;
    }

}
