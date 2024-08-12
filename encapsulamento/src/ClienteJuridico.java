public class ClienteJuridico extends Cliente {
    public ClienteJuridico(String nome) {
        super(nome, "PessoaJuridica");
    }

    @Override
    public double aplicarDesconto(double precoBase) {
        double desconto = 0.2; 
        return precoBase * (1 - desconto);
    }
} 
