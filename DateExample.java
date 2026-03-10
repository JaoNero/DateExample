import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class DateExample {
        public static void main(String[] args) {
            Scanner SC = new Scanner(System.in);

            System.out.print("Enter  your name: ");
            String name = SC.nextLine();

            System.out.print("Enter  your gender: male or female: ");
            String gender = SC.nextLine();

            System.out.print("Enter your Birth Date(ค.ศ.): ");
            int Birth = SC.nextInt();

            LocalDateTime now = LocalDateTime.now();
            System.out.print("Now: " + now);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
            String formattedDate = now.format(formatter);

            int year = now.getYear();
            int age = year - Birth;
           
            System.out.println("............................................");

            if(!gender.equals("male") && !gender.equals("female") ){
                System.out.println("กลับไปกรอกใหม่ไอ้เอ๋อ");
                return;
            }

            if(age >= 18 && gender.equals("male")){
                System.out.println(name + " You can vote and serve nation " + age);
            }else if(age >= 18 ){
                System.out.println(name + " You can vote " + age);
            }else{
                System.out.println(name + " You can not vote " + age);
            }
}
}//n