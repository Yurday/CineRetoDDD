package domain.cliente.commands;

import co.com.sofka.domain.generic.Command;
import domain.cliente.values.ReservaId;
import domain.cliente.values.Silla;

public class ModificarSillaDeReserva implements Command {

    private final ReservaId reservaId;
    private final Silla silla;

    public ModificarSillaDeReserva (ReservaId reservaId, Silla silla){
        this.reservaId = reservaId;
        this.silla = silla;
    }

    public ReservaId getReservaId() {
        return reservaId;
    }

    public Silla getSilla() {
        return silla;
    }
}
