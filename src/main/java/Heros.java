import java.util.ArrayList;
import java.util.List;

public class Heros{
  //Initialize class Variables for the Heros
  private String hName;
  private int hAge;
  private List<String> hSuperpower;
  private List<String> hWeakness;
  private static List<Heros> myHeroes= new ArrayList<Heros>();

  public Heros(String name){
    hName = name;
    myHeroes.add(this);
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
}
