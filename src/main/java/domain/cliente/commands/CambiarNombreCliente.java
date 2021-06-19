package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.cliente.values.NombreCliente;

public class CambiarNombreCliente implements Command {

    private final NombreCliente nombreCliente;

    public CambiarNombreCliente(NombreCliente nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public NombreCliente getNombreCliente() {
        return nombreCliente;
    }
}
