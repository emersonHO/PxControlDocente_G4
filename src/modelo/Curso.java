
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
        
    /*
    +agregarMatricula(mat:Matricula)
    +buscarMatricula(al:Alumno):boolean
    +agregarSession(se:Seccion)
    +buscarSession(numero:int):Session
    +buscarAsistencia(al:Alumno):Asistencia[]
    +calcularPorcentanjeAsistencia(al:Alumno):int
    */
}
