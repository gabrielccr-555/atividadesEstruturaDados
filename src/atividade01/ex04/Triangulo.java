public class Triangulo {
    double x1, x2;
    double y1, y2;
    double x3, y3;
    double a, b, c;
    
    public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) 
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        distanciaPontos();

        if (!trianguloExiste()) 
        {
            System.out.println("Triângulo inválido!");
        } else 
        {
            System.out.println("Triângulo válido!");
        }
    }

    // Método que verifica se o triângulo existe
    public boolean trianguloExiste() 
    {
        return this.a < this.b + this.c && this.b < this.a + this.c && this.c < this.a + this.b;
    }

    // Método que calcula a distância entre dois pontos e atribui aos lados
    public void distanciaPontos() 
    {
        this.a = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2)); 
        this.b = Math.sqrt(Math.pow(this.x3 - this.x2, 2) + Math.pow(this.y3 - this.y2, 2));
        this.c = Math.sqrt(Math.pow(this.x1 - this.x3, 2) + Math.pow(this.y1 - this.y3, 2));
    }

    // Método para calcular o perímetro do triângulo
    public double perimetroTriangulo() 
    {
        return this.a + this.b + this.c;
    }

    // Método para calcular a área do triângulo
    public double areaTriangulo() 
    {
        double p = (this.a + this.b + this.c) / 2;
        double area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return area;
    }

    // Método para calcular o centroide do triângulo
    public void centroideTriangulo() 
    {
        double x = (this.x1 + this.x2 + this.x3) / 3;
        double y = (this.y1 + this.y2 + this.y3) / 3;
        System.out.printf("O centroide do triângulo é: (%.2f, %.2f)%n", x, y);
    }
}
