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

    public abstract String getDescricaoClasse();

    public String needItem(Item item){
        if (listaItens.contains(item.getTipoItem())){
            return getDescricaoClasse();
        }
        else {
            if (lider != null){
                return lider.needItem(item);
            }
            else {
                return "Você não pode pedir esse tipo de item";
            }
        }
    }
}

