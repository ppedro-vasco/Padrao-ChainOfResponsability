public class RecebePedido implements IPedido{
    private static RecebePedido recebePedido = new RecebePedido();

    private RecebePedido(){};
    public static RecebePedido getRecebePedido(){
        return recebePedido;
    }
}
