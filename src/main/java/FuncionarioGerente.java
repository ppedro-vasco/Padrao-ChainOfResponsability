public class FuncionarioGerente extends Funcionario{
    public FuncionarioGerente(Funcionario superior) {
        listaPedidos.add(RegistraPagamentoPedido.getRegistroPagamentoPedido());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
