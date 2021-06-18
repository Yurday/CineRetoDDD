package domain.cine.events;

import domain.cine.values.CarteleraId;
import domain.cine.values.Pelicula;
import co.com.sofka.domain.generic.DomainEvent;

public class PeliculaDeCarteleraModificada extends DomainEvent {

    private final CarteleraId carteleraId;
    private final Pelicula pelicula;

    public PeliculaDeCarteleraModificada (CarteleraId carteleraId, Pelicula pelicula){
        super("cineretoddd.domain.cine.peliculadecarteleramodificada");
        this.carteleraId = carteleraId;
        this.pelicula = pelicula;
    }

    public CarteleraId getCarteleraId() {
        return carteleraId;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
}