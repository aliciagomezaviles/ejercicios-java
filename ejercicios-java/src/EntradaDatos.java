import javax.swing.*;

public class EntradaDatos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = Integer.parseInt(numeroStr);

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numerobinario = 0b111110100; //anteponiendo 0b ya entiende que es numero binario
        System.out.println("numerobinario = " + numerobinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 0764; //Si anteponemos el 0 ya detecta que es numero octal
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);

        int numeroHex = 0x1f4; //Anteponiendo 0x ya entiende que es numero hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
