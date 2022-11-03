package co.edu.unisabana.streamings.controller;

import co.edu.unisabana.streamings.service.Publicador;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@RefreshScope
public class MoviesController {

    @Value("${propiedad1}")
    private String valor;

    private Publicador publicador;

    public MoviesController(Publicador publicador) {
        this.publicador = publicador;
    }

    @PostMapping("/publish")
    public String publicar() {
        movie mensaje = new movie("Harry Potter 7", "28-10-2010", "warnerbros");
        publicador.enviarMensajeTopico(mensaje);
        return "Nueva pelicula añadida al catalogo " + valor;
    }
}
