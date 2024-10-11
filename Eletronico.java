// Eletronico.java
public class Eletronico extends Produto {

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        // Eletrônicos têm 5% de desconto adicional sobre a porcentagem dada
        double desconto = (preco * porcentagem / 100) + (preco * 0.05);
        return preco - desconto;
    }
}
