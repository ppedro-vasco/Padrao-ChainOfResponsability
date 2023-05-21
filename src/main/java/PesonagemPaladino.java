public class PesonagemPaladino extends Personagem{
    public PesonagemPaladino (Personagem lider){
        listaItens.add(TipoItemEscudo.getTipoItemEscudo());
        setPersonagemLider(lider);
    }
    public String getMensagem(Item item){
        return "Paladino equipou o item: " + item.getTipoItem();
    }
}
