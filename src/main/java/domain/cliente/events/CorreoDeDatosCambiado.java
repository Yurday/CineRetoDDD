package domain.cliente.events;

import domain.cliente.values.ClienteId;
import domain.cliente.values.Correo;
import domain.cliente.values.DatosId;
import co.com.sofka.domain.generic.DomainEvent;

public class CorreoDeDatosCambiado extends DomainEvent {

    private final ClienteId clienteId;
    private final Correo correo;

    public CorreoDeDatosCambiado(ClienteId clienteId, Correo correo){
        super("cineretoddd.domain.cliente.correodedatoscambiado");
        this.clienteId = clienteId;
        this.correo = correo;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Correo getCorreo() {
        return correo;
    }
}