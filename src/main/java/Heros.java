import java.util.ArrayList;
import java.util.List;

public class Heros{
  //Initialize class Variables for the Heros
  private String hName;
  private int hAge;
  private List<String> hSuperpower;
  private List<String> hWeakness;

  public Heros(String name){
    hName = name;
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
}
