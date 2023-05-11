
package modelo;

class Matricula {
    private boolean estado;
    private int promedio;
    private Alumno alumno;
    private Nota[] notas;
    private int indice;

    public Matricula(Alumno alumno) {
        this.alumno = alumno;
        this.estado = true;
        this.indice = 0;
        this.notas = new Nota[Configuracion.num_notas];
    }

    public boolean isEstado() {
        return estado;
    }

    public int getPromedio() {
        return promedio;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    
    public void calcularPromedio(int porc_asis){
        
    }
    public boolean registrarNota(float nota,NotaTipo tipo){
        boolean retorno = false;
        return retorno;
    }
    
    public boolean actualizarNota(float nota, NotaTipo tipo){
        boolean retorno = false;
        return retorno;
    }
    
    
}
