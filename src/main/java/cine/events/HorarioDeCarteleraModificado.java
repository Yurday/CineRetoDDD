package cine.events;

import cine.values.CarteleraId;
import cine.values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioDeCarteleraModificado extends DomainEvent {
    public  HorarioDeCarteleraModificado (CarteleraId entityId, Horario horario){
        super("cineretoddd.cine.horariodecarteleramodificado");
    }
}