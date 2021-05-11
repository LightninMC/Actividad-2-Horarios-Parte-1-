/*
 Detector de dias habiles e inabiles
 */
package actividad.pkg2.horarios.parte.pkg1;

import java.util.Scanner;

/**
 * * @author Michael Adael Salvador Cocom
 * https://github.com/LightninM
C
 */
public class Actividad2HorariosParte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
        MetodoDia dia = new MetodoDia();

        System.out.println("Porfavor introduce un dia de la semana");
        dia.setDia(entrada.nextLine());
        System.out.println(dia.getDia());

    }

}

class MetodoDia {
    
    private String dia;
    private String diaHF;
    
    public void setDia(String dia){
        
        this.dia = dia;
        
        if(this.dia.equalsIgnoreCase("lunes") || this.dia.equalsIgnoreCase("Martes") || 
           this.dia.equalsIgnoreCase("Miercoles") || this.dia.equalsIgnoreCase("Jueves") ||
           this.dia.equalsIgnoreCase("Viernes")){
            
            this.diaHF = "Dia habil";
        
        } else if(this.dia.equalsIgnoreCase("sabado") || this.dia.equalsIgnoreCase("domingo")){
            
            this.diaHF = "Fin de semana";
            
        } else{
            
                 this.diaHF = "Porfavor introduce un dia correcto";
                 
        } 
        
    }
    
    public String getDia(){
        return this.diaHF;
    }
    
}
