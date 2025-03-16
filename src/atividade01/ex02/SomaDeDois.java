// O método VerificaSoma possui notação Big O de O(n^3)

import java.util.ArrayList;

public class SomaDeDois {
    public static void VerificaSoma(ArrayList<Integer> array) 
    {
        if (array.size() < 3) 
        {
            System.err.printf("%nO ArrayList precisa ter pelo menos 3 elementos para verificar a soma de dois números anteriores.");
            return;
        } // Garante que o ArrayList tenha pelo menos 3 elementos

        int i = 2;
        while (i != array.size()) 
        {
            for (int j = 0; j < i; j++) 
            {
                for (int k = j + 1; k < i; k++) {
                    if (array.get(i) == array.get(j) + array.get(k)) 
                    {
                        System.err.printf("%nExiste um elemento que é a soma de dois anteriores.");
                        return;
                    } 
                } // Fim do loop interno
            } // Fim do loop externo
            i += 1;
        } // Fim do while
        System.out.printf("%nNenhum elemento é a soma de dois anteriores.");
    }
}
