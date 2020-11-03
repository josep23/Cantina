import java.util.Scanner;

public class Menu {
    public void menuproducto(){
        int J2=1;
        while(1 !=0){
            J2++;
            System.out.println("|----------------------|");
            System.out.println("|    1.Add new product |");
            System.out.println("|    2.Delete product  |");
            System.out.println("|    3.Update product  |");
            System.out.println("|    4.List of products|");
            System.out.println("|    5.Back            |");
            System.out.println("|----------------------|");
            Scanner scanner = new Scanner(System.in);
            int respuesta = scanner.nextInt();
            if (respuesta==1){

            }
            else if (respuesta==2){

            }
            else if (respuesta==3){

            }
            else if (respuesta==4){

            }
            else if (respuesta==5){
                break;
            }
    }

}
    public void menupedidos(){
        //menu
        //
        //
        int J3=1;
        while(1 !=0){
            J3++;
            System.out.println("|----------------------|");
            System.out.println("|    1.Add order       |");
            System.out.println("|    2.See order       |");
            System.out.println("|    3.Back            |");
            System.out.println("|----------------------|");
            Scanner scanner = new Scanner(System.in);
            int respuesta = scanner.nextInt();

            if (respuesta==1){

            }
            else if (respuesta==2){

            }
            else if (respuesta==3){
                break;
            }
    }
    }
}