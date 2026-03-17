package corpo;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int quantidade;
    private String qualidadeDoProduto;
    private String localizacao;

    public Titulo(String nome, int quantidade, String qualidadeDoProduto, String localizacao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.qualidadeDoProduto = qualidadeDoProduto;
        this.localizacao = localizacao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getQualidadeDoProduto() {
        return qualidadeDoProduto;
    }

    public void setQualidadeDoProduto(String qualidadeDoProduto) {
        this.qualidadeDoProduto = qualidadeDoProduto;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Item: " + this.nome + " | Quantidade: " + this.quantidade;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.getNome());
    }

    public Titulo(){

    }
}