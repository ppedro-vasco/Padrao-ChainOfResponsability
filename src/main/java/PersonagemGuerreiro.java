public class PersonagemGuerreiro extends Personagem {
    public PersonagemGuerreiro(Personagem lider){
        listaItens.add(TipoItemEspada.getTipoItemEspada());
        setPersonagemLider(lider);

    }
    public String getMensagem(Item item){
        return "Guerreiro equipou o item: " + item.getTipoItem();
    }
}
