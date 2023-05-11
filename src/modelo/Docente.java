
package modelo;

public class Docente {
    private String codigo;
    private String nombres;
    private String tipo;

    public Docente(String codigo, String nombres, String tipo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Docente{" + "codigo=" + codigo + ", nombres=" + nombres + 
                        ", tipo=" + tipo + '}';
    }
    
    public boolean registrarNota(float nota, 
            Matricula matricula ){
        boolean retorno = false;
        
        return retorno;
    }

    public boolean registrarAsistencia(boolean asistencia , 
            Matricula matricula ){
        boolean retorno = false;
        
        return retorno;
    }    
    
}
