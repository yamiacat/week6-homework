public class DigitalCamera implements Printable {

  private String name;
  private String details;
  private String hiddenFunction;

  public DigitalCamera(String name, String details, String hiddenFunction){
    this.name = name;
    this.details = details;
    this.hiddenFunction = hiddenFunction;
  }

  public String printDetails(){
    return (" - Name: " + this.name + ", Details: " + this.details);
  }

  public String printBlackOps(){
    return (" - Mission Spec: " + this.hiddenFunction);
  }

}
