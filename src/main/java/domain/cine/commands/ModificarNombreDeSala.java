package domain.cine.commands;

import co.com.sofka.domain.generic.Command;
import domain.cine.values.NombreSala;
import domain.cine.values.SalaId;

public class ModificarNombreDeSala implements Command {

    private final SalaId salaId;
    private final NombreSala nombreSala;

    public ModificarNombreDeSala (SalaId salaId, NombreSala nombreSala){
        this.salaId = salaId;
        this.nombreSala = nombreSala;
    }

    public SalaId getSalaId() {
        return salaId;
    }

    public NombreSala getNombreSala() {
        return nombreSala;
    }
}
