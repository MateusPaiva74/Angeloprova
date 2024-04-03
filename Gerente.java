public class Gerente extends Funcionario {
    private String departamento;
    public Gerente(String nome, int idade, double salario, String cargo, String departamento) {
        super(nome, idade, salario, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Departamento: " + departamento);
    }
}