// Estoque.java
import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    // Adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // Remover produto
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    // Exibir os preços com desconto
    public void exibirPrecosComDesconto(double porcentagem) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagem);
            System.out.println(produto.getNome() + " - Preço com desconto: R$ " + precoComDesconto);
        }
    }
}
