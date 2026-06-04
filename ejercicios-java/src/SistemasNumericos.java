public class SistemasNumericos {
    public static void main(String[] args) {
        
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numerobinario = 0b111110100; //anteponiendo 0b ya entiende que es numero binario
        System.out.println("numerobinario = " + numerobinario);

        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 0764; //Si anteponemos el 0 ya detecta que es numero octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4; //Anteponiendo 0x ya entiende que es numero hexadecimal
        System.out.println("numeroHex = " + numeroHex);

    }
}
