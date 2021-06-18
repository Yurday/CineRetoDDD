package domain.cine.commands;

import co.com.sofka.domain.generic.Command;
import domain.cine.values.CarteleraId;
import domain.cine.values.Horario;

public class ModificarHorarioDeCartelera implements Command {

    private final CarteleraId carteleraId;
    private final Horario horario;

    public ModificarHorarioDeCartelera(CarteleraId carteleraId, Horario horario){
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