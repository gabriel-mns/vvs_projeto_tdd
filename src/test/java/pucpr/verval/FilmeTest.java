package pucpr.verval;

import junit.framework.TestCase;
import org.junit.Test;

public class FilmeTest extends TestCase {

    @Test
    public void testarValidacaoFilmeSemNome(){

        assertFalse(Filme.validar(""));
        assertFalse(Filme.validar(" "));
        assertFalse(Filme.validar("   "));

    }

    @Test
    public void testarCriacaoFilme(){

        String nomeFilme = "Filme";

        Filme filme = new Filme(nomeFilme);

        assertEquals(nomeFilme, filme.getNome());
        
    }
}
