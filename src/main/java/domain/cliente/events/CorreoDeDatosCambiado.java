package domain.cliente.events;

import domain.cliente.values.ClienteId;
import domain.cliente.values.Correo;
import domain.cliente.values.DatosId;
import co.com.sofka.domain.generic.DomainEvent;

public class CorreoDeDatosCambiado extends DomainEvent {

    private final DatosId datosId;
    private final Correo correo;

    public CorreoDeDatosCambiado(DatosId datosId, Correo correo){
        super("cineretoddd.domain.cliente.correodedatoscambiado");
        this.datosId = datosId;
        this.correo = correo;
    }

    public DatosId getDatosId() {
        return datosId;
    }

    public Correo getCorreo() {
        return correo;
    }
}