// O método VerificaSoma possui notação Big O de O(n^2)

import java.util.ArrayList;

public class Repetido {
    public static void VerificaRepetido(ArrayList<Integer> array) 
    {
        int repetido;
        for (int i = 0; i < array.size(); i++) 
        {
            for (int j = i + 1; j < array.size(); j++) 
            {
                if (array.get(i) == array.get(j)) 
                {
                    repetido = array.get(i);
                    System.err.printf("%nNúmero repetido: %d%n", repetido);
                }
            }
        }
    }
}
