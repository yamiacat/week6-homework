import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class CameraTest{
  Photographer photospecialist;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before(){
    photospecialist = new Photographer("Modesty Blaise");
    digitalCamera = new DigitalCamera("Nikon 34T", "Noise reduction filter", "Neurotoxin Darts");
    analogCamera = new AnalogCamera("Sony ILCE5100L", "No noise reduction", "X-Ray mode");
  }


}
