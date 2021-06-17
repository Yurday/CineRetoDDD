package cliente;

import cine.values.TiqueteId;
import cliente.events.*;
import cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Cliente extends AggregateEvent <ClienteId>{

    protected TiqueteId tiqueteId;
    protected NombreCliente nombreCliente;
    protected DatosId datosId;
    protected ReservaId reservaId;
    protected PagoId pagoId;

    public Cliente(ClienteId entityId) {
        super(entityId);
    }

    public void cambiarNombreCliente(ClienteId entityId, NombreCliente nombreCliente){
        appendChange(new NombreClienteCambiado(entityId, nombreCliente)).apply();
    }

    public void realizarReserva(ClienteId entityId, Reserva reserva){
        appendChange(new ReservaRealizada(entityId, reserva)).apply();
    }

    public void realizarPago(ClienteId entityId, Pago pago){
        appendChange(new PagoRealizado(entityId, pago)).apply();
    }

    public void cambiarCorreoDeDatos(DatosId entityId, Correo correo){
        appendChange(new CorreoDeDatosCambiado(entityId, correo)).apply();
    }

    public void cambiarTelefonoDeDatos(DatosId entityId, Telefono telefono){
        appendChange(new TelefonoDeDatosCambiado(entityId, telefono)).apply();
    }

    public void modificarFechaHoraDeReserva(ReservaId entityId, FechaHora fechaHora){
        appendChange(new FechaHoraDeReservaModificada(entityId, fechaHora)).apply();
    }

    public void modificarSillaDeReserva(ReservaId entityId, Silla silla){
        appendChange(new SillaDeReservaModificada(entityId, silla)).apply();
    }

    public void modificarFormaDePago(PagoId entityId, FormaDePago formaDePago){
        appendChange(new FormaDePagoModificada(entityId, formaDePago)).apply();
    }


}
