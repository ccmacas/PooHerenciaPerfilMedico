package registromedico;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//Variables de instancia.
public class PerfilMedico {
    // atributos

    private String nombre;
    private String apellido;
    private String sexo;
    private Fecha fechaNac;
    private double altura;
    private double peso;

// constructor
    public PerfilMedico(String nombre, String apellido, String sexo, Fecha fechaNac, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.altura = altura;
        this.peso = peso;
    }

// metodo calcular edad
    public int calcularEdad() {
        // formato de fechas
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // convertir el objto fecha en objeto date para java
        LocalDate fechaNacF = LocalDate.parse(this.fechaNac.toString(), formato);
        // obtenemos la fecha actual
        LocalDate fechaHoy = LocalDate.now();
        // creamos un objeto period que almacena la diferencia entre dos fechas
        Period periodo = Period.between(fechaNacF, fechaHoy);
        // retornamos los años que hya entre las dos fechas
        return periodo.getYears();
    }

    // metodo frecCarMax ()
    public int frecCarMax() {
        if (this.sexo == "F") {
            return 226 - this.calcularEdad();
        } else {
            return 220 - this.calcularEdad();
        }
    }

    // metodo de rangoFrecCar().
    public String rangoFrecCar() {
        return String.format("%.0f - %.0f", this.frecCarMax() * 0.5, this.frecCarMax() * 0.85);
    }

    // metodo calBMI().
    public double calBMI() {
        double cBMI = this.peso / (this.altura * this.altura);
        return cBMI;
    }

    // metodo toString
    @Override
    public String toString() {
        return String.format("Nombres: %s %s \t Edad: %d \nSexo: %s\t Fecha de Nacimiento: %s\nPeso: %.2f \t Altura: %.2f ",
                this.nombre, this.apellido, this.calcularEdad(), this.sexo, this.fechaNac, this.peso, this.altura);
    }
}
