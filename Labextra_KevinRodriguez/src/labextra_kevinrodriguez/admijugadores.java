/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labextra_kevinrodriguez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class admijugadores {

    private ArrayList<jugadores> listajugadores = new ArrayList();
    private File archivo = null;

    public admijugadores(String path) {
        archivo = new File(path);
    }

    public ArrayList<jugadores> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(ArrayList<jugadores> listajugadores) {
        this.listajugadores = listajugadores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaequipo=" + listajugadores;
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (jugadores t : listajugadores) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getApellido() + ";");
                bw.write(t.getNacionalidad() + ";");
                bw.write(t.getSexo() + ";");
                bw.write(t.getAtleta() + ";");
                bw.write(t.getEdad() + ";");
                bw.write(t.getCantmedallas() + ";");
                bw.write(t.getCantbalones() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listajugadores = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listajugadores.add(new jugadores(sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.next(),
                            sc.nextInt(),
                            sc.nextInt(),
                            sc.nextInt()
                    )
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
