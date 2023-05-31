public class FuncionarioCozinheiro extends Funcionario{
    public FuncionarioCozinheiro(Funcionario superior) {
        listaPedidos.add(PreparaPedido.getPreparaPedido());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Cozinheiro";
    }
}
