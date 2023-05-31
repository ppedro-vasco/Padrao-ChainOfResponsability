public class PreparaPedido implements IPedido{
    private static PreparaPedido preparaPedido = new PreparaPedido();

    private PreparaPedido(){};
    public static PreparaPedido getPreparaPedido(){
        return preparaPedido;
    }
}
