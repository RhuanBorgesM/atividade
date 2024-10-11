// Main.java
public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Criando produtos
        Produto tv = new Eletronico("TV", 2000.0);
        Produto arroz = new Alimento("Arroz", 20.0);

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(arroz);

        // Exibindo preços com 10% de desconto
        System.out.println("Preços com 10% de desconto:");
        estoque.exibirPrecosComDesconto(10.0);
    }
}
