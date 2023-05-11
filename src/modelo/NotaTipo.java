
package modelo;


public class NotaTipo {
    private String nombre;
    private float peso;
    private boolean activo;

    public NotaTipo(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.activo =  true;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isActivo() {
        return activo;
    }
    
    public void  activar() {
        this.activo = true;
    }
    
    public void  desactivar() {
        this.activo = false;
    }

    @Override
    public String toString() {
        return "NotaTipo{" + "nombre=" + nombre + ", peso=" + peso + ", activo=" + activo + '}';
    }
    
    
    
    
    
}
