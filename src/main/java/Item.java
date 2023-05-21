public class Item {
    private TipoItem tipoItem;

    public Item(TipoItem tipoItem){
        this.tipoItem = tipoItem;
    }

    public TipoItem getTipoItem(){
        return tipoItem;
    }

    public void setTipoItem(TipoItem tipoItem){
        this.tipoItem = tipoItem;
    }
}