package registromedico;

import java.util.Scanner;

public class RegistroMedico {

    public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = datos.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = datos.nextLine();
        System.out.print("Ingrese el sexo(F - M): ");
        String sexo = datos.nextLine();
        System.out.print("Ingrese la fecha de nacimiento(dd/mm/aaaa): ");
        String fecha = datos.nextLine();
        System.out.print("Ingrese la altura(cm): ");
        double altura = datos.nextDouble();
        System.out.print("Ingrese el peso(Kg): ");
        double peso = datos.nextDouble();
        System.out.println();

        Fecha f1 = new Fecha(fecha);
        PerfilMedico pm = new PerfilMedico(nombre, apellido, sexo, f1, altura, peso);
        System.out.println("==== Ficha Medica ====\n-- Datos Basicos --: ");
        System.out.println(pm);
        System.out.println("--Valores Calculados-- ");
        System.out.printf("Frecuencia Maxima: %d\n Rango de Frecuencia: %s\n", pm.frecCarMax(), pm.rangoFrecCar());
        System.out.printf("BMI: %.2f\n ", pm.calBMI());

        System.out.println("==== Valores de BMI ====");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o mas");

    }

}
