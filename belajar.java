public class Task1{
  public static void main(String[] args) {

    for (int angka = 1 ; angka <51; angka++){
      System.out.print(angka);
      if (angka % 3 == 0){
      System.out.print(angka + "habis dibagi 3");
      }
      else if (angka % 5 ==0) {
        System.out.print(angka + "habis dibagi 5");

      }
    }
  }

}
