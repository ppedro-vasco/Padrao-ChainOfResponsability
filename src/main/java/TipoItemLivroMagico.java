public class TipoItemLivroMagico implements TipoItem{
    private static TipoItemLivroMagico tipoItemLivroMagico = new TipoItemLivroMagico();
    private TipoItemLivroMagico(){};
    public static TipoItemLivroMagico getTipoItemLivroMagico(){
        return tipoItemLivroMagico;
    }

    @Override
    public String toString() {
        return "Livro de magia";
    }
}