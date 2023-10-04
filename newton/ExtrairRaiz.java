public class ExtrairRaiz {
    public static double sqrt(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("O número não pode ser menor que 0");
        }

        double aproximacao = num / 2; //estimativa inicial
        double epsilon = 0.0001; //tolerância de 10^(-4), quanto menor o valor, maior será a precisão da raiz

        while (aproximacao * aproximacao - num > epsilon * num) { //iteração
            aproximacao = 0.5 * (aproximacao + num / aproximacao);
        }

        return aproximacao;
    }
}