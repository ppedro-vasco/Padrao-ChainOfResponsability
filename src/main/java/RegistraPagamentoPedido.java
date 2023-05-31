public class RegistraPagamentoPedido implements IPedido{
    private static RegistraPagamentoPedido registraPagamentoPedido = new RegistraPagamentoPedido();

    private RegistraPagamentoPedido(){};
    public static RegistraPagamentoPedido getRegistroPagamentoPedido(){
        return registraPagamentoPedido;
    }
}
