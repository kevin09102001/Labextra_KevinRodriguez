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
public class admequipos {
    private ArrayList<equipos> listaequipo = new ArrayList();
    private File archivo = null;

    public admequipos(String path) {
        archivo = new File(path);
    }

    public ArrayList<equipos> getListaequipo() {
        return listaequipo;
    }

    public void setListaequipo(ArrayList<equipos> listaequipo) {
        this.listaequipo = listaequipo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    

    @Override
    public String toString() {
        return "listaequipo=" + listaequipo;
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (equipos t : listaequipo) {
                bw.write(t.getNombre()+ ";");
                bw.write(t.getLogo()+ ";");
                bw.write(t.getPais()+ ";");
                bw.write(t.getCantganados()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaequipo = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaequipo.add(new equipos(sc.next(),
                            sc.next(),
                            sc.next(),
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
