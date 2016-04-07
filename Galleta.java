import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Galleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galleta
{
    public static final int TAMAÑO_GALLETA = 8;
    private Random nAleat;
    private int posX;
    private int posY;
    
    /**
     * Constructor for objects of class Galleta
     */
    public Galleta()
    {
        nAleat = new Random();
        posX = nAleat.nextInt();
        posY = nAleat.nextInt();
    }
}
