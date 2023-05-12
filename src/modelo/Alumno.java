
package modelo;

public class Alumno {
    private String codigo;
    private String nombre;
    private String condicion;
    private float ponderado;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.condicion = "REGULAR";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public float getPonderado() {
        return ponderado;
    }
    
    public boolean marcarAsitencia(boolean asistencia){
        boolean resultado = false;
        
        return resultado;
    }
    
}
