package cliente.events;

import cliente.values.ClienteId;
import cliente.values.NombreCliente;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteCambiado extends DomainEvent {
    public NombreClienteCambiado (ClienteId identityId, NombreCliente nombreCliente){
        super("cineretoddd.cliente.nombreclientecambiado");
    }
}