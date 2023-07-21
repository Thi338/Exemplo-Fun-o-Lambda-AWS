package br.com.thiagocsilva;

import br.com.thiagocsilva.service.lambda.Funcao01;
import com.google.gson.JsonObject;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AppTest
{
    @Test
    public void Test() {

        Funcao01 f1 = new Funcao01();

        JsonObject resposta = new JsonObject();
        JsonObject mensagem = new JsonObject();

        assertEquals(resposta, mensagem);
    }

}
