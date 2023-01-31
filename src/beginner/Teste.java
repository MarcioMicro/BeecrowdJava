package beginner;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      double score1 = input.nextDouble();
      if (score1 < 0 || score1 > 10) {
        System.out.println("nota invalida");
      } else {
        double score2 = input.nextDouble();
        if (score2 < 0 || score2 > 10) {
          System.out.println("nota invalida");
        } else {
          double avg = (score1 + score2) / 2;
          System.out.printf("media = %.2f\n", avg);

          System.out.println("novo calculo (1-sim 2-nao)");
          int choice = input.nextInt();

          if (choice == 2) {
            break;
          } else if (choice != 1) {
            System.out.println("novo calculo (1-sim 2-nao)");
          }
          input.close();
        }
      }
    }
  }
}