
package modelo;

public class Curso {
    private String codigo;
    private String nombre;
    private int num_sessiones;
    private Docente docente;
    private Matricula [] matriculas;
    private int ind_matricula;
    private Session [] sesiones; 
    private int ind_sesiones;

    public Curso(String codigo, String nombre, int num_sessiones, Docente docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.num_sessiones = num_sessiones;
        this.docente = docente;
        
        this.matriculas = new Matricula[Configuracion.capacidad];
        this.ind_matricula =0;
        
        this.sesiones = new Session[num_sessiones];
        this.ind_sesiones = 0;
      
    }
     
    public void agregarMatricula(Matricula matricula) {
        if (this.ind_matricula < Configuracion.capacidad) {
            this.matriculas[ind_matricula] = matricula;
            this.ind_matricula++;
        } else {
            System.out.println("El curso está lleno. No se puede agregar más matrículas.");
        }
    }
    
    public Matricula buscarMatricula(Alumno alumno) {
        for (int i = 0; i < this.ind_matricula; i++) {
            Matricula matricula = this.matriculas[i];
            if (matricula.getAlumno().equals(alumno)) {
                return matricula;
            } else {
                System.out.println("El alumno no tiene una matricula");
            }
        }
        return null;
    }
    
    public void agregarSesion(Session session) {
        if (this.ind_sesiones < this.num_sessiones) {
            this.sesiones[this.ind_sesiones] = session;
            this.ind_sesiones++;
        
        } else {
            System.out.println("El curso ya tiene todas las sesiones programadas.");
        }
    }
    
    public Session buscarSession(int numeroS) {
        for (Session sesion : sesiones) {
            if (sesion.getNumero() == numeroS) {
                return sesion;
            }
        }
        return null;
    }
    
    public Asistencia buscarAsistencia(Alumno alumno) {
        for (Session sesion : sesiones) {
            Asistencia asistencia = sesion.buscarAsistencia(alumno);
            if (asistencia != null) {
                return asistencia;
            }
        }
        return null;
    } 
    
    public float calcularPorcentajeAsistencias(Alumno alumno) {
        Matricula matricula = buscarMatricula(alumno);
        if (matricula == null) {
            System.out.println("El alumno no se encuentra matriculado en el curso.");
            return -1;
        }
       
        float totalSesiones = sesiones.length;
        float sesionesAsistidas = 0;
    
        for (Session sesion : sesiones) {
            Asistencia asistencia = sesion.buscarAsistencia(alumno);
            if (asistencia != null && asistencia.isEstado()) {
                sesionesAsistidas++;
            }
        }
    
        return (sesionesAsistidas/totalSesiones)*100;
    }

}
