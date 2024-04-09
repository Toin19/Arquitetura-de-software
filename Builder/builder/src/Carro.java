public class Carro {
    private String marca; 
    private String modelo; 
    private int ano; 
    private String cor;

    public Carro(CarroBuilder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.ano = builder.ano;
        this.cor = builder.cor;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + "]";
    }



    public static class CarroBuilder {
        private String marca; 
        private String modelo; 
        private int ano; 
        private String cor;

        public CarroBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarroBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder setAno(int ano) {
            this.ano = ano;
            return this;
        }

        public CarroBuilder setCor(String cor) {
            this.cor = cor;
            return this;
        }

        public Carro build() {
            return new Carro(this);
        }
    }
}