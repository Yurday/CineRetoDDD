package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.DatosId;
import domain.cliente.values.Telefono;

public class CambiarTelefonoDeDatos implements Command {

    private final DatosId datosId;
    private final Telefono telefono;

    public CambiarTelefonoDeDatos (DatosId datosId, Telefono telefono){
        this.datosId = datosId;
        this.telefono = telefono;
    }

    public DatosId getDatosId() {
        return datosId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}