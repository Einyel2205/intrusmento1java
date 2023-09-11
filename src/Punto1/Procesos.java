package Punto1;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {

	HashMap<String, ArrayList<String>> listPersonas;
    int mayores = 0, menores = 0, total = 0;

    public void iniciar() {
        String resp = "";
        do {
            ingresarDatos();
            resp = JOptionPane.showInputDialog("Ingrese 'si' para agregar otra persona");
        } while (resp != null && resp.equalsIgnoreCase("si"));

        mostrarInformacion();
    }

    public Procesos() {
        listPersonas = new HashMap<>();
        iniciar();
    }

    public void ingresarDatos() {
        String documento = JOptionPane.showInputDialog("Ingrese el documento de la persona");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
        String profesion = JOptionPane.showInputDialog("Ingrese la profesión de la persona");
        int edad = validarEdad();

        System.out.println("Nombre: " + nombre + "\nDocumento: " + documento + "\nProfesión: " + profesion + "\nEdad: " + edad);

        compararEdades(edad);
        total++;

        ArrayList<String> datosPersona = new ArrayList<>();
        datosPersona.add("Nombre: " + nombre);
        datosPersona.add("Documento: " + documento);
        datosPersona.add("Profesión: " + profesion);
        datosPersona.add("Edad: " + edad);

        listPersonas.put("Persona #" + total, datosPersona);
    }

    public int compararEdades(int edad) {
        if (edad >= 18) {
            mayores++;
        } else {
            menores++;
        }
        return edad;
    }

    public int validarEdad() {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Edad no válida. Intente nuevamente.");
            return validarEdad();
        }
    }

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Total personas registradas: " + total + "\nCantidad de personas mayores de edad: " + mayores + "\nCantidad de personas menores de edad: " + menores);

        
        for (String key : listPersonas.keySet()) {
            System.out.println("\n" + key);
            ArrayList<String> datosPersona = listPersonas.get(key);
            for (String dato : datosPersona) {
                System.out.println(dato);
            }
        }
    }
}
