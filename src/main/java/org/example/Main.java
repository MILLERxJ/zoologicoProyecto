package org.example;

import org.example.clases.Familia;

public class Main {
    public static void main(String[] args) {

        //En el main usamos las clases que nostros programamos
        Integer notaFinal = 5;
        //Para usar una clase debo crear un objeto de la clase
        //Un objeto en cualquier lenguaje es una variable especial
        Animal animal = new Animal();
        //Si ya tengo un objeto lo uso para acceder a los atributos y metodos de una clase
        animal.nombre = "Caballo";
        animal.edad = 10;

        Familia familia = new Familia();
        familia.setNombrePapa("Charly");
        familia.setNombreMama("Gaby");
        familia.setNombreHijo("Pablito");
        familia.setEdadPapa(600);
        System.out.println("El papa tiene: "+familia.getEdadPapa());

    }
}