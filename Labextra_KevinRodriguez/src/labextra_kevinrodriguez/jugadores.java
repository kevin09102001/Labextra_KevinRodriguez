/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labextra_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class jugadores {
    public String nombre,apellido,nacionalidad,sexo,atleta;
    public int edad,cantbalones,cantmedallas;

    public jugadores(String nombre, String apellido, String nacionalidad, String sexo, String atleta, int edad, int cantbalones, int cantmedallas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.atleta = atleta;
        this.edad = edad;
        this.cantbalones = cantbalones;
        this.cantmedallas = cantmedallas;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAtleta() {
        return atleta;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    public int getCantbalones() {
        return cantbalones;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCantbalones(int cantbalones) {
        this.cantbalones = cantbalones;
    }

    public int getCantmedallas() {
        return cantmedallas;
    }

    public void setCantmedallas(int cantmedallas) {
        this.cantmedallas = cantmedallas;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}
