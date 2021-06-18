package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.FechaHora;
import domain.cliente.values.ReservaId;

public class ModificarFechaHoraDeReserva implements Command {

    private final ReservaId reservaId;
    private final FechaHora fechaHora;

    public ModificarFechaHoraDeReserva(ReservaId reservaId, FechaHora fechaHora){
        this.reservaId = reservaId;
        this.fechaHora = fechaHora;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public FechaHora getFechaHora() {
        return fechaHora;
    }
}