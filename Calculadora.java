
/**
 * Write a description of class Calculadora here.
 * 
 * @author Roberto Salazar Marquez 
 * @version 1.0
 */
import java.awt.*;

public class Calculadora extends Frame
{
    // instance variables - replace the example below with your own
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private Button b10, bMas, bMenos, bMult, bDiv, bIgual, bPunto, bBorrar;
    private TextField display;
    private Panel teclado, displ;
    

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        super("Calculadora");
        
        b1 = new Button("1");  b2 = new Button("2");
        b3 = new Button("3");  b4 = new Button("4");
        b5 = new Button("5");  b6 = new Button("6");
        b7 = new Button("7");  b8 = new Button("8");
        b9 = new Button("9");  b10 = new Button("0");
        bMas = new Button("+");  bMenos = new Button("-");
        bMult = new Button("*");  bDiv = new Button("/");
        bPunto = new Button(".");  bBorrar = new Button("C");
        
        display  = new TextField("0");
        teclado = new Panel();
        displ = new Panel();
        
        teclado.setLayout( new GridLayout(4,4,2,2) );
        teclado.add(b7);
        teclado.add(b8);
        teclado.add(b9);
        teclado.add(bDiv);
        teclado.add(b4);
        teclado.add(b5);
        teclado.add(b6);
        teclado.add(bMult);
        teclado.add(b1);
        teclado.add(b2);
        teclado.add(b3);
        teclado.add(bMenos);
        teclado.add(bIgual);
        teclado.add(b10);
        teclado.add(bpunto);
        teclado.add(bMas);
        
        
    }


}








