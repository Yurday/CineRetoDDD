package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cine.entities.Tiquete;
import domain.cliente.Cliente;
import domain.cliente.entities.Datos;
import domain.cliente.entities.Pago;
import domain.cliente.entities.Reserva;
import domain.cliente.values.ClienteId;
import domain.cliente.values.NombreCliente;

public class ClienteCreado extends DomainEvent {

    private final ClienteId clienteId;
    private final Datos datos;
    private final Pago pago;
    private final Reserva reserva;

    public ClienteCreado(ClienteId clienteId, Tiquete tiquete, NombreCliente nombreCliente, Datos datos, Pago pago, Reserva reserva) {
        super("cineretoddd.domain.cliente.clientecreado");
        this.clienteId = clienteId;
        this.datos = datos;
        this.pago = pago;
        this.reserva = reserva;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Datos getDatos() {
        return datos;
    }

    public Pago getPago() {
        return pago;
    }

    public Reserva getReserva() {
        return reserva;
    }
}