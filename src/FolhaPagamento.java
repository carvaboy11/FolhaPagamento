public class FolhaPagamento {
    private String nomeFuncionario;
    private float horasTrabalhadas;
    private float valorHora;
    private float salarioBruto;
    private float ir;
    private float inss;
    private float fgts;
    private float salarioLiquido;

    public FolhaPagamento(String nomeFuncionario, float horasTrabalhadas, float valorHora) {
        setNomeFuncionario(nomeFuncionario);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
        calcularFolha();
    }

    private void calcularFolha() {
        setSalarioBruto(horasTrabalhadas * valorHora);
        setIr(calcularIR(salarioBruto));
        setInss(calcularINSS(salarioBruto));
        setFgts(salarioBruto * 0.08f);
        setSalarioLiquido(salarioBruto - ir - inss);
    }

    private float calcularIR(float salario) {
        if (salario <= 1372.81f) return 0;
        if (salario <= 2743.25f) return salario * 0.15f;
        return salario * 0.275f;
    }

    private float calcularINSS(float salario) {
        if (salario <= 868.29f) return salario * 0.08f;
        if (salario <= 1447.14f) return salario * 0.09f;
        if (salario <= 2894.27f) return salario * 0.11f;
        return 318.37f;
    }

    public void pagamento() {
        System.out.println("\nFolha de Pagamento");
        System.out.println("------------------------------");
        System.out.println("Funcionário: " + getNomeFuncionario());
        System.out.printf("Salário Bruto: R$ %.2f%n", getSalarioBruto());
        System.out.printf("IR: R$ %.2f%n", getIr());
        System.out.printf("INSS: R$ %.2f%n", getInss());
        System.out.printf("FGTS: R$ %.2f%n", getFgts());
        System.out.printf("Salário Líquido: R$ %.2f%n", getSalarioLiquido());
    }


    public String getNomeFuncionario() { return nomeFuncionario; }
    public void setNomeFuncionario(String nomeFuncionario) { this.nomeFuncionario = nomeFuncionario; }

    public float getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(float horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }

    public float getValorHora() { return valorHora; }
    public void setValorHora(float valorHora) { this.valorHora = valorHora; }

    public float getSalarioBruto() { return salarioBruto; }
    public void setSalarioBruto(float salarioBruto) { this.salarioBruto = salarioBruto; }

    public float getIr() { return ir; }
    public void setIr(float ir) { this.ir = ir; }

    public float getInss() { return inss; }
    public void setInss(float inss) { this.inss = inss; }

    public float getFgts() { return fgts; }
    public void setFgts(float fgts) { this.fgts = fgts; }

    public float getSalarioLiquido() { return salarioLiquido; }
    public void setSalarioLiquido(float salarioLiquido) { this.salarioLiquido = salarioLiquido; }
}