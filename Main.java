public class Main {

    public static void main(String[] args){

        //Usuario 
        Usuario usuario1 = new Usuario("Jorge", "Lopez", 15,2009);
        Usuario usuario2 = new Usuario("Albert ", "Einstein", 70, 1910 );

        //metodo del objeto
        usuario1.setNombre("jorge");
        usuario1.monstarDatos();
        usuario2.monstarDatos();

        System.out.println(usuario1.getEdad());

        if (usuario1.getEdad() >= 18) {
            System.out.println("mayor de edad");
            
        }

        
       


    } 
    
}
