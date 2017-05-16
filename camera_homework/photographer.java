import java.util.*;

public class Photographer {
  private String agentName;
  private ArrayList<Printable> cameraList;
  private HashMap <String, Integer> photoJournal;

  public Photographer(String agentName){
    this.agentName = agentName;
    this.cameraList = new ArrayList<Printable>();
    this.photoJournal = new HashMap<String, Integer>();
  }

  public String getName(){
    return this.agentName;
  }

  public int cameraCount(){
    return this.cameraList.size();
  }

  public void equip(Printable camera){
    this.cameraList.add(camera);
  }

  public Printable ditchEvidence(){
    if (cameraCount() > 0){
       return cameraList.remove(0);
    }
    return null;
  }

  public String gearStatus(){
    String statusReport = "";
    for (Printable camera : this.cameraList){
      statusReport += camera.printDetails();
    }
    return statusReport;
  }

  public String blackOpsStatus(){
    String statusReport = "";
    for (Printable camera : this.cameraList){
      statusReport += camera.printBlackOps();
    }
    return statusReport;
  }











}
