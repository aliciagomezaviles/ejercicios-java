public class PrimitivosCaracteres {
    public static void main(String[] args) {
        
        char caracter = '\u0040'; //unicode de @
        System.out.println("caracter = " + caracter);
        
        char decimal = 64; //es el código de simbolos que se pueden buscar en google, el 64 es @
        System.out.println("decimal = " + decimal);
        
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

        System.out.println("decimal = caracter: " + (decimal == caracter));
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        System.out.println("char corresponde en byte = " + Character.BYTES);
        System.out.println("char corresponde en byte = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
        
    }
}
