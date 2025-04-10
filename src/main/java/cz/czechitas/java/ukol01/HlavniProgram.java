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

    zofka.penUp();
    zofka.move(300);
    zofka.turnRight(90);
    zofka.move(350);
    zofka.penDown();

    nakresliOsmiuehlnik();

    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(250);
    zofka.turnRight(180);
    zofka.penDown();

    nakresliKruh();

    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(250);
    zofka.turnRight(180);
    zofka.penDown();

    nakresliSlunce();
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
    zofka.turnLeft(15);
  }

  public void nakresliOsmiuehlnik(){
    for(int i =0; i < 8; i++){
      zofka.move(50);
      zofka.turnRight(45);
    }
  }

  public void nakresliKruh() {
    for(int i=0; i < 360; i++ ){
      zofka.move(1);
      zofka.turnRight(1);
    }
  }

  public void nakresliSlunce(){
    for(int i=0; i < 12; i++ ){
      for(int x = 0; x < 30; x++) {
        zofka.move(1);
        zofka.turnRight(1);
      }
      zofka.turnLeft(90);
      zofka.move(30);
      zofka.turnLeft(180);
      zofka.move(30);
      zofka.turnLeft(90);
    }
  }

}
