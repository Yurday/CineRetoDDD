package domain.cliente.events;

import domain.cliente.values.ReservaId;
import domain.cliente.values.Silla;
import co.com.sofka.domain.generic.DomainEvent;

public class SillaDeReservaModificada extends DomainEvent {

    private final ReservaId reservaId;
    private final Silla silla;

    public SillaDeReservaModificada(ReservaId reservaId, Silla silla){
        super("cineretoddd.domain.cliente.silladereservamodificada");
        this.reservaId = reservaId;
        this.silla = silla;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public Silla getSilla() {
        return silla;
    }
}