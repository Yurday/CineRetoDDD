package cine.events;

import cine.values.CarteleraId;
import cine.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioDePeliculaDeCarteleraModificado extends DomainEvent {
    public PrecioDePeliculaDeCarteleraModificado (CarteleraId identityId, Precio precio){
        super("cineretoddd.cine.preciodepeliculadecarteleramodificado");

    }
}