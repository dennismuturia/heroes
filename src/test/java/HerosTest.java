import org.junit.*;
import static org.junit.Assert.*;

public class HerosTest{
  @Test
  public void hero_instantiatesCorrectly_true(){
    Heros myHero = new Heros("Batman");
    assertEquals(true, myHero instanceof Heros);
  }

  @Test
  public void hero_correctlyInstatiatesWithName_true(){
    Heros myHero = new Heros("Batman");
    assertEquals("Batman", myHero.getName());
  }

  @Test
  public void hero_instantiatesCorrectlyEithAge_true(){
    Heros myHero = new Heros("Batman");
    assertEquals(45, myHero.getAge(45));
  }

  @Test
  public void getArrayList_InstatiatesCorrectlyWithSuperPowers_true(){
    Heros myHero =new Heros("Batman");
    assertEquals(0, myHero.getSuperPower().size());
  }

  @Test
  public void getArrayList_InstatiatesCorrectlyWithWeakNess_true(){
    Heros myHero =new Heros("Batman");
    assertEquals(0, myHero.getWeakness().size());
  }

  @Test
  public void checkWeatherItReturnsAllTheInstances_true(){
    Heros myHero1 = new Heros("Batman");
    Heros myHero2 = new Heros("SpiderMan");

    assertEquals(true, Heros.all().contains(myHero1));
    assertEquals(true, Heros.all().contains(myHero2));
  }
}
