import java.util.Scanner;

public class Menu {
    public void menuproducto(){
        int J2=1;
        while(1 !=0){
            J2++;
        System.out.println("|----------------------|");
        System.out.println("|    1.add new product |");
        System.out.println("|    2.delete product  |");
        System.out.println("|    3.update product  |");
        System.out.println("|    4.list of products|");
        System.out.println("|    5.back            |");
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
}