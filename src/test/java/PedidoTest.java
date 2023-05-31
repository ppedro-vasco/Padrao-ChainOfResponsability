import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    FuncionarioGerente gerente;
    FuncionarioAtendente atendente;
    FuncionarioCozinheiro cozinheiro;
    FuncionarioEntregador entregador;
    @BeforeEach
    void setUp(){
        gerente = new FuncionarioGerente(null);
        entregador = new FuncionarioEntregador(gerente);
        cozinheiro = new FuncionarioCozinheiro(entregador);
        atendente = new FuncionarioAtendente(cozinheiro);
    }

    @Test
    void deveRetornarAtendenteParaAtenderPedido() {
        assertEquals("Atendente", atendente.interagirPedido(new Pedido(RecebePedido.getRecebePedido())));
    }
    @Test
    void deveRetornarCozinheiroParaAtenderPedido() {
        assertEquals("Cozinheiro", atendente.interagirPedido(new Pedido(PreparaPedido.getPreparaPedido())));
    }
    @Test
    void deveRetornarEntregadorParaAtenderPedido() {
        assertEquals("Entregador", atendente.interagirPedido(new Pedido(EntregaPedido.getEntregaPedido())));
    }
    @Test
    void deveRetornarGerenteParaAtenderPedido() {
        assertEquals("Gerente", atendente.interagirPedido(new Pedido(RegistraPagamentoPedido.getRegistroPagamentoPedido())));
    }
    @Test
    void deveRetornarPedidoComIngredienteFaltante() {
        assertEquals("Estabelecimento sem ingredientes para fabricar o pedido.", atendente.interagirPedido(new Pedido(PedidoComIngredienteFaltante.getIngredienteFaltante())));
    }
}
