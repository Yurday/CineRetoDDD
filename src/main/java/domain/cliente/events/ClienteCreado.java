package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.Cliente;
import domain.cliente.values.ClienteId;

public class ClienteCreado extends DomainEvent {

    private final ClienteId clienteId;
    private final Cliente cliente;

    public ClienteCreado (ClienteId clienteId, Cliente cliente){
        super("cineretoddd.domain.cliente.clientecreado");
        this.clienteId = clienteId;
        this.cliente = cliente;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
