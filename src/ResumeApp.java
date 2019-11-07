import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        Resume resume1 = new Resume();
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter name and email address and set values
        JobSeeker js = new JobSeeker();
        System.out.println("Please enter your name: ");
        String jsName = sc.next();
        js.setName(jsName);
        System.out.println("Please enter your email address: ");
        String jsEmail = sc.next();
        js.setEmailAddress(jsEmail);
        resume1.setArrUser(js);

        //prompt user to enter education achievement and set values
        Education jsEd = new Education();
        System.out.println("Please enter you degree type (Associate's, Bachelor's, Master's, PhD, etc: )");
        String jsDegree = sc.next();
        jsEd.setDegreeType(jsDegree);
        System.out.println("What was your major?");
        String jsMajor = sc.next();
        jsEd.setMajor(jsMajor);
        System.out.println("Which was the name of your University?");
        String jsSchool = sc.next();
        jsEd.setSchool(jsSchool);
        System.out.println("What year did you graduate?");
        int jsYear = sc.nextInt();
        jsEd.setGradYear(jsYear);

        //prompt user to enter work experience and set values
        WorkExperience jsWork = new WorkExperience();
        System.out.println("Please enter company name: ");
        String jsCompany = sc.next();
        jsWork.setCompany(jsCompany);
        System.out.println("Please enter your job title");
        String jsTitle = sc.next();
        jsWork.setJobTitle(jsTitle);
        System.out.println("Please enter your start date: ");
        String jsStart = sc.next();
        jsWork.setStartDate(jsStart);
        System.out.println("Please enter your end date: ");
        String jsEnd = sc.next();
        jsWork.setEndDate(jsEnd);

        //prompt user to enter skills
        Skills jsSkills = new Skills();
        System.out.println("Please enter your skill: ");






    }

}
