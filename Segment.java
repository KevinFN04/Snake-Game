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
    
    /**
     * Draw one segment in a determinate canvas.
     */
    public void drawSegment(Canvas canvas)
    {
        canvas.setForegroundColor(color);
        if (direccion == 0){ //Hacia la derecha. -->
            canvas.drawLine(posX, posY, posX + Segment.LONGITUD_SEGMENTO, posY);
        }
        else if (direccion == 1){ //Hacia abajo. !^
            canvas.drawLine(posX, posY, posX, posY + Segment.LONGITUD_SEGMENTO);
        }
        else if (direccion == 2){ //Hacia la izquierda. <--
            canvas.drawLine(posX, posY, posX - Segment.LONGITUD_SEGMENTO, posY);
        }
        else if (direccion == 3){ //Hacia arriba. ^
            canvas.drawLine(posX, posY, posX, posY - Segment.LONGITUD_SEGMENTO);
        }
    }
    
    /**
     * Erase the segment.
     */
    public void eraseSegment(Canvas canvas)
    {
        canvas.setForegroundColor(Color.white);
        if (direccion == 0){ //Hacia la derecha. -->
            canvas.drawLine(posX, posY, posX + Segment.LONGITUD_SEGMENTO, posY);
        }
        else if (direccion == 1){ //Hacia abajo. !^
            canvas.drawLine(posX, posY, posX, posY + Segment.LONGITUD_SEGMENTO);
        }
        else if (direccion == 2){ //Hacia la izquierda. <--
            canvas.drawLine(posX, posY, posX - Segment.LONGITUD_SEGMENTO, posY);
        }
        else if (direccion == 3){ //Hacia arriba. ^
            canvas.drawLine(posX, posY, posX, posY - Segment.LONGITUD_SEGMENTO);
        }
    }
    
    /**
     * Return the X position.
     */
    public int getPosX()
    {
        return posX;
    }
    
    /**
     * Return the Y position.
     */
    public int getPosY()
    {
        return posY;
    }

    /**
     * Return the X Final position.
     */
    public int getPosXFinal()
    {
        int position = 0;
        if (direccion == 0){ //Hacia la derecha. -->
            position = posX + Segment.LONGITUD_SEGMENTO;
        }
        else if (direccion == 2){ //Hacia la izquierda. <--
            position = posX - Segment.LONGITUD_SEGMENTO;
        }
        return position;
    }
    
    /**
     * Return the Y Final position.
     */
    public int getPosYFinal()
    {
        int position = 0;
        if (direccion == 1){ //Hacia abajo. !^
            position = posY + Segment.LONGITUD_SEGMENTO;
        }
        else if (direccion == 3){ //Hacia arriba. ^
            position = posY - Segment.LONGITUD_SEGMENTO;
        }
        return position;
    }
    
    /**
     * Return the direction of the segment.
     */
    public int getDirection()
    {
        return direccion;
    }
}
