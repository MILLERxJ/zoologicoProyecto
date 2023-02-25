package org.example.clases;

public class Familia {

    public String nombrePapa;
    protected String nombreMama;
    private String nombreHijo;
    private Integer edadPapa;

    public Familia() {
    }

    public Familia(String nombrePapa, String nombreMama, String nombreHijo, Integer edadPapa) {
        this.nombrePapa = nombrePapa;
        this.nombreMama = nombreMama;
        this.nombreHijo = nombreHijo;
        this.edadPapa = edadPapa;
    }

    public String getNombrePapa() {
        return nombrePapa;
    }

    public void setNombrePapa(String nombrePapa) {
        this.nombrePapa = nombrePapa;
    }

    public String getNombreMama() {
        return nombreMama;
    }

    public void setNombreMama(String nombreMama) {
        this.nombreMama = nombreMama;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public Integer getEdadPapa() {
        return edadPapa;
    }

    public void setEdadPapa(Integer edadPapa) {
        if(edadPapa < 0 || edadPapa > 20){
            System.out.println("La edad debe ser menor a 20");
        }else{
            this.edadPapa = edadPapa;
        }
    }
}
