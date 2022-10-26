// i need to write my methods here
import java.util.ArrayList;

public class CafeUtil {

    // sum method
    public int getStreakGoal() {
        int sum = 0;
        for(int i = 1; i <= 10; i++){

            sum+=i;
            // System.out.println(sum);
        }
            return sum;
    }



    // array total method
    public double getOrderTotal(double[] pricesArray){
            double total = 0;
            for (int i = 0; i < pricesArray.length; i++) {
                total+=pricesArray[i];
            }
            return total;
    }


    // array list total method
    public void displayMenu(ArrayList<String> menuItems) {
            for (int i = 0; i < menuItems.size(); i++) {
                // String name = menuItems.get(i);
                System.out.println(i + " " + menuItems.get(i));
            }
    }

    // add customer method
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are" + customers.size() + "people in front of you");
        customers.add(userName);
    }

}




