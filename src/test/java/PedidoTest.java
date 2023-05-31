import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    FuncionarioAtendente atendente;
    FuncionarioCozinheiro cozinheiro;
    FuncionarioEntregador entregador;
    @BeforeEach
    void setUp(){
        atendente = new FuncionarioAtendente(null);
        cozinheiro = new FuncionarioCozinheiro(atendente);
        entregador = new FuncionarioEntregador(cozinheiro);
    }

    @Test
    void deveRetornarSecretariaParaAssinaturaHistorico() {
        assertEquals("Entregador", entregador.interagirPedido(new Pedido(EntregaPedido.getEntregaPedido())));
    }
    @Test
    void deveRetornarSecretariaParaAssinaturaHistorico1() {
        assertEquals("Cozinheiro", entregador.interagirPedido(new Pedido(PreparaPedido.getPreparaPedido())));
    }
    @Test
    void deveRetornarSecretariaParaAssinaturaHistorico2() {
        assertEquals("Atendente", entregador.interagirPedido(new Pedido(RecebePedido.getRecebePedido())));
    }
}
