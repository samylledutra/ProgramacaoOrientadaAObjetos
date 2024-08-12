public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double aplicarImposto(double preco) {
        double imposto = 0.1; 
        return preco * (1 + imposto);
    }

    public double aplicarTaxaAdicional(double preco) {
        double taxaAdicional = 50; 
        return preco + taxaAdicional;
    }

    public double calcularPrecoFinal(Cliente cliente) {
        double precoComDesconto = cliente.aplicarDesconto(this.precoBase);
        double precoComImposto = aplicarImposto(precoComDesconto);
        return aplicarTaxaAdicional(precoComImposto);
    }
} 