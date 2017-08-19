import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Squad{
  private String sName;
  private int sId;
  private static List<Squad> mySquads = new ArrayList<Squad>();
  private List<Heros> sHeroes;

  public Squad(String name){
    mySquads.add(this);
    sName = name;
    sId = mySquads.size();
    sHeroes = new ArrayList<Heros>();
  }
  public String getName(){
    return sName;
  }
  public int getId(){
    return sId;
  }
  public static List<Squad> all(){
    return mySquads;
  }
  public static Squad find(int id) {
    return mySquads.get(id - 1);
  }
  public static void clear(){
    mySquads.clear();
  }
  public int getMaxSize(){
    return sHeroes.size();
  }
  public List<Heros>getHeroes(){
    return sHeroes;
  }
  public void addHero(Heros heros){
    sHeroes.add(heros);
  }
}
