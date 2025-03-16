import java.util.ArrayList;
import java.util.Scanner;

public class App03 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int k;

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

        // Valor inteiro k
        System.out.println("Insira um valor inteiro k: ");
        k = input.nextInt();

        // Método para reorganizar ArrayList segundo critério
        Reorganiza.ReorganizaArray(numeros, k);

        input.close();
    }
}
