package Veterinaria;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesional pro1 = new Profesional();
        Animal ani1 = new Animal();
        Dueno d1 = new Dueno();
        Servicio sr1 = new Servicio();
        
        pro1.setApellido("Medina");
        pro1.setNombre("Alfredo");
        pro1.setDirecc("mz19 pc02 puerta del sol");
        pro1.setDni(42984283);
        pro1.setEspecialidad("cirugia");
        pro1.setFechaNacimiento(23032001);
        pro1.setMatricula("AG15T");
        pro1.setNumeroTel("3644156484");
        
        d1.setApellido("Perez");
        d1.setNombre("Pablo");
        d1.setDirecc("c  15 e 20 y 22 centro");
        d1.setDni(28944583);
        d1.setNumeroTel("3644648484");
        d1.setFechaNacimiento(28011989);
        
        
        ani1.setNombre("puchi");
        ani1.setEdad(5);
        ani1.setEspecie("gato");
        ani1.setRaza("Siames");
        ani1.setAltura(32.2);
        ani1.setestado("Herida abierta de 3cm en pata izquierda");
        ani1.setPeso(3.4);
        ani1.setDueno(d1);
        ani1.setPelaje("Blanco con negro en los extemos del cuerpo");
        
        sr1.setInforme("Se le desinfecto la herida y se le aplico un vendaje y un collar isabelino ");
        sr1.setTipoServi("Curacion de herida menor");
        sr1.setPrecio(2500.00);
        sr1.setM1(ani1);
        
        
        
        
        
        
    }
    
}
