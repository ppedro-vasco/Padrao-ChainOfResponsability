public class FuncionarioAtendente extends Funcionario{
    public FuncionarioAtendente(Funcionario superior) {
        listaPedidos.add(RecebePedido.getRecebePedido());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
