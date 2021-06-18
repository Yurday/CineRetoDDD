package domain.cliente.events;

import domain.cliente.values.FechaHora;
import domain.cliente.values.ReservaId;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaHoraDeReservaModificada extends DomainEvent {

    private final ReservaId reservaId;
    private final FechaHora fechaHora;

    public FechaHoraDeReservaModificada(ReservaId reservaId, FechaHora fechaHora){
        super("cineretoddd.domain.cliente.fechahoradereservamodificada");
        this.reservaId = reservaId;
        this.fechaHora = fechaHora;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public FechaHora getFechaHora() {
        return fechaHora;
    }
}