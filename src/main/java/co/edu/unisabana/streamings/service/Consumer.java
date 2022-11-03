package co.edu.unisabana.streamings.service;

import co.edu.unisabana.streamings.controller.movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "sabana.arquitectura2")
    public void receive(@Payload movie pago) {
        log.info("sabana.arquitectura2: {}", pago.getMonto());

        /**
         * Esto de aca abajo simula que la escucha del mensaje se demora 10 segundos.
         *    :)
         */
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Procesaimiento Terminado del mensaje: {}", pago);
    }

    @RabbitListener(queues = "unisabana.pagos.procesar")
    public void receiv2e(@Payload movie pago) {
        log.info("Escuche de la cola unisabana.pagos.procesar {}", pago.getMonto());
    }


}
