public class PersonagemDruida extends Personagem{
    public PersonagemDruida(Personagem lider){
        listaItens.add(TipoItemCajado.getTipoItemCajado());
        setPersonagemLider(lider);
    }
    public String getMensagem(Item item){
        return "Druida equipou o item: " + item.getTipoItem();
    }
}