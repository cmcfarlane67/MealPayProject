public class MealPayRunner {
    public static void main(String[] args){
        PaySystem a = new PaySystem();

        System.out.println("Adding students:");
        a.addStudents("Bobby Bobbs");
        a.addStudents("Joe Schmo");
        a.addStudents("Kelly Shelly");
        a.addStudents("Bobby Bobbs");

        System.out.println("Displaying the students: ");

        a.displayStudents();

        System.out.println("Charging the students and adding funds: ");
        a.addBalance(2, 19, 31, 1);
        a.logMeal(2, 19, 1);
        a.logMeal(2, 20, 1);
        a.logMeal(2, 20, 2);
        a.logMeal(2, 20, 2);
        a.logMeal(2, 20, 2);
        a.addBalance(2,20,100,3);
        a.addBalance(2, 21, 108, 3);
        a.logMeal(2, 21, 3);
        a.logMeal(2, 20, 4);

        a.displayStudents();

        System.out.println("Who has a negative balance? ");
        a.displayNegBalances();

        System.out.println("Who's ID #1? ");
        a.getStudentFromID(1);

        System.out.println("Who's ID #2? ");
        a.getStudentFromID(2);

        System.out.println("Who's ID #4? ");
        a.getStudentFromID(4);

        System.out.println("What transactions happened on 2/20? ");
        System.out.println(a.transactionsByDay(2, 20));

        System.out.println("What transactions happened on 2/21? ");
        System.out.println(a.transactionsByDay(2, 21)); 
    }
}
