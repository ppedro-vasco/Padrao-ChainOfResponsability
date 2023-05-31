public class PedidoComIngredienteFaltante implements IPedido{
    private static PedidoComIngredienteFaltante ingredienteFaltante = new PedidoComIngredienteFaltante();

    private PedidoComIngredienteFaltante() {};

    public static PedidoComIngredienteFaltante getIngredienteFaltante() {
        return ingredienteFaltante;
    }
}
