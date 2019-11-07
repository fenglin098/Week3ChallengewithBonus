import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter name and email address
        JobSeeker js = new JobSeeker();
        System.out.println("Please enter your name: ");
        String jsName = sc.next();
        js.setName(jsName);
        System.out.println("Please enter your email address: ");
        String jsEmail = sc.next();
        js.setEmailAddress(jsEmail);

        //prompt user to enter education achievement
        Education jsEd = new Education();
        System.out.println("Please enter you degree type (Associate's, Bachelor's, Master's, PhD, etc: ");
        String jsDegree = sc.next();
        jsEd.setDegreeType(jsDegree);
        System.out.println("What was your major?");
        String jsMajor = sc.next();
        jsEd.setMajor(jsMajor);
        System.out.println("Which was the name of your University?");
        String jsSchool = sc.next();
        jsEd.setSchool(jsSchool);
        System.out.println("What year did you graduate?");
        int



    }

}
