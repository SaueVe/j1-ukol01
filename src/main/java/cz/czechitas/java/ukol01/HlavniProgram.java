package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

/*
    nakresliPrasatko();

    posun(-250,-230);

    nakresliOsmiuehlnik();

    posun(150,0);

    nakresliKruh();

    posun(150,0);

    nakresliSlunce();
*/
    posun(100,-130);

    nakresliPrasatko();

    posun(100,-100);

    nakresliDomecek();

    posun(-80,200);

    for(int i = 0; i < 5; i++) {
      nakresliDomecek();
      posun(-200,0);
    }

    posun(120,-200);

    nakresliDomecek();

    posun(20,350);

    nakresliSlunce();

  }

  public void nakresliDomecek() {
    for (int i = 0; i < 2; i++) {
      zofka.move(100);
      zofka.turnRight(90);
      zofka.move(80);
      zofka.turnRight(90);
    }
    zofka.move(100);

    zofka.turnRight(45);
    zofka.move(56);
    zofka.turnRight(90);
    zofka.move(56);
    zofka.turnRight(45);

    zofka.move(100);
    zofka.turnLeft(180);
  }

  public void nakresliNohy() {
    zofka.turnLeft(120);
    zofka.move(20);
    zofka.turnLeft(180);
    zofka.move(20);
    zofka.turnLeft(120);
    zofka.move(20);
    zofka.turnLeft(180);
    zofka.move(20);
    zofka.turnLeft(120);
  }

  public void nakresliPrasatko(){
    zofka.turnLeft(90);
    nakresliDomecek();

    zofka.turnLeft(90);
    zofka.move(80);
    zofka.turnRight(90);

    nakresliNohy();
    zofka.move(100);
    nakresliNohy();

    zofka.turnLeft(180);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(80);

    for(int i = 0; i < 75; i++){
      zofka.move(1);
      zofka.turnRight(3);
    }
    zofka.turnRight(60);
    for(int i = 0; i < 90; i++){
      zofka.move(1);
      zofka.turnRight(3);
    }
    zofka.turnLeft(195);
  }

  public void nakresliOsmiuehlnik(){
    zofka.turnLeft(90);
    for(int i = 0; i < 8; i++){
      zofka.move(30);
      zofka.turnRight(45);
    }
    zofka.turnRight(90);
  }

  public void nakresliKruh(){
    zofka.turnLeft(90);
    for(int i = 0; i < 180; i++){
      zofka.move(1);
      zofka.turnRight(2);
    }
    zofka.turnRight(90);
  }

  public void nakresliSlunce(){
    zofka.turnLeft(90);
    for(int i = 0; i < 12; i++){
      for(int x = 0; x < 15; x++) {
        zofka.move(1);
        zofka.turnRight(2);
      }
      zofka.turnLeft(90);
      zofka.move(15);
      zofka.turnLeft(180);
      zofka.move(15);
      zofka.turnLeft(90);
    }
    zofka.turnRight(90);
  }
  public void posun(int x, int y){
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(x);
    zofka.turnLeft(90);
    zofka.move(y);
    zofka.penDown();

  }

}
