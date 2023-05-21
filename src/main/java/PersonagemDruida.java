public class PersonagemDruida extends Personagem{
    public PersonagemDruida(Personagem lider){
        listaItens.add(TipoItemPatua.getTipoItemPatua());
        setPersonagemLider(lider);
    }
    public String getDescricaoClasse(){
        return "Você pode pedir esse tipo de item";
    }
}