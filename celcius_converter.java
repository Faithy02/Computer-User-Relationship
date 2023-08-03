
//This code recieves  farenheight values and converts them into degress celcius valuees
import javax.swing.JOptionPane;
/**
 * @author (Siphesihle Mashaba)

 */
public class celcius_converter
{
    public static void main(String[]args)
    {
        int temp = 1;
        double fahrenheit ;
        double celsius;
        
        do 
        {fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Please enter fahrenheit value"+temp+": "));
        celsius = ((fahrenheit-32)*5/9);
        temp++;
    }
        while(temp < 6);
           { if(celsius > 38){
               System.out.println("Please enter fahrenheit value"+temp+fahrenheit);             
               System.out.println("Celsius: "+celsius+"Extremely hot");
            }
             else
             if(celsius < 10){
                 System.out.println("Celsius"+celsius+"Very cold");
                }
            }
            
            
        
    }
}
