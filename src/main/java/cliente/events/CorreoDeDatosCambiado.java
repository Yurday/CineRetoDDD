package cliente.events;

import cliente.values.Correo;
import cliente.values.DatosId;
import co.com.sofka.domain.generic.DomainEvent;

public class CorreoDeDatosCambiado extends DomainEvent {
    public CorreoDeDatosCambiado(DatosId identityId, Correo correo){
        super("cineretoddd.cliente.correodedatoscambiado");
    }
}