import java.util.ArrayList;

public class App04 {
    public static void main(String[] args) throws Exception {
        ArrayList<Triangulo> triangulos = new ArrayList<Triangulo>();

        // Criação dos objetos Triangulo

        Triangulo escaleno = new Triangulo(1, 1, 5, 4, 6, 2);
        Triangulo isosceles = new Triangulo(2, 3, 6, 7, 10, 3);
        Triangulo equilatero = new Triangulo(0, 0, 4, 0, 2, 4);

        // Adicionando os objetos à lista
        triangulos.add(escaleno);
        triangulos.add(isosceles);
        triangulos.add(equilatero);

        // Imprimindo as informações desejadas sobre o triângulo
        for (Triangulo triangulo : triangulos) 
        {
            System.out.printf("Triângulo: %d: %n", triangulos.indexOf(triangulo) + 1);
            System.out.printf("Área: %.2f%n", triangulo.areaTriangulo());
            System.out.printf("Perímetro: %.2f%n",triangulo.perimetroTriangulo());
            triangulo.centroideTriangulo();
        }
    }
}
