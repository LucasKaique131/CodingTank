
import java.util.Scanner;

public class ProjetoSalario {

    // Calcular desconto do INSS
    public static double calcularInss(double salarioBruto) {
        if (salarioBruto <= 1212.00) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return salarioBruto * 0.09;
        } else if (salarioBruto <= 3641.03) {
            return salarioBruto * 0.12;
        } else {
            return salarioBruto * 0.14;
        }
    }

    // Calcular desconto Imposto de renda
    public static double calcularImpostoDeRenda (double salarioBruto){
        if (salarioBruto <= 1903.98) {
            return salarioBruto * 0;
        } else if (salarioBruto <= 2826.65) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 3751.05) {
            return salarioBruto * 0.15;
        } else if (salarioBruto <= 4664.68) {
            return salarioBruto * 0.225;
        } else {
            return salarioBruto * 0.275;
        }
    }

    //Formatar duas casas após a virgula
    public static String formatarSalario(double salarioBruto) {
        return String.format("%.2f", salarioBruto);
    }

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double salarioBruto;
        double descontoInss;
        double descontoIr;
        double salarioLiquido;

        for (int i = 1; i <= 5; i++){
            System.out.println("\nDigite o valor do salário bruto " + i + ": ");

            salarioBruto = leitura.nextDouble();

            descontoInss = calcularInss(salarioBruto);

            descontoIr = calcularImpostoDeRenda(salarioBruto);

            salarioLiquido = salarioBruto - descontoInss - descontoIr;

            System.out.println("Funcionário " + i);
            System.out.println("----------------------------------");
            System.out.println("Salário Bruto: R$ " + formatarSalario(salarioBruto));
            System.out.println("Desconto INSS: R$ " + formatarSalario(descontoInss));
            System.out.println("Desconto Imposto de renda: R$ " + formatarSalario(descontoIr));
            System.out.println("Salário líquido: R$ " + formatarSalario(salarioLiquido));

        }

    }
}
