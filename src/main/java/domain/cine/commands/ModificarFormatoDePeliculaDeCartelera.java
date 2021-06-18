package domain.cine.commands;

import co.com.sofka.domain.generic.Command;
import domain.cine.values.CarteleraId;
import domain.cine.values.Formato;

public class ModificarFormatoDePeliculaDeCartelera implements Command {

    private final CarteleraId carteleraId;
    private final Formato formato;

    public ModificarFormatoDePeliculaDeCartelera (CarteleraId carteleraId, Formato formato){
        this.carteleraId = carteleraId;
        this.formato = formato;
    }

    public CarteleraId getCarteleraId() {
        return carteleraId;
    }

    public Formato getFormato() {
        return formato;
    }
}