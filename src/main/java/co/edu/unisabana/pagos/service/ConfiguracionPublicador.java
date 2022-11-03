package co.edu.unisabana.pagos.service;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionPublicador {

    @Bean
    public Queue queue() {
        return new Queue("pagosEjecutados", true);
    }
}
