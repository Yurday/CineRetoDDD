package domain.cliente;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cine.Tiquete;
import domain.cliente.events.*;
import domain.cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Cliente extends AggregateEvent <ClienteId>{

    protected Tiquete tiquete;
    protected NombreCliente nombreCliente;
    protected Datos datos;
    protected Pago pago;
    protected Reserva reserva;

    private Cliente(ClienteId clienteId) {
        super(clienteId);
        subscribe(new ClienteChange(this));
    }

    //factoria que permite crear el agregado
    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void cambiarNombreCliente(NombreCliente nombreCliente){
        appendChange(new NombreClienteCambiado(nombreCliente)).apply();
    }

    public void realizarReserva(ClienteId entityId, Reserva reserva){
        appendChange(new ReservaRealizada(entityId, reserva)).apply();
    }

    public void realizarPago(ClienteId entityId, Pago pago){
        appendChange(new PagoRealizado(entityId, pago)).apply();
    }

    public void cambiarCorreoDeDatos(ClienteId clienteId, Correo correo){
        appendChange(new CorreoDeDatosCambiado(clienteId, correo)).apply();
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

    public Tiquete tiquete() {
        return tiquete;
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

    public Datos datos() {
        return datos;
    }

    public Pago pago() {
        return pago;
    }

    public Reserva reserva() {
        return reserva;
    }
}
