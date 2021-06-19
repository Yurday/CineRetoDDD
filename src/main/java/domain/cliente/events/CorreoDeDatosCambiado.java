package domain.cliente.events;

import domain.cliente.values.ClienteId;
import domain.cliente.values.Correo;
import domain.cliente.values.DatosId;
import co.com.sofka.domain.generic.DomainEvent;

public class CorreoDeDatosCambiado extends DomainEvent {

    private final Correo correo;

    public CorreoDeDatosCambiado(Correo correo){
        super("cineretoddd.domain.cliente.correodedatoscambiado");
        this.correo = correo;
    }

    public Correo getCorreo() {
        return correo;
    }
}