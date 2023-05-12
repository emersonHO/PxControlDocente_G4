
package modelo;

import java.util.Date;


public class Session {
    private int numero;
    private Date fecha;
    private Asistencia [] asistencia;
    private int indice;

    public Session(int numero, Date fecha, int num_matriculados) {
        this.numero = numero;
        this.fecha = fecha;
        this.asistencia = new Asistencia[num_matriculados];
        this.indice = 0;
    }

    public int getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public boolean agregarAsistencia(Asistencia asistencia){
        boolean retorno = false;
        
        return retorno;
    }

    public Asistencia buscarAsistencia(Alumno alumno){
        Asistencia retorno = null;
        
        return retorno;
    }
    
}
