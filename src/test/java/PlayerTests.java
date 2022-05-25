import com.example.final_project_liu_caleb.Circle;
import com.example.final_project_liu_caleb.Player;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {
    @Test
    public void GettersArgConstructor(){
        Player p2=new Player(0,50,200, Color.BLUE);

        assertEquals(0,p2.getPosX());
        assertEquals(Color.BLUE,p2.getColor());
        assertEquals(200,p2.getHeight());
        assertEquals(50,p2.getWidth());
    }
    @Test
    public void GettersNoArgConstructor(){
        Player p1=new Player();

        assertEquals(Color.BLACK,p1.getColor());
        assertEquals(100,p1.getHeight());
        assertEquals(25,p1.getWidth());
    }

    @Test
    public void setters(){
        Player p1=new Player();

        p1.setPosY(100);

        assertEquals(100,p1.getPosY());
    }

}
