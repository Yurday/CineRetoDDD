package domain.cliente.events;

import domain.cliente.values.DatosId;
import domain.cliente.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoDeDatosCambiado extends DomainEvent {

    private final DatosId datosId;
    private final Telefono telefono;

    public TelefonoDeDatosCambiado (DatosId datosId, Telefono telefono){
        super("cineretoddd.domain.cliente.telefonodedatoscambiado");
        this.datosId = datosId;
        this.telefono = telefono;
    }

    public DatosId getDatosId() {
        return datosId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}