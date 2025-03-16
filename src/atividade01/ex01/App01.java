// O método VerificaSoma possui notação Big O de O(n^2)

import java.util.ArrayList;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Olá! Insira os valores do seu array: (-1 para finalizar): ");

        while (true) 
        {
            int num = input.nextInt();
            if (num == -1) 
            {
                break;
            }
            numeros.add(num);
        } // Fim da inserção de números no ArrayList

        // Mostra os números do ArrayList para conferência
        System.out.println("Números na lista: ");
        for (Integer i : numeros) 
        {
            System.out.printf("%d ", i);
        }
        
        // Veririfca se há número repetido no ArrayList
        Repetido.VerificaRepetido(numeros);

        input.close();
    }
}
