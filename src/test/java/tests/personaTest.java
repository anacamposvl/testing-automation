package tests;

import com.valen.clase7.Persona;
import org.testng.Assert;
import org.testng.annotations.Test;

public class personaTest {
    @Test
    public void validarNombre(){
        Persona persona = new Persona("Cesar", "Mejia", "30");
        Assert.assertEquals(persona.getNombre(), "cesar");
    }
    @Test
    public void validarNombreIncorrecto(){
            Persona persona = new Persona("Cesar", "Mejia", "30");

            Assert.assertNotEquals(persona.getNombre(), "Cesar2");
    }
    @Test
    public void validarSaludo(){
        Persona persona = new Persona("Octavio", "Mejia", "30");
        Assert.assertFalse(persona.saludar().equals("Hola, soy Octavio Mejia"));
    }
}
