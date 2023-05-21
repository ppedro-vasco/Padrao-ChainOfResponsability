import java.util.ArrayList;

public abstract class Personagem {
    protected ArrayList listaItens = new ArrayList();
    private Personagem lider;

    public Personagem getLider(){
        return lider;
    }

    public void setPersonagemLider(Personagem lider){
        this.lider = lider;
    }

    public abstract String getMensagem(Item item);

    public String equiparItem(Item item){
        if (listaItens.contains(item.getTipoItem())){
            return getMensagem(item);
        }
        else {
            if (lider != null){
                return lider.equiparItem(item);
            }
            else {
                return "Você não pode equipar esse tipo de item";
            }
        }
    }
}

