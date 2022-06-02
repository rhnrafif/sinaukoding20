public class belajar{
  public static void main(String[] args) {
    for (int angka=1; angka<=40; angka++){
      int a = 0;
      int b = 1;
      for( b = 1; b <=40; b++){
        if(angka % b ==0){
          a++;
        }
      }
      if((a==2)&& (angka!=1)){
        System.out.print("Bilangan Prima");
      }else{
        System.out.print("Bukan Bilangan Prima");
      }



    }

  }





}
