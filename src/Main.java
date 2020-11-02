import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int J=1;
        while (J !=0){
            J++;

        System.out.println("|--------------------|");
        System.out.println("|    1.Products      |");
        System.out.println("|    2.Orders        |");
        System.out.println("|    3.Exit          |");
        System.out.println("|--------------------|");

        Scanner scanner = new Scanner(System.in);
        int respuesta = scanner.nextInt();
        if (respuesta==1){
        Menu menu = new Menu();
        menu.menuproducto();
        }

        else if (respuesta==2){
            //menu
            // add order
            // see order
            //
        }

        else if (respuesta==3){
            break;

        }
    }
}
}