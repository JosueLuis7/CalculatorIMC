// Josué Luís Pimenta Alecrim
// 1261948087
// Na altura usa-se " , "
import java.util.Scanner;

public class App {
    public static String calcularIMC(double peso, double altura) {
    
        double imc = peso / (altura * altura);
        
        if (imc < 18.5) {
            return "Risco de magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Normal";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau 1";
        } else if (imc >= 35 && imc <= 39.9) {
        return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    } 
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe o peso em kg");
    double peso = input.nextDouble();

    System.out.println("Informe a altura");
    double altura = input.nextDouble();

    double imc = peso / (altura * altura);
    System.out.println("O IMC (Indice de massa corporal) é:" + imc);
    
    String resultado = calcularIMC(peso, altura);
    System.out.println(resultado);
input.close();
}
}