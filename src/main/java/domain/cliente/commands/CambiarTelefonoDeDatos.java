package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.cliente.values.DatosId;
import domain.cliente.values.Telefono;

public class CambiarTelefonoDeDatos implements Command {

    private final Telefono telefono;

    public CambiarTelefonoDeDatos (Telefono telefono){
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}