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

@Test
public void photographerHasName(){
  assertEquals("Modesty Blaise", photospecialist.getName());
}

@Test
public void photographerStartsUnequipped(){
  assertEquals(0, photospecialist.cameraCount());
}

@Test
public void photographerCanEquipCameras(){
  photospecialist.equip(digitalCamera);
  assertEquals(1, photospecialist.cameraCount());
}

@Test
public void photographerCanDitchCamera(){
  photospecialist.equip(digitalCamera);
  photospecialist.ditchEvidence();
  assertEquals(0, photospecialist.cameraCount());
}

@Test
public void photographerCanGiveGearStatus(){
  photospecialist.equip(digitalCamera);
  photospecialist.equip(analogCamera);
  assertEquals(" - Name: Nikon 34T, Details: Noise reduction filter - Name: Sony ILCE5100L, Details: No noise reduction", photospecialist.gearStatus());
}

@Test
public void photographerCanGiveBlackOpsStatus(){
  photospecialist.equip(digitalCamera);
  photospecialist.equip(analogCamera);
  assertEquals(" - Mission Spec: Neurotoxin Darts - Mission Spec: X-Ray mode", photospecialist.blackOpsStatus());
}


@Test
public void photoJournalCanBeRead(){
  assertEquals(47, photospecialist.numberOfPhotos());
}






}
