/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_3;

/**
 *
 * @author jserranog
 */
public class Clase_libro {
    
    private String titulo;
    private String autor;
    private String Numero_paginas;
    private int calificacion;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumero_paginas() {
        return Numero_paginas;
    }

    public void setNumero_paginas(String Numero_paginas) {
        this.Numero_paginas = Numero_paginas;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Clase_libro(String titulo, String autor, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.calificacion = calificacion;
    }
    
    
    
    
    
}
