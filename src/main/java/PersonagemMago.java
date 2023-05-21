public class PersonagemMago extends Personagem{
    public PersonagemMago(Personagem lider){
        listaItens.add(TipoItemLivroMagico.getTipoItemLivroMagico());
        setPersonagemLider(lider);

    }
    public String getMensagem(Item item){
        return "Mago equipou o item: " + item.getTipoItem();
    }
}
