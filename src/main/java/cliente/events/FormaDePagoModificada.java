package cliente.events;

import cliente.Pago;
import cliente.values.FormaDePago;
import cliente.values.PagoId;
import co.com.sofka.domain.generic.DomainEvent;

public class FormaDePagoModificada extends DomainEvent {
    public FormaDePagoModificada(PagoId entityId, FormaDePago formaDePago){
        super("cineretoddd.cliente.formadepagomodificada");
    }
}