package cine.events;

import cine.values.CarteleraId;
import cine.values.Pelicula;
import co.com.sofka.domain.generic.DomainEvent;

public class PeliculaDeCarteleraModificada extends DomainEvent {
    public PeliculaDeCarteleraModificada (CarteleraId identityID, Pelicula pelicula){
        super("cineretoddd.cine.peliculadecarteleramodificada");

    }
}