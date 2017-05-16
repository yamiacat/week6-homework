class Fate {
  private God[] primordialChaos;

  public Fate(){
    this.primordialChaos = new God[99];
  }

  public int primordialChaosCount(){
    int count = 0;
    for (God god : primordialChaos) {
      if (god != null) {
        count++;
      }
    }
    return count;
  }

  public void obliterate(God god){
    if (isChaosFull()) {
      return;
    }
    int chaosIndex = primordialChaosCount();
    primordialChaos[chaosIndex] = god;
  }

  public boolean isChaosFull(){
    return primordialChaosCount() == primordialChaos.length;
  }

//   public void castDown(CelestialAbode celestialAbode){
//     for (God god : pantheon) {
//       obliterate(god);
//     }
// }



}
