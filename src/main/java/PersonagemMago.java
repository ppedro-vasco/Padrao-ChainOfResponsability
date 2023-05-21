public class PersonagemMago extends Personagem{
    public PersonagemMago(Personagem lider){
        listaItens.add(TipoItemCajado.getTipoItemCajado());
        setPersonagemLider(lider);

    }
    public String getDescricaoClasse(){
        return "Você pode pedir esse tipo de item";
    }
}
