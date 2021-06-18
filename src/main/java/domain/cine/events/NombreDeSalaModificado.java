package domain.cine.events;

import domain.cine.values.NombreSala;
import domain.cine.values.SalaId;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeSalaModificado extends DomainEvent {

    private final SalaId salaId;
    private final NombreSala nombreSala;

    public NombreDeSalaModificado(SalaId salaId, NombreSala nombreSala){
        super("cineretoddd.domain.cine.nombredesalamodificado");
        this.salaId = salaId;
        this.nombreSala = nombreSala;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public NombreSala getNombreSala() {
        return nombreSala;
    }
}