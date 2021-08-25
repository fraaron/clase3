
package clases;


public class cliente {
    //(1)atributos
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;
    
    //(2)contructores 
    
    //constructor sin parametros
    public cliente() {
    }
    //constructores con parametros 
    public cliente(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //metodos accesadores y mutadores (get y set)

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //(4)METODO tostring() --> retornar los atributos de los 

    @Override //(sobreescribir)
    public String toString() {
        return "cliente{" + "rut= " + rut + ", nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + '}';
    }
    //(5) metodos customer (personalizados)--> destinados a resolver las problematicas 
    public String ofrecerCreidto(){
    //logica de negocio
        if (edad >=18 && edad <=50){
            return "apta para credito";
        } else {
            return "no puede pedir el credito";
        }
       
    }
    
    
    
}
