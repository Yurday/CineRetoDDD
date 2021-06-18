package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.Pago;
import domain.cliente.values.ClienteId;

public class RealizarPago implements Command {

    private final ClienteId clienteId;
    private final Pago pago;

    public RealizarPago(ClienteId clienteId, Pago pago){
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
