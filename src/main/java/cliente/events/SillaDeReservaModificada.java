package cliente.events;

import cliente.values.ReservaId;
import cliente.values.Silla;
import co.com.sofka.domain.generic.DomainEvent;

public class SillaDeReservaModificada extends DomainEvent {
    public SillaDeReservaModificada(ReservaId identityId, Silla silla){
        super("cineretoddd.cliente.silladereservamodificada");
    }
}