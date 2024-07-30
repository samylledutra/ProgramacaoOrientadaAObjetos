public class DescontoFuncionario implements DescontoStrategy {
    @Override
    public double calcularDesconto(double consumo) {
        return consumo * 0.30;
    }
}
