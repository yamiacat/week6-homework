public class CelestialAbode {
  private String abodeName;
  private God[] pantheon;

  public CelestialAbode(String abodeName) {
    this.abodeName = abodeName;
    this.pantheon = new God[12];
  }

  public String getAbodeName() {
    return this.abodeName;
  }

  public int pantheonCount(){
    int count = 0;
    for (God god : pantheon) {
      if (god != null) {
        count++;
      }
    }
    return count;
  }

  public void deify(God god){
    if (isPantheonFull()){
      return;
    }
    int pantheonIndex = pantheonCount();
    pantheon[pantheonIndex] = god;
  }

  public boolean isPantheonFull(){
    return pantheonCount() == pantheon.length;
  }










}