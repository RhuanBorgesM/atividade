// Alimento.java
public class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        // Alimentos têm um desconto direto conforme a porcentagem dada
        double desconto = preco * porcentagem / 100;
        return preco - desconto;
    }
}
