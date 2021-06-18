package domain.cliente;

import domain.cliente.events.*;
import co.com.sofka.domain.generic.EventChange;

public class ClienteChange extends EventChange {

    public ClienteChange(Cliente cliente){
        apply((CorreoDeDatosCambiado event) -> {
            cliente.datos.cambiarCorreo(event.getCorreo());
        });
/*
        apply((FechaHoraDeReservaModificada event) -> {
            domain.cliente.reserva.modificarFechaHora(); = event.fechaHora();
        });

       apply((FormaDePagoModificada event) -> {
            domain.cliente.pago = event.formaDePago();
        });

        apply((NombreClienteCambiado event) -> {
            domain.cliente.nombreCliente = event.nombreCliente();
        });

        apply((PagoRealizado event) -> {
            domain.cliente.pago = event.pago();
        });

        apply((ReservaRealizada event) -> {
            domain.cliente.reserva = event.reserva();
        });

        apply((SillaDeReservaModificada event) -> {
            domain.cliente.reserva = event.silla();
        });

        apply((TelefonoDeDatosCambiado event) -> {
            domain.cliente.datos = event.telefono();
        }); */
    }
}