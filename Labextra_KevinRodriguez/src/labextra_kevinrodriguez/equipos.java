/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labextra_kevinrodriguez;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class equipos  {
    
    public String Nombre,logo,pais;
    public int cantganados;
    ArrayList<jugadores> lista=new ArrayList();

    public equipos(String Nombre, String logo, String pais, int cantganados) {
        this.Nombre = Nombre;
        this.logo = logo;
        this.pais = pais;
        this.cantganados = cantganados;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCantganados() {
        return cantganados;
    }

    public void setCantganados(int cantganados) {
        this.cantganados = cantganados;
    }

    public ArrayList<jugadores> getLista() {
        return lista;
    }

    public void setLista(ArrayList<jugadores> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return  Nombre ;
    }
    
    
    
}
