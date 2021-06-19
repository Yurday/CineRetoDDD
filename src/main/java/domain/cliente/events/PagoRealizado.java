package domain.cliente.events;

import domain.cliente.entities.Pago;
import domain.cliente.values.ClienteId;
import co.com.sofka.domain.generic.DomainEvent;

public class PagoRealizado extends DomainEvent {

    private final ClienteId clienteId;
    private final Pago pago;

    public PagoRealizado(ClienteId clienteId, Pago pago){
        super("cineretoddd.domain.cliente.pagorealizado");
        this.clienteId = clienteId;
        this.pago = pago;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Pago getPago() {
        return pago;
    }
}
