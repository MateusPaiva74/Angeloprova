public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Angelo", 30, 15000.00, "Garoto de Programa");
        Gerente gerente1 = new Gerente("Angelo Filho", 35, 10000.00, "Gerente de Vendas", "Vendas");
        Estagiario estagiario1 = new Estagiario("Angelo Neto",18, "Noite");

        System.out.println("Info do Funcionário:");
        funcionario1.exibirInfo();

        System.out.println("\nInfo do Gerente:");
        gerente1.exibirInfo();

        System.out.println("\nInfo do Estagiário:");
        estagiario1.exibirInfo();

        System.out.println("\nSalário do estagiario:"+ estagiario1.getSalario());
        System.out.println("Salário do Funcionário: " + funcionario1.getSalario());
        System.out.println("Salário do Gerente: " + gerente1.getSalario());
    }
}