package cine.events;

import cine.values.CarteleraId;
import cine.values.Formato;
import co.com.sofka.domain.generic.DomainEvent;

public class FormatoDePeliculaDeCarteleraModificado extends DomainEvent {
    public FormatoDePeliculaDeCarteleraModificado(CarteleraId entityId, Formato formato){
        super("cineretoddd.cine.formatodepeliculadecarteleramodificado");
    }
}
