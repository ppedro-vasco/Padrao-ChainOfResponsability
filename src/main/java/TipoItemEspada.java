public class TipoItemEspada implements TipoItem{
    private static TipoItemEspada tipoItemEspada = new TipoItemEspada();
    private TipoItemEspada(){};
    public static TipoItemEspada getTipoItemEspada() {
        return tipoItemEspada;
    }
}
