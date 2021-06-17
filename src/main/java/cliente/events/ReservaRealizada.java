package cliente.events;

import cliente.Reserva;
import cliente.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class ReservaRealizada extends DomainEvent {
    public ReservaRealizada(ClienteId identityId, Reserva reserva){
        super("cineretoddd.cliente.reservarealizada");
    }
}