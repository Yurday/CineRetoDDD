package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.Correo;

public class CambiarCorreoDeDatos implements Command {

    private final Correo correo;

    public CambiarCorreoDeDatos(Correo correo) {
        this.correo = correo;
    }

    public Correo getCorreo() {
        return correo;
    }
}