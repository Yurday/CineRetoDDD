package domain.cliente.events;

import domain.cliente.entities.Pago;
import domain.cliente.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class PagoRealizado extends DomainEvent {

    private final Pago pago;

    public PagoRealizado(Pago pago){
        super("cineretoddd.domain.cliente.pagorealizado");
        this.pago = pago;
    }

    public Pago getPago() {
        return pago;
    }
}
