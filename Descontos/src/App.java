public class App {
    public static void main(String[] args) {
        CalculadoraDescontos calculadora = new CalculadoraDescontos();
        
        
        calculadora.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Desconto Cliente Regular: " + calculadora.calcularDesconto(1200));

        calculadora.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Desconto Cliente VIP: " + calculadora.calcularDesconto(1000));

        calculadora.setDescontoStrategy(new DescontoFuncionario());
        System.out.println("Desconto Funcionário: " + calculadora.calcularDesconto(900));
    }
}
