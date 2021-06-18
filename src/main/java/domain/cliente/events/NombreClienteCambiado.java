package domain.cliente.events;

import domain.cliente.values.NombreCliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteCambiado extends DomainEvent {

    private final NombreCliente nombreCliente;

    public NombreClienteCambiado (NombreCliente nombreCliente){
        super("cineretoddd.domain.cliente.nombreclientecambiado");
        this.nombreCliente = nombreCliente;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }
}