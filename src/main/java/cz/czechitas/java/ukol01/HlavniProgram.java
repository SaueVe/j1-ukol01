package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    nakresliPrasatko();
  }

  public void nakresliDomecek() {
    for (int i = 0; i < 2; i++) {
      zofka.move(120);
      zofka.turnRight(90);
      zofka.move(100);
      zofka.turnRight(90);
    }

    zofka.move(120);

    zofka.turnRight(45);
    zofka.move(71);
    zofka.turnRight(90);
    zofka.move(71);
    zofka.turnRight(45);

    zofka.move(120);
    zofka.turnLeft(180);
  }

  public void nakresliNohy() {
    zofka.turnLeft(30);
    zofka.move(30);
    zofka.turnLeft(180);
    zofka.move(30);
    zofka.turnLeft(120);
    zofka.move(30);
    zofka.turnLeft(180);
    zofka.move(30);
    zofka.turnLeft(120);
  }

  public void nakresliPrasatko(){
    zofka.turnLeft(90);
    nakresliDomecek();
    zofka.turnLeft(90);
    zofka.move(100);

    nakresliNohy();
    zofka.move(120);
    zofka.turnLeft(90);
    nakresliNohy();

    zofka.turnLeft(180);
    zofka.move(120);
    zofka.turnLeft(90);
    zofka.move(100);

    for(int i=0; i < 75; i++ ){
      zofka.move(1);
      zofka.turnRight(3);
    }
    zofka.turnRight(60);
    for(int i=0; i < 90; i++ ){
      zofka.move(1);
      zofka.turnRight(3);
    }
  }

}
