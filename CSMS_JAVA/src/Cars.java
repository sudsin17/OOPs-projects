import java.util.Scanner;

public class Cars extends Showroom implements utility {
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    
    @Override
    public void get_details(){
        System.out.println("NAME: " + car_name);
        System.out.println("COLOR: " + car_color);
        System.out.println("FUEL TYPE: " + car_fuel_type);
        System.out.println("PRICE: " + car_price);
        System.out.println("CAR TYPE: " + car_type);
    }

    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================***ENTER CAR DETAILS***=====================");
        System.out.print("CAR NAME: ");
        car_name = sc.nextLine();
        System.out.print("CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.print("CAR FUEL TYPE (petrol/diesel): ");
        car_fuel_type = sc.nextLine();
        System.out.print("CAR PRICE: ");
        car_price = sc.nextInt();
        sc.nextLine();  // consume newline
        System.out.print("CAR TYPE: ");
        car_type = sc.nextLine();
        
        total_cars_in_stock++;
        
    }
}