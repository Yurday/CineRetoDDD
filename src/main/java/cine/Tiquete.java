package cine;

import cine.values.NombreDeVendedor;
import cine.values.TiqueteId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Tiquete extends Entity <TiqueteId> {

    private NombreDeVendedor nombreDeVendedor;

    public Tiquete (TiqueteId entityId, NombreDeVendedor nombreDeVendedor){
        super(entityId);
        this.nombreDeVendedor = nombreDeVendedor;
    }

    public void actualizarNombreDeVendedor(NombreDeVendedor nombreDeVendedor){
        this.nombreDeVendedor = Objects.requireNonNull(nombreDeVendedor);
    }

    public NombreDeVendedor nombreDeVendedor(){
        return nombreDeVendedor;
    }
}
