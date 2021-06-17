package cliente.events;

import cliente.values.DatosId;
import cliente.values.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoDeDatosCambiado extends DomainEvent {
    public TelefonoDeDatosCambiado (DatosId identityId, Telefono telefono){
        super("cineretoddd.cliente.telefonodedatoscambiado");
    }
}
