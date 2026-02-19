import java.util.*;

public class PaySystem {
    //fields
    private ArrayList<Student> students;

    //consructors
    public PaySystem() {
        students = new ArrayList<>();
    }

    //methods
    public String transactionsByDay(int month, int day) {
        String s = "";
        for (Student st : students) {
            ArrayList<Transaction> tByDay = st.getTransactionByDate(month, day);
            if (tByDay != null && !tByDay.isEmpty()) {
                s += "Student: " + st.getName() + " ID: " + st.getID() + "\n";
                for (Transaction t : tByDay) {
                    s += " " + t.toString() + "\n";
                }
            }
        }
        return s;
    }

    public void logMeal(int month, int day, int id) {
        for (Student st : students) {
            if (st.getID() == id) {
                st.chargeLunch(month, day);
            }
        }
    }

   //add balance to specific student
    public void addBalance(int month, int day, double amount, int id) {
        for (Student st : students) {
            if (st.getID() == id) {
                st.addFunds(month, day, amount);
            }
        }
    }


   // add students
   public void addStudent(String name) {
        students.add(new Student(name));
    }


   //display students
    public void displayStudents() {
        for (Student st : students) {
            System.out.println(st);
        }
    }



   //display negative balance
   public void displayNegBalances() {
        for (Student st : students) {
            if (st.getBalance() < 0) {
                System.out.println(st);
            }
        }
    }


    public Student getStudentFromID(int id) {
        for (Student st : students) {
            if (st.getID() == id) return st;
        }
        return null;
    }


    public String toString() {
        String studentFacts = "Students:\n";
        for (Student st : students) {
            studentFacts += st + "\n";
        }
        return studentFacts;
    }
}
