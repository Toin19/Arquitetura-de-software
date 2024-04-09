public abstract class CafeDecorator implements Cafe {
    private final Cafe cafeDecorator;

    public CafeDecorator(Cafe cafe){
        this.cafeDecorator = cafe;
    }

    @Override
    public double informarPreco(){
        return cafeDecorator.informarPreco();
    }

    @Override
    public String informarIngredientes(){
        return cafeDecorator.informarIngredientes();
    }

    public Cafe getCafe(){
        return cafeDecorator;
    }


}

