package co.edu.unisabana.pagos.controller;

import co.edu.unisabana.pagos.service.ClasePago;
import co.edu.unisabana.pagos.service.Publicador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@RefreshScope
public class PagoController {

    @Value("${propiedad1}")
    private String valor;

    private Publicador publicador;

    public PagoController(Publicador publicador) {
        this.publicador = publicador;
    }

    @PostMapping("/pay")
    public String pagar() {
        Pago mensaje = new Pago(100, "01", "22");
        publicador.enviarMensajeTopico(mensaje);
        return "Hola Mundo VOLVI MAS FUERTE " + valor;
    }
}
