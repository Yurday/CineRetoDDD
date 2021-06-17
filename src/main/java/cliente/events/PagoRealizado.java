package cliente.events;

import cliente.Pago;
import cliente.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class PagoRealizado extends DomainEvent {
    public PagoRealizado(ClienteId identityId, Pago pago){
        super("cineretoddd.cliente.pagorealizado");
    }
}
