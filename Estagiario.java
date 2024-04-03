public class Estagiario extends Funcionario {
    private String periodo;
    public Estagiario(String nome, int idade, String periodo) {
        super(nome, idade, 500, "Estagiário");
        this.periodo = periodo;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Período: " + periodo);
    }
    public static void main(String[] args) {
        Estagiario estagiario1 = new Estagiario("Angelo neto", 15, "Noite");
        estagiario1.exibirInfo();
    }
}
