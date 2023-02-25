package org.example;

public class Animal {

    //Atributos
    protected Integer edad;
    String nombre;
    private String especie;
    Double peso;
    Double estatura;
    String colorPredominante;
    Boolean genero;
    Integer numeroPatas;
    String clasificacion; //Domestico o salvaje

    //Metodos especiales

    public Animal() {
    }

    public Animal(Integer edad, String nombre, String especie, Double peso, Double estatura, String colorPredominante, Boolean genero, Integer numeroPatas, String clasificacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.estatura = estatura;
        this.colorPredominante = colorPredominante;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.clasificacion = clasificacion;
    }

    //Metodos ordinarios
}
