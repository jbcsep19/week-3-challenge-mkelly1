import java.util.ArrayList;
import java.util.Scanner;

public class ResumeeApp {

    public static void main(String[] args){
        ArrayList<Education> educationArray = new ArrayList<>();
        ArrayList<Job> jobArray = new ArrayList<>();
        ArrayList<Skill> skillArray = new ArrayList<>();
        String answer = "";
        boolean keepgoing = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your email address: ");
        String email = scan.nextLine();
        //Education
        System.out.println("Now enter your education information.");
        while(keepgoing) {
            System.out.println("Enter a degree: ");
            String degree = scan.nextLine();
            System.out.println("Enter your major: ");
            String major = scan.nextLine();
            System.out.println("Enter the university of this degree: ");
            String university = scan.nextLine();
            System.out.println("What year did you graduate? ");
            String gradYear = scan.nextLine();
            Education education = new Education(degree, major, university, gradYear);
            educationArray.add(education);
            System.out.println("Enter another degree? Y|N");
            answer = scan.next();
            scan.nextLine();
            if(answer.equalsIgnoreCase("y"))
                keepgoing = true;
            else{
                keepgoing = false;
            }
        }
        keepgoing = true;
        //Jobs
        System.out.println("Enter your job experience.");
        while(keepgoing) {
            System.out.println("Enter the company of your most recent job:");
            String company = scan.nextLine();
            System.out.println("Enter your job title: ");
            String title = scan.nextLine();
            System.out.println("Enter a brief job description: ");
            String descrip = scan.nextLine();
            System.out.println("Enter the start date: ");
            String startDate = scan.nextLine();
            System.out.println("Enter the end date. If still there enter 'Present job': ");
            String endDate = scan.nextLine();
            Job job = new Job(company, title, startDate, endDate, descrip);
            jobArray.add(job);
            System.out.println("Enter another job? Y|N");
            answer = scan.next();
            scan.nextLine();
            if(answer.equalsIgnoreCase("y"))
                keepgoing = true;
            else{
                keepgoing = false;
            }
        }
        keepgoing = true;
        System.out.println("Now enter at least 3 skills. ");
        int count = 0;
        //Skills
        while(keepgoing){
            System.out.println("Enter a skill: ");
            String skill = scan.nextLine();
            System.out.println("How high is your skill? Enter one - Intermediate|Advanced ");
            String rating = scan.next();
            scan.nextLine();
            skillArray.add(new Skill(skill+ ", "+rating));
            count++;
            System.out.println("Enter another skill? Y|N");
            answer = scan.next();
            if(answer.equalsIgnoreCase("y"))
                keepgoing = true;
            else if (answer.equals("n") && count >= 3){
                keepgoing = false;
            }
            else{
                continue;
            }
            scan.nextLine();
        }

        Resumee myResumee = new Resumee(name,email,educationArray, jobArray, skillArray);
        myResumee.toString();
    }
}
