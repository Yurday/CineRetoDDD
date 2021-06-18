package domain.cine.commands;

import domain.cine.values.CarteleraId;
import domain.cine.values.Precio;

public class ModificarPrecioDePeliculaDeCartelera {

    private final CarteleraId carteleraId;
    private final Precio precio;

    public ModificarPrecioDePeliculaDeCartelera (CarteleraId carteleraId, Precio precio){
        this.carteleraId = carteleraId;
        this.precio = precio;
    }

    public CarteleraId getCarteleraId() {
        return carteleraId;
    }

    public Precio getPrecio() {
        return precio;
    }
}