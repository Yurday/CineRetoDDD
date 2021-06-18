package usecase.cliente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.commands.CambiarCorreoDeDatos;
import domain.cliente.events.CorreoDeDatosCambiado;
import domain.cliente.values.ClienteId;
import domain.cliente.values.Correo;
import domain.cliente.values.DatosId;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class CambiarCorreoDeDatosUseCaseTest {

    private CambiarCorreoDeDatosUseCaseTest cambiarCorreoDeDatosUseCaseTest;

    @BeforeEach

    public void setup(){
        cambiarCorreoDeDatosUseCase = new CambiarCorreoDeDatosUseCaseTest();
    }

    @Test
    void CambiarCorreoDeDatoshappyPath(){
        //arrage
        var command = new CambiarCorreoDeDatos(
                DatosId.of("xxx-xxxx"),
                new Correo("Correo nuevo");
        );

        //act
        var response = UseCaseHandler.getInstance().syncExecutor(
                cambiarCorreoDeDatosUseCase, new RequestCommand<>(command)).orElseThrow();

        var events=response.getDomainEvents();

        //asserts
        CorreoDeDatosCambiado correoDeDatosCambiado = (CorreoDeDatosCambiado) events.get(0);
        Assertions.assertEquals("Correo cambiado", CorreoDeDatosCambiado.getCorreo().value();
    }
}