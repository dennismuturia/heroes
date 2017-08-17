import org.junit.*;
import static org.junit.Assert.*;

public class HerosTest{
  @Test
  public void hero_instantiatesCorrectly_true(){
    Heros myHero = new Heros("Batman");
    assertEquals(true, myHero instanceof Heros);
  }
}
