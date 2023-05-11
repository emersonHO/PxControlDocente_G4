
package modelo;

class Asistencia {
    private boolean estado;
    private Matricula matricula;

    public Asistencia(boolean estado, Matricula matricula) {
        this.estado = estado;
        this.matricula = matricula;
    }

    public boolean isEstado() {
        return estado;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "estado=" + estado + ", matricula=" + matricula + '}';
    }
    
    
    
}
