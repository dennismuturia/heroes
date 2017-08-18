import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Squad{
  private String sName;
  private int sId;
  private static List<Squad> mySquads = new ArrayList<Squad>();
  private String[] sHeroes = new String[4];

  public Squad(String name){
    mySquads.add(this);
    sName = name;
    sId = mySquads.size();

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
  public static void clear(){
    mySquads.clear();
  }
  public int getMaxSize(){
    return sHeroes.length;
  }
}
