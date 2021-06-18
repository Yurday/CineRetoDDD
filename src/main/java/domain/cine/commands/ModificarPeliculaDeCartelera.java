package domain.cine.commands;

import co.com.sofka.domain.generic.Command;
import domain.cine.values.CarteleraId;
import domain.cine.values.Pelicula;

public class ModificarPeliculaDeCartelera implements Command {

    private final CarteleraId carteleraId;
    private final Pelicula pelicula;

    public ModificarPeliculaDeCartelera(CarteleraId carteleraId, Pelicula pelicula){
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
