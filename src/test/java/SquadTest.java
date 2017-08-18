import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest{
  @Test
  public void checkWhetherSquadsInstantiatesCorrectly_true(){
    Squad mySquad = new Squad("Killer_Squad");
    assertEquals(true, mySquad instanceof Squad);
  }

  @Test
  public void getName_checkWhetherItInstantiateswithName_true(){
    Squad mySquad = new Squad("Killer_Squad");
    assertEquals("Killer_Squad", mySquad.getName());
  }

  @Test
  public void returnsAllTheSquadsinAList_true(){
    Squad mySquad1 = new Squad("Killer_Squad");
    Squad mySquad2 = new Squad("The_Finishers");
    assertEquals(true, Squad.all().contains(mySquad1));
    assertEquals(true, Squad.all().contains(mySquad2));
  }

  @Test
  public void getId_ChecksIfInstantiatesWithAnId(){
    Squad.clear();
    Squad mySquad = new Squad("Killer_Squad");
    assertEquals(1, mySquad.getId());
  }

  @Test
  public void maxsize_CheckTheMaxSize(){
    Squad mySquad = new Squad("Killer_Squad");
    assertEquals(4, mySquad.getMaxSize());
  }

  @Test
  public void joins_Squad(){
    Heros myHero = new Heros("SpiderMan");
    Squad mySquad = new Squad(myHero);
    assertEquals(true, mySquad.joinsTeam());



  }
}
