import java.util.*;

public class Photographer {
  private String agentName;
  private ArrayList<Printable> cameraList;
  private HashMap <String, Integer> photoJournal;

  public Photographer(String agentName){
    this.agentName = agentName;
    this.cameraList = new ArrayList<Printable>();
    this.photoJournal = new HashMap<String, Integer>();
    photoJournal.put("Monday", 6);
    photoJournal.put("Tuesday", 8);
    photoJournal.put("Wednesday", 19);
    photoJournal.put("Thursday", 3);
    photoJournal.put("Friday", 7);
    photoJournal.put("Saturday", 4);
    photoJournal.put("Sunday", 0);
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


  public int numberOfPhotos(){
    Integer photoAmounts = 0;
    Collection<Integer> photoValues = photoJournal.values();
    ArrayList<Integer> listOfValues = new ArrayList<Integer>(photoValues);
    for (Integer value : listOfValues){
      photoAmounts += value;
    }
    return photoAmounts;
  }


  





}
