package classes_e_metodos;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        // AreaCirc.pi = 3;
        System.out.println(a1.area());

        AreaCirc a2 = new AreaCirc(5);
        // AreaCirc.pi = 6; // com membros estáticos é acessado dessa forma, diretamente da classe
        System.out.println(AreaCirc.area(100)); // utilizando métodos estáticos
    }
}
