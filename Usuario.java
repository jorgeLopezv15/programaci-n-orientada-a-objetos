public class Usuario {

    //propiedades del objeto
    String nombre;
    String apellidos;
    int edad;
    int fechadenacimiento;


    public Usuario(String nombre, String apellidos, int edad, int fechadenacimiento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechadenacimiento = fechadenacimiento;

    }

    //metodo gets
    public int getEdad(){
        return this.edad;
    }

    public int getFechadeNacimiento(){
        return this.fechadenacimiento;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public String getNombre(){
        return this.nombre;
    }

    //metodo sets
    public void setNombre(String nombre){
        this.nombre =nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos =apellidos;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setFechadeNacimiento(int fechadenacimiento){
        this.fechadenacimiento = fechadenacimiento;
    }



    // metodo
    public void monstarDatos(){
       
        System.out.println("Nombre:" + nombre );
        System.out.println("Apellidos" + apellidos);
        System.out.println("Edad" + edad);
        System.out.println("Fecha de Nacimiento" + fechadenacimiento);
    }

    


}
