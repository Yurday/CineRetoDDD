package cine.events;

import cine.values.NombreDeVendedor;
import cine.values.TiqueteId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeVendedorDeTiqueteActualizado extends DomainEvent {
    public NombreDeVendedorDeTiqueteActualizado(TiqueteId identityId, NombreDeVendedor nombreDeVendedor){
        super("cineretoddd.cine.nombredevendedordetiqueteactualizado");
    }
}