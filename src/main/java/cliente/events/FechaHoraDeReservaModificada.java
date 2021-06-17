package cliente.events;

import cliente.values.FechaHora;
import cliente.values.ReservaId;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaHoraDeReservaModificada extends DomainEvent {
    public FechaHoraDeReservaModificada(ReservaId identityId, FechaHora fechaHora){
        super("cineretoddd.cliente.fechahoradereservamodificada");
    }
}