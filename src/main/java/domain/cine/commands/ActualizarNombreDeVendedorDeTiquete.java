package domain.cine.commands;

import co.com.sofka.domain.generic.Command;
import domain.cine.values.NombreDeVendedor;
import domain.cine.values.TiqueteId;

public class ActualizarNombreDeVendedorDeTiquete implements Command {

    private final TiqueteId tiqueteId;
    private final NombreDeVendedor nombreDeVendedor;

    public ActualizarNombreDeVendedorDeTiquete (TiqueteId tiqueteId, NombreDeVendedor nombreDeVendedor){
        this.tiqueteId = tiqueteId;
        this.nombreDeVendedor = nombreDeVendedor;
    }

    public TiqueteId getTiqueteId() {
        return tiqueteId;
    }

    public NombreDeVendedor getNombreDeVendedor() {
        return nombreDeVendedor;
    }
}
