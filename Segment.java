import java.awt.Color;

/**
 * Write a description of class Segment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Segment
{
    public static final int LONGITUD_SEGMENTO = 4;
    private int posX;
    private int posY;
    private int direccion;
    private Color color;

    /**
     * Constructor for objects of class Segment
     * @param direccion 0-3 siendo 0 = derecha, 1 = abajo, 2 = izquierda y 3 = arriba.
     */
    public Segment(int posX, int posY, int direccion, Color color)
    {
        this.posX = posX;
        this.posY = posY;
        this.direccion = direccion;
        this.color = color;
    }
}
