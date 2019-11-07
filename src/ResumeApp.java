import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        Resume resume1 = new Resume();
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter name and email address and set values
        ArrayList<JobSeeker> arrJobSeeker = new ArrayList<>();
        JobSeeker js = new JobSeeker();
        System.out.println("Please enter your name: ");
        String jsName = sc.next();
        sc.nextLine();
        js.setName(jsName);
        System.out.println("Please enter your email address: ");
        String jsEmail = sc.next();
        js.setEmailAddress(jsEmail);
        arrJobSeeker.add(js);
        resume1.setArrUser(arrJobSeeker);

        //print job seeker information
        for (JobSeeker j : arrJobSeeker) {
            System.out.println(String.format("%n%90s%n", " ").replaceAll(" ", "="));
            System.out.println("name:" + j.getName());
            System.out.println("email: " + j.getEmailAddress());
        }

        //prompt user to enter education achievement and set values
        ArrayList<Education> arrEd = new ArrayList<>();
        Education jsEd = new Education();
        System.out.println("Please enter you degree type (Associate's, Bachelor's, Master's, PhD, etc: )");
        String jsDegree = sc.next();
        jsEd.setDegreeType(jsDegree);
        System.out.println("What was your major?");
        String jsMajor = sc.next();
        jsEd.setMajor(jsMajor);
        System.out.println("Which was the name of your University?");
        String jsSchool = sc.next();
        sc.nextLine();
        jsEd.setSchool(jsSchool);
        System.out.println("What year did you graduate?");
        int jsYear = sc.nextInt();
        jsEd.setGradYear(jsYear);
        arrEd.add(jsEd);
        resume1.setArrEducation(arrEd);

        //print education information
        for (Education e : arrEd) {
            System.out.println("Education");
            System.out.println(e.getDegreeType() + " in " + e.getMajor());
            System.out.println(e.getSchool() + " " + e.getGradYear());
        }


        //prompt user to enter work experience and set values
        ArrayList<WorkExperience> arrWork = new ArrayList<>();
        WorkExperience jsWork = new WorkExperience();
        System.out.println("Please enter company name: ");
        String jsCompany = sc.next();
        sc.nextLine();
        jsWork.setCompany(jsCompany);
        System.out.println("Please enter your job title");
        String jsTitle = sc.next();
        jsWork.setJobTitle(jsTitle);
        sc.nextLine();
        System.out.println("Please enter your start date: ");
        String jsStart = sc.next();
        sc.nextLine();
        jsWork.setStartDate(jsStart);
        System.out.println("Please enter your end date: ");
        String jsEnd = sc.next();
        sc.nextLine();
        jsWork.setEndDate(jsEnd);
        System.out.println("Please enter your job description");
        String jsDescription = sc.next();
        jsWork.setJobDescription(jsDescription);
        arrWork.add(jsWork);
        resume1.setArrWorkExperience(arrWork);

        //print work experience
        for (WorkExperience w : arrWork) {
            System.out.println("Experience");
            System.out.println(w.getJobTitle());
            System.out.println(w.getCompany() + ", " + w.getStartDate() + " - " + w.getEndDate());
            System.out.println(w.getJobDescription());
        }

        //prompt user to enter skills
        ArrayList<Skills> arrTalent = new ArrayList<>();
        Skills jsSkills = new Skills();
        System.out.println("Please enter your skill: ");
        String jsSkill = sc.next();
        jsSkills.setSkillName(jsSkill);
        System.out.println("What is your rating for this skill? (Fundamental, Novice, Intermediate, Advanced, Expert)");
        String jsRating = sc.next();
        jsSkills.setSkillRating(jsRating);
        arrTalent.add(jsSkills);
        resume1.setArrSkills(arrTalent);

        //print skills
        for (Skills s : arrTalent) {
            System.out.println(s.getSkillName() + ", " + s.getSkillRating());
        }
    }
}

