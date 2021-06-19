package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ClienteId;
import domain.cliente.values.Correo;
import domain.cliente.values.DatosId;

public class CambiarCorreoDeDatos implements Command {

    private final DatosId datosId;
    private final Correo correo;
    private final   ClienteId clienteId;

    public CambiarCorreoDeDatos(DatosId datosId, Correo correo, ClienteId clienteId) {
        this.datosId = datosId;
        this.correo = correo;
        this.clienteId = clienteId;
    }

    public DatosId getDatosId() {
        return datosId;
    }

    public Correo getCorreo() {
        return correo;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}