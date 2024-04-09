public abstract class Bebida {
    public final void preparar() {
        ferverAgua();
        adicionarIngredientes();
        servir();
    }

    abstract void ferverAgua();
    abstract void adicionarIngredientes();
    abstract void servir();
}