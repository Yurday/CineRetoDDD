package domain.cliente;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cine.entities.Cartelera;
import domain.cine.entities.Sala;
import domain.cine.entities.Tiquete;
import domain.cine.events.CineCreado;
import domain.cine.values.CineId;
import domain.cine.values.NombreCine;
import domain.cliente.entities.Datos;
import domain.cliente.entities.Pago;
import domain.cliente.entities.Reserva;
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

    public Cliente (ClienteId clienteId, Tiquete tiquete, NombreCliente nombreCliente, Datos datos, Pago pago, Reserva reserva){
        super(clienteId);
        appendChange(new ClienteCreado(clienteId, tiquete, nombreCliente, datos, pago, reserva)).apply();
    }

    private Cliente(ClienteId clienteId) {
        super(clienteId);
        subscribe(new ClienteChange(this));
    }

    //Factoría que permite crear el agregado
    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void cambiarCorreoDeDatos(Correo correo){
        appendChange(new CorreoDeDatosCambiado(correo)).apply();
    }

    public void cambiarNombreCliente(NombreCliente nombreCliente){
        appendChange(new NombreClienteCambiado(nombreCliente)).apply();
    }

    public void cambiarTelefonoDeDatos(Telefono telefono){
        appendChange(new TelefonoDeDatosCambiado(telefono)).apply();
    }

    public void modificarFechaHoraDeReserva(FechaHora fechaHora){
        appendChange(new FechaHoraDeReservaModificada(fechaHora)).apply();
    }

    public void modificarFormaDePago(FormaDePago formaDePago){
        appendChange(new FormaDePagoModificada(formaDePago)).apply();
    }

    public void modificarSillaDeReserva(Silla silla){
        appendChange(new SillaDeReservaModificada(silla)).apply();
    }

    public void realizarPago(Pago pago){
        appendChange(new PagoRealizado(pago)).apply();
    }

    public void realizarReserva(ClienteId clienteId, Reserva reserva){
        appendChange(new ReservaRealizada(clienteId, reserva)).apply();
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
