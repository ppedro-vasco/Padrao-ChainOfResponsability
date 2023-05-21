import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    PersonagemDruida druida;
    PersonagemGuerreiro guerreiro;
    PersonagemMago mago;
    PesonagemPaladino paladino;

    @BeforeEach
    void setUp() {
        druida = new PersonagemDruida(null);
        guerreiro = new PersonagemGuerreiro(paladino);
        mago = new PersonagemMago(druida);
        paladino = new PesonagemPaladino(guerreiro);
    }

    @Test
    void paladinoNeedEspada() {
        assertEquals("Você pode pedir esse tipo de item",
                paladino.needItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }
    @Test
    void paladinoNeedCajado(){
        assertEquals("Você não pode pedir esse tipo de item",
                paladino.needItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }
    @Test
    void paladinoNeedPatua(){
        assertEquals("Você não pode pedir esse tipo de item",
                paladino.needItem(new Item(TipoItemPatua.getTipoItemPatua())));
    }
    @Test
    void guerreiroNeedEspada(){
        assertEquals("Você pode pedir esse tipo de item",
                guerreiro.needItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }
    @Test
    void guerreiroNeedCajado(){
        assertEquals("Você não pode pedir esse tipo de item",
                guerreiro.needItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }
    @Test
    void guerreiroNeedPatua(){
        assertEquals("Você não pode pedir esse tipo de item",
                guerreiro.needItem(new Item(TipoItemPatua.getTipoItemPatua())));
    }

    @Test
    void druidaNeedEspada(){
        assertEquals("Você não pode pedir esse tipo de item",
                druida.needItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }
    @Test
    void druidaNeedCajado(){
        assertEquals("Você não pode pedir esse tipo de item",
                druida.needItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }
    @Test
    void druidaNeedPatua(){
        assertEquals("Você pode pedir esse tipo de item",
                druida.needItem(new Item(TipoItemPatua.getTipoItemPatua())));
    }
    @Test
    void magoNeedEspada(){
        assertEquals("Você não pode pedir esse tipo de item",
                mago.needItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }
    @Test
    void magoNeedPatua(){
        assertEquals("Você pode pedir esse tipo de item",
                mago.needItem(new Item(TipoItemPatua.getTipoItemPatua())));
    }
    @Test
    void magoNeedCajado(){
        assertEquals("Você pode pedir esse tipo de item",
                mago.needItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }

}
