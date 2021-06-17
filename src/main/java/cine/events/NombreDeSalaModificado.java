package cine.events;

import cine.values.NombreSala;
import cine.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeSalaModificado extends DomainEvent {
    public NombreDeSalaModificado(SalaId identityId, NombreSala nombreSala){
        super("cineretoddd.cine.nombredesalamodificado");
    }

}
