import java.util.ArrayList;

public class Reorganiza {
    public static void ReorganizaArray(ArrayList<Integer> array, int k)
    {
        int menorIndex = 0;
        for (int i = 0; i < array.size() - 1; i++) 
        {
            if (array.get(i) <= k) 
            {
                int aux = array.remove(i);
                array.add(menorIndex, aux);
                menorIndex++;
                i--; // Obs: Para evitar que algum número não seja verificado!!
            }
        }
            
        System.out.print("Array reorganizado:");
        for (int num : array)
            System.err.printf(" %d", num);
    }
}
