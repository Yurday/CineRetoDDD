package domain.cine.events;

import domain.cine.values.NombreDeVendedor;
import domain.cine.values.TiqueteId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeVendedorDeTiqueteActualizado extends DomainEvent {

    private final TiqueteId tiqueteId;
    private final NombreDeVendedor nombreDeVendedor;

    public NombreDeVendedorDeTiqueteActualizado(TiqueteId tiqueteId, NombreDeVendedor nombreDeVendedor){
        super("cineretoddd.domain.cine.nombredevendedordetiqueteactualizado");
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