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


}
