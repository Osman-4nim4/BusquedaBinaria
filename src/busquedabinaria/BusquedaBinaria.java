
package busquedabinaria;

public class BusquedaBinaria {

    public static void main(String[] args) {
        int [] numero={100,200,300,400,500,600,700,800,900,1000};
        
        int principio=0;
        int finalizar= numero.length-1;
        int NumeroBuscado=800;
        int lugar=0;
        int resultado=0;
        
        while(principio <= finalizar){
            lugar=(principio+finalizar)/2;
            if (numero[lugar]==NumeroBuscado)
            {
            resultado=lugar;
            break;
            }else if(numero[lugar]<NumeroBuscado){
                principio=lugar+1;
            }else{
                finalizar=lugar-1; 
            }
        }
        
        System.out.println("El numero " +"**"+ NumeroBuscado +"** " + "Fue encontrado en \npocision "+resultado);
        
    }
    
}
