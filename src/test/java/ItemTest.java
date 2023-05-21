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
        mago = new PersonagemMago(druida);
        paladino = new PesonagemPaladino(mago);
        guerreiro = new PersonagemGuerreiro(paladino);
    }

    // Paladino
    @Test
    void paladinoEquiparEscudo(){
        assertEquals("Paladino equipou o item: Escudo",
            paladino.equiparItem(new Item(TipoItemEscudo.getTipoItemEscudo())));
    }
    @Test
    void paladinoEquiparCajado(){
        assertEquals("Druida equipou o item: Cajado",
                paladino.equiparItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }
    @Test
    void paladinoEquiparLivroMagico(){
        assertEquals("Mago equipou o item: Livro de magia",
                paladino.equiparItem(new Item(TipoItemLivroMagico.getTipoItemLivroMagico())));
    }
    @Test
    void paladinoEquiparEspada() {
        assertEquals("Você não pode equipar esse tipo de item",
                paladino.equiparItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }

    // Guerreiro
    @Test
    void guerreiroEquiparEspada(){
        assertEquals("Guerreiro equipou o item: Espada",
                guerreiro.equiparItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }
    @Test
    void guerreiroEquiparCajado(){
        assertEquals("Druida equipou o item: Cajado",
                guerreiro.equiparItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }
    @Test
    void guerreiroEquiparLivroMagico(){
        assertEquals("Mago equipou o item: Livro de magia",
                guerreiro.equiparItem(new Item(TipoItemLivroMagico.getTipoItemLivroMagico())));
    }
    @Test
    void guerreiroEquiparEscudo(){
        assertEquals("Paladino equipou o item: Escudo",
                guerreiro.equiparItem(new Item(TipoItemEscudo.getTipoItemEscudo())));
    }

    // Druida
    @Test
    void druidaEquiparCajado(){
        assertEquals("Druida equipou o item: Cajado",
                druida.equiparItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }
    @Test
    void druidaEquiparEspada(){
        assertEquals("Você não pode equipar esse tipo de item",
                druida.equiparItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }
    @Test
    void druidaEquiparLivroMagico(){
        assertEquals("Você não pode equipar esse tipo de item",
                druida.equiparItem(new Item(TipoItemLivroMagico.getTipoItemLivroMagico())));
    }
    @Test
    void druidaEquiparEscudo(){
        assertEquals("Você não pode equipar esse tipo de item",
                druida.equiparItem(new Item(TipoItemEscudo.getTipoItemEscudo())));
    }

    // Mago
    @Test
    void magoEquiparLivroMagico(){
        assertEquals("Mago equipou o item: Livro de magia",
                mago.equiparItem(new Item(TipoItemLivroMagico.getTipoItemLivroMagico())));
    }
    @Test
    void magoEquiparCajado(){
        assertEquals("Druida equipou o item: Cajado",
                mago.equiparItem(new Item(TipoItemCajado.getTipoItemCajado())));
    }
    @Test
    void magoEquiparEspada(){
        assertEquals("Você não pode equipar esse tipo de item",
                mago.equiparItem(new Item(TipoItemEspada.getTipoItemEspada())));
    }
    @Test
    void magoEquiparEscudo(){
        assertEquals("Você não pode equipar esse tipo de item",
                druida.equiparItem(new Item(TipoItemEscudo.getTipoItemEscudo())));
    }
}
