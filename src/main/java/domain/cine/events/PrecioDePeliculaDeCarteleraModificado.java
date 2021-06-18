package domain.cine.events;

import domain.cine.values.CarteleraId;
import domain.cine.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioDePeliculaDeCarteleraModificado extends DomainEvent {

    private final CarteleraId carteleraId;
    private final Precio precio;

    public PrecioDePeliculaDeCarteleraModificado (CarteleraId carteleraId, Precio precio){
        super("cineretoddd.domain.cine.preciodepeliculadecarteleramodificado");
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