public class PesonagemPaladino extends Personagem{
    public PesonagemPaladino (Personagem lider){
        listaItens.add(TipoItemEspada.getTipoItemEspada());
        setPersonagemLider(lider);
    }
    public String getDescricaoClasse(){
        return "Você pode pedir esse tipo de item";
    }
}
