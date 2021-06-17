package cine.events;

import cine.values.CineId;
import cine.values.NombreCine;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeCineCambiado extends DomainEvent {
    public NombreDeCineCambiado(CineId identityId, NombreCine nombreCine){
        super("cineretoddd.cine.nombredecineCambiado");
    }
}