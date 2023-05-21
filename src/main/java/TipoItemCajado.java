public class TipoItemCajado implements TipoItem{
    private static TipoItemCajado tipoItemCajado = new TipoItemCajado();
    private TipoItemCajado(){};
    public static TipoItemCajado getTipoItemCajado(){
        return tipoItemCajado;
    }
}
