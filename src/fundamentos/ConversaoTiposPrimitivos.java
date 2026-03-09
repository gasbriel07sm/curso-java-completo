package fundamentos;

public class ConversaoTiposPrimitivos {
    public static void main(String[] args) {

        double a = 1; // conversão implícita (pois double maior que int)
        System.out.println(a);

        float b = (float) 1.0; // casting -> conversão explícita (transformar um "double" em float), pode ter perda de informação
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // deve ser feito casting, pois o int é maior que o d
        System.out.println(d);

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}
