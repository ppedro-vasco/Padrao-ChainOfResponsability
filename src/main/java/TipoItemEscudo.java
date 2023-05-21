public class TipoItemEscudo implements TipoItem{
    private static TipoItemEscudo tipoItemEscudo = new TipoItemEscudo();
    private TipoItemEscudo(){};
    public static TipoItemEscudo getTipoItemEscudo(){
        return tipoItemEscudo;
    }
    @Override
    public String toString() {
        return "Escudo";
    }
}



