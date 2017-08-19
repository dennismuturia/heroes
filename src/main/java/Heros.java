import java.util.ArrayList;
import java.util.List;

public class Heros{
  //Initialize class Variables for the Heros
  private String hName;
  private int hAge;
  private List<String> hSuperpower;
  private List<String> hWeakness;
  private static List<Heros> myHeroes= new ArrayList<Heros>();
  private int hId;

  public Heros(String name){
    hName = name;
    myHeroes.add(this);
    hId = myHeroes.size();
  }
  public String getName(){
    return hName;
  }
  public int getAge(int Age){
    hAge = Age;
    return hAge;
  }
  public List<String> getSuperPower(){
    hSuperpower = new ArrayList<String>();
    return hSuperpower;
  }
  public List<String> getWeakness(){
    hWeakness = new ArrayList<String>();
    return hWeakness;
  }
  public static List<Heros> all(){
    return myHeroes;
  }
  public static void clear(){
    myHeroes.clear();
  }
  public int getId() {
    return hId;
  }
  public static Heros find(int id) {
    return myHeroes.get(id - 1);
  }
}
