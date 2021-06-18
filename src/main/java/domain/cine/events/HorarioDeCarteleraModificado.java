package domain.cine.events;

import domain.cine.values.CarteleraId;
import domain.cine.values.Horario;
import co.com.sofka.domain.generic.DomainEvent;

public class HorarioDeCarteleraModificado extends DomainEvent {

    private final CarteleraId carteleraId;
    private final Horario horario;


    public  HorarioDeCarteleraModificado (CarteleraId carteleraId, Horario horario){
        super("cineretoddd.domain.cine.horariodecarteleramodificado");
        this.carteleraId = carteleraId;
        this.horario = horario;
    }

    public CarteleraId getCarteleraId() {
        return carteleraId;
    }

    public Horario getHorario() {
        return horario;
    }
}