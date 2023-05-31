public class EntregaPedido implements IPedido{
    private static EntregaPedido entregaPedido = new EntregaPedido();

    private EntregaPedido(){};
    public static EntregaPedido getEntregaPedido(){
        return entregaPedido;
    }
}
