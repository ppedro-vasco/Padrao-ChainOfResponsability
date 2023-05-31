public class FuncionarioEntregador extends Funcionario{
    public FuncionarioEntregador(Funcionario superior) {
        listaPedidos.add(EntregaPedido.getEntregaPedido());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Entregador";
    }
}
