package Clases;

public class ObjCompetencia {
    private String Nombre;
    private String Edad;
    private String Categoria;
    private Double Resultado;

    public ObjCompetencia(){

    }

    public ObjCompetencia(String nombre, String edad, String categoria, Double resultado){
        Nombre = nombre;
        Edad = edad;
        Categoria = categoria;
        Resultado = resultado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Double getResultado() {
        return Resultado;
    }

    public void setResultado(Double resultado) {
        Resultado = resultado;
    }

    

}
