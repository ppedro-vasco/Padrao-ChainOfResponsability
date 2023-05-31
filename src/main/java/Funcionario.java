import java.util.ArrayList;
public abstract class Funcionario {
    protected ArrayList listaPedidos = new ArrayList();
    private Funcionario funcionarioSuperior;
    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }
    public abstract String getDescricaoCargo();

    public String interagirPedido(Pedido pedido) {
        if (listaPedidos.contains(pedido.getInteracaoPedido())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.interagirPedido(pedido);
            }
            else
            {
                return "Estabelecimento sem pedidos.";
            }
        }
    }

}
