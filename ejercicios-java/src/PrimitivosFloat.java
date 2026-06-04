public class PrimitivosFloat {

    public static void main(String[] args) {

        float realFloat = 2.12e3f; //2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);

        char espacio = ' '; // \u0020, corresponde al espacio en unicode

        System.out.println("char corresponde en byte:" + espacio + Character.BYTES);

        char retroceso = '\b';

        System.out.println("char corresponde en byte:" + retroceso + Character.BYTES); //Elimina los 2 puntos
        System.out.println("char corresponde en byte:" + retroceso + retroceso + Character.BYTES); //Elimina los 2 puntos

        char tabulador = '\t';

        System.out.println("char corresponde en \t byte:" + tabulador + Character.BYTES); //Se puede poner también en la linea de texto

        char nuevaLinea = '\n';

        System.out.println("char corresponde en byte:" + nuevaLinea + Character.BYTES);

        char retornoCarro = '\r';

        System.out.println("char corresponde en byte:" + retornoCarro + Character.BYTES);








    }
}
