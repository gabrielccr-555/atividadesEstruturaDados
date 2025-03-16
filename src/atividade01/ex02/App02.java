// O método VerificaSoma possui notação Big O de O(n^3)

import java.util.ArrayList;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) throws Exception {
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

        // Veririfica se existe número no ArrayList que seja a soma de dois números anteriores
        SomaDeDois.VerificaSoma(numeros);

        input.close();
    }
}
