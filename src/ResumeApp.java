import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args) {
        ArrayList<Resume> resumebuilder = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String answerE;
        String answerW;
        String answerJ;
        String answerS;
        String answerEducation;
        String answerJobSeeker;
        do {
            Resume resume1 = new Resume();
            //Prompt user to enter name and email address and set values
            ArrayList<JobSeeker> arrJobSeeker = new ArrayList<>();
            JobSeeker js = new JobSeeker();
            System.out.println("Please enter your name: ");
            String jsName = sc.next();
            jsName += sc.nextLine();
            js.setName(jsName);
            System.out.println("Please enter your email address: ");
            String jsEmail = sc.next();
            js.setEmailAddress(jsEmail);
            System.out.println("Please enter your phone number: ");
            String jsPhone = sc.next();
            js.setPhoneNumber(jsPhone);
            arrJobSeeker.add(js);
            resume1.setArrUser(arrJobSeeker);

            //prompt user to enter education achievement and set values
            ArrayList<Education> arrEd = new ArrayList<>();
            System.out.println("Would you like to enter your education background? (y/n)");
            answerEducation = sc.next();
            if (answerEducation.equalsIgnoreCase("y")) {
                do {
                    Education jsEd = new Education();
                    System.out.println("Please enter you degree type (Associate's, Bachelor's, Master's, PhD, etc: )");
                    String jsDegree = sc.next();
                    jsDegree += sc.nextLine();
                    jsEd.setDegreeType(jsDegree);
                    System.out.println("What was your major?");
                    String jsMajor = sc.next();
                    jsMajor += sc.nextLine();
                    jsEd.setMajor(jsMajor);
                    System.out.println("Which was the name of your University?");
                    String jsSchool = sc.next();
                    jsSchool += sc.nextLine();
                    jsEd.setSchool(jsSchool);
                    System.out.println("What year did you graduate?");
                    int jsYear = sc.nextInt();
                    jsEd.setGradYear(jsYear);
                    arrEd.add(jsEd);
                    resume1.setArrEducation(arrEd);
                    System.out.println("would you like to enter another degree? (y/n)?");
                    answerE = sc.next();
                } while (answerE.equalsIgnoreCase("y"));

            } else if (answerEducation.equalsIgnoreCase("n")){
                System.out.println("Would you like to enter your work history?(y/n)");
                String answerHistory = sc.next();
                if (answerHistory.equalsIgnoreCase("y")) {
                    //prompt user to enter work experience and set values
                    ArrayList<WorkExperience> arrWork = new ArrayList<>();
                    do {
                        WorkExperience jsWork = new WorkExperience();
                        System.out.println("Please enter company name: ");
                        String jsCompany = sc.next();
                        jsCompany += sc.nextLine();
                        jsWork.setCompany(jsCompany);
                        System.out.println("Please enter your job title");
                        String jsTitle = sc.next();
                        jsTitle += sc.nextLine();
                        jsWork.setJobTitle(jsTitle);
                        System.out.println("Please enter your start date: ");
                        String jsStart = sc.next();
                        sc.nextLine();
                        jsWork.setStartDate(jsStart);
                        System.out.println("Please enter your end date: ");
                        String jsEnd = sc.next();
                        sc.nextLine();
                        jsWork.setEndDate(jsEnd);

                        ArrayList<String> arrJobDescription = new ArrayList<>();
                        do {
                            System.out.println("Please enter your job description");
                            String jsDescription = sc.next();
                            jsDescription += sc.nextLine();
                            arrJobDescription.add(jsDescription);
                            jsWork.setJobDescription(arrJobDescription);
                            System.out.println("would you like to enter another job description?(y/n)");
                            answerJ = sc.next();
                        } while (answerJ.equalsIgnoreCase("y"));
                        arrWork.add(jsWork);
                        resume1.setArrWorkExperience(arrWork);
                        System.out.println("would you like to enter another work experience? (y/n)?");
                        answerW = sc.next();
                    } while (answerW.equalsIgnoreCase("y"));
                } else if (answerHistory.equalsIgnoreCase("n")){
                    System.out.println("Would you like to enter your skills? (y/n)");
                    String answerSkill = sc.next();
                    if (answerSkill.equalsIgnoreCase("y")) {
                        ArrayList<Skills> arrTalent = new ArrayList<>();
                        do{
                        Skills jsSkills = new Skills();
                        System.out.println("Please enter your skill: ");
                        String jsSkill = sc.next();
                        jsSkill += sc.nextLine();
                        jsSkills.setSkillName(jsSkill);
                        System.out.println("What is your rating for this skill? (Fundamental, Novice, Intermediate, Advanced, Expert)");
                        String jsRating = sc.next();
                        jsSkills.setSkillRating(jsRating);
                        arrTalent.add(jsSkills);
                        resume1.setArrSkills(arrTalent);
                        System.out.println("Would you like to enter another skill? (y/n)");
                        answerS = sc.next();
                        } while (answerS.equalsIgnoreCase("y"));
                    }
                }
            }
            System.out.println("Would you like to enter another candidate? (y/n)");
            answerJobSeeker = sc.next();
            resumebuilder.add(resume1);
        }while (answerJobSeeker.equalsIgnoreCase("y"));
        for (Resume r: resumebuilder){
            for (JobSeeker j: r.getArrUser()){
                System.out.println(j.getName());
                System.out.println(j.getEmailAddress());
                System.out.println(j.getPhoneNumber());
                System.out.println("");
            }
            System.out.println("Education");
            for (Education e: r.getArrEducation()){
                System.out.println(e.getDegreeType() + " in " + e.getMajor());
                System.out.println(e.getSchool() + ", " + e.getGradYear());
                System.out.println("");
            }
            System.out.println("Experience");
            for (WorkExperience w : r.getArrWorkExperience()) {
                System.out.println(w.getJobTitle());
                System.out.println(w.getCompany() + ", " + w.getStartDate() + " - " + w.getEndDate());
                System.out.println("Duties: " + w.getJobDescription());
                System.out.println("");
            }
            System.out.println("Skills");
            for (Skills s : r.getArrSkills()) {
                System.out.println(s.getSkillName() + ", " + s.getSkillRating());
            }
        }

    }
}


