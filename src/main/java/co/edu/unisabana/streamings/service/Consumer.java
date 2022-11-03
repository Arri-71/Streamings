package co.edu.unisabana.streamings.service;

import co.edu.unisabana.streamings.controller.movie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer {

    @RabbitListener(queues = "Unisabana.peliculas.publicar")
    public void receive(@Payload movie movies) {
        log.info("Unisabana.peliculas.publicar: {}", movies.getNombrePelicula());

        /**
         * Esto de aca abajo simula que la escucha del mensaje se demora 10 segundos.
         *    :)
         */
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Procesaimiento Terminado del mensaje: {}", movies);
    }

    @RabbitListener(queues = "unisabana.peliculas.procesar")
    public void receiv2e(@Payload movie movies) {
        log.info("Escuche de la cola unisabana.peliculas.procesar {}", movies.getNombrePelicula());
    }


}
