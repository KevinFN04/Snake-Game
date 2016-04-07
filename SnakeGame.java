import java.awt.Color;
import java.util.Random;
/**
 * Clase SnakeGame
 * 
 * @author Miguel Bayon
 * @version 1.0
 */
public class SnakeGame
{
    private Snake adolf;
    private static final int ANCHO_LIENZO = 500;
    private static final int ALTO_LIENZO = 500;
    private Canvas lienzo;
    /*
     * Constructor de la clase Snake
     */
    public SnakeGame()
    {
        lienzo = new Canvas("SneikGame", ANCHO_LIENZO, ALTO_LIENZO);
    }

    /*
     * Dibuja una serpiente en la pantalla
     */
    public void drawSnake()
    {        
        adolf = new Snake(ANCHO_LIENZO, ALTO_LIENZO);
        lienzo.erase();
        adolf.dibujar(lienzo);
    }

    /**
     * Añade un método llamado animateSnake que lleve a cabo una animacion consistente en que la serpiente se mueve 
     * aleatoriamente por toda la pantalla. La animación termina en caso de que la serpiente quede encerrada sobre 
     * ella misma o sobre un borde del lienzo. En este caso se debe mostrar el mensaje "Game Over" sobre el propio 
     * lienzo.
     */
    public void animateSnake(){                 
        drawSnake();
        boolean continua = true;
        while (continua){
            lienzo.wait(60);            
            adolf.borrar(lienzo);
            continua = adolf.mover(lienzo);
            adolf.dibujar(lienzo);            
        }

        lienzo.drawString("<<GAME OVER>>", (ANCHO_LIENZO/2) - 45, (ALTO_LIENZO/2) - 45);
    }

}