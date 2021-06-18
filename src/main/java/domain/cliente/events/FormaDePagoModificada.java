package domain.cliente.events;

import domain.cliente.values.FormaDePago;
import domain.cliente.values.PagoId;
import co.com.sofka.domain.generic.DomainEvent;

public class FormaDePagoModificada extends DomainEvent {

    private final PagoId pagoId;
    private final FormaDePago formaDePago;

    public FormaDePagoModificada(PagoId pagoId, FormaDePago formaDePago){
        super("cineretoddd.domain.cliente.formadepagomodificada");
        this.pagoId = pagoId;
        this.formaDePago = formaDePago;
    }

    public PagoId getPagoId() {
        return pagoId;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }
}