package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.FormaDePago;
import domain.cliente.values.PagoId;

public class ModificarFormaDePago implements Command {

    private final PagoId pagoId;
    private final FormaDePago formaDePago;

    public ModificarFormaDePago(PagoId pagoId, FormaDePago formaDePago){
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
