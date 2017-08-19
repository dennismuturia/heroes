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
  public void clear_emptiesAllSquadsFromList_0() {
    Squad mySquad = new Squad("KIller_squad");
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }

  @Test
  public void getId_ChecksIfInstantiatesWithAnId(){
    Squad mySquad = new Squad("Killer_Squad");
    assertEquals(1, mySquad.getId());
  }

  @Test
  public void find_returnsSquadWithSameId_secondSQuad() {
    Squad.clear();
    Squad firstSquad = new Squad("KIller_squad");
    Squad secondSquad = new Squad("The_Finishers");
    assertEquals(Squad.find(secondSquad.getId()), secondSquad);
  }
  @Test
  public void maxsize_CheckTheMaxSize(){
    Squad mySquad = new Squad("Killer_Squad");
    assertEquals(0, mySquad.getMaxSize());
  }

  @Test
  public void getHeroes_initiallyInnstatiateswithEmplyArray(){
    Squad.clear();
    Squad mySquad = new Squad("Killer_Squad");
    assertEquals(0, mySquad.getHeroes().size());
  }

  @Test
  public void addHeroes_initiallyAddstheHeroes(){
    Squad mySquad = new Squad("KIller_squad");
    Heros myHero = new Heros("Batman");
    mySquad.addHero(myHero);
    assertTrue(mySquad.getHeroes().contains(myHero));
  }

  @Test
  public void getHero_initiallyReturnsEmptyList_ArrayList() {
    Squad.clear();
    Squad mySquad = new Squad("KIller_squad");
    assertEquals(0, mySquad.getHeroes().size());
  }
}
