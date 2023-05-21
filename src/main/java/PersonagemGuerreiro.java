public class PersonagemGuerreiro extends Personagem {
    public PersonagemGuerreiro(Personagem lider){
        listaItens.add(TipoItemEspada.getTipoItemEspada());
        setPersonagemLider(lider);

    }
    public String getDescricaoClasse(){
        return "Você pode pedir esse tipo de item";
    }
}
