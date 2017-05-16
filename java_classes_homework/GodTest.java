import static org.junit.Assert.assertEquals;
import org.junit.*;

public class GodTest {
God titan;
God god1;
CelestialAbode celestialAbode1;
CelestialAbode celestialAbode2;
Fate fate;

  @Before
  public void before() {
    god1 = new God("Zeus", "Lightning Bolt!");
    titan = new God("Titan", "Usurp!");
    celestialAbode1 = new CelestialAbode("Olympos");
    celestialAbode2 = new CelestialAbode("Tartarus");
    fate = new Fate();
  }

  @Test
  public void hasName(){
    assertEquals("Zeus", god1.getName());
  }

  @Test
  public void hasPower(){
    assertEquals("Lightning Bolt!", god1.getPower());
  }

  @Test
  public void celestialAbodeHasName(){
    assertEquals("Olympos", celestialAbode1.getAbodeName());
  }

  @Test
  public void pantheonStartsEmpty(){
    assertEquals(0, celestialAbode1.pantheonCount());
  }

  @Test
  public void celestialAbodeCanAcceptGod(){
    celestialAbode1.deify(god1);
    assertEquals(1,celestialAbode1.pantheonCount());
  }

  @Test
  public void godCannotAscendWhenPantheonFull(){
    for(int i = 0; i < 15; i++) {
      celestialAbode1.deify(titan);
    }
    assertEquals(12, celestialAbode1.pantheonCount());
  }

  @Test
  public void isPantheonFull(){
    for(int i = 0; i < 12; i++) {
      celestialAbode1.deify(titan);
    }
    assertEquals(true, celestialAbode1.isPantheonFull());
  }

  @Test
  public void primordialChaosStartsEmpty(){
    assertEquals(0, fate.primordialChaosCount());
  }

  // @Test
  // public void fateCanCastDownGods(){
  //   celestialAbode1.deify(god1);
  //   fate.castDown(celestialAbode1);
  //   assertEquals(0, celestialAbode1.pantheonCount());
  // }

  @Test
  public void abodeCanCastGodsOut(){
    celestialAbode1.deify(god1);
    celestialAbode1.castOut(god1);
    assertEquals(0, celestialAbode1.pantheonCount());
  }


}
