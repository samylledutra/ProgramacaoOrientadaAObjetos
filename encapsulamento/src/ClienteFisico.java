public class ClienteFisico extends Cliente {
    public ClienteFisico(String nome) {
        super(nome, "PessoaFisica");
    }

    @Override
    public double aplicarDesconto(double precoBase) {
        double desconto = 0.1;
        return precoBase * (1 - desconto);
    }
} 

