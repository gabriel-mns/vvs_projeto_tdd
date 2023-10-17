import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import pucpr.verval.Filme;
import pucpr.verval.Playlist;

import java.util.ArrayList;

import static org.junit.Assert.assertThrows;

public class PlaylistTest extends TestCase {


    @Test
    public void testarInseirNoFinal(){

        Playlist playlist = new Playlist();
        Filme filmeValido = new Filme("Filme1");

        playlist.inserir(filmeValido);


        assertEquals(filmeValido, playlist.getList().get(playlist.getList().size()-1));
        assertThrows(
                IllegalArgumentException.class,
                () -> playlist.inserir(new Filme(""))
        );

    }


    @Test
    public void testarInserirDadosInvalidos(){

        assertThrows(
            IllegalArgumentException.class,
            () -> new Filme("")
        );

    }
}
