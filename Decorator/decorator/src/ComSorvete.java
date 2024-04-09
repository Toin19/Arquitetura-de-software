public class ComSorvete extends CafeDecorator {
    public ComSorvete(Cafe cafe){
        super(cafe);
    }

    @Override
    public double informarPreco(){
        return super.informarPreco() + 3.0;
    }

    @Override
    public String informarIngredientes(){
        return super.informarIngredientes() + ", Sorvete de creme";
    }
}
