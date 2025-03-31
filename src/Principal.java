public class Principal {
    public static void main(String[] args) {
        String nome = Console.lerString("Digite o nome do funcionário: ");
        float horas = Console.lerFloat("Digite o número de horas trabalhadas: ");
        float valorHora = Console.lerFloat("Digite o valor da hora trabalhada: ");

        FolhaPagamento operadorFolhaPgto = new FolhaPagamento(nome, horas, valorHora);
        operadorFolhaPgto.pagamento();

    
        Console.fecharScanner();
    }
}
