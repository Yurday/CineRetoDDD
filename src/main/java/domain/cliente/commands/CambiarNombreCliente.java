package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.cliente.values.NombreCliente;

public class CambiarNombreCliente implements Command {

    private final ClienteId clienteId;
    private final NombreCliente nombreCliente;

    public CambiarNombreCliente(ClienteId clienteId, NombreCliente nombreCliente){
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }
}
