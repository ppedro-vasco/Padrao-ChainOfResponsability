public class TipoItemPatua implements TipoItem{
    private static TipoItemPatua tipoItemPatua = new TipoItemPatua();
    private TipoItemPatua(){};
    public static TipoItemPatua getTipoItemPatua(){
        return tipoItemPatua;
    }
}



