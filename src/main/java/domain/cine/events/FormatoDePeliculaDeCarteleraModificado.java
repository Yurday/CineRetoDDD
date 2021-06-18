package domain.cine.events;

import domain.cine.values.CarteleraId;
import domain.cine.values.Formato;
import co.com.sofka.domain.generic.DomainEvent;

public class FormatoDePeliculaDeCarteleraModificado extends DomainEvent {

    private final CarteleraId carteleraId;
    private final Formato formato;

    public FormatoDePeliculaDeCarteleraModificado(CarteleraId carteleraId, Formato formato){
        super("cineretoddd.domain.cine.formatodepeliculadecarteleramodificado");
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