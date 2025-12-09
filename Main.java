import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println();
        Scanner scanner=new Scanner(System.in);
        String school,teacher,grade,year;
        System.out.println("Enter school name: ");
        school=scanner.nextLine();
        System.out.println("Enter Teacher name: ");
        teacher=scanner.nextLine();
        System.out.println("Enter Grade: ");
        grade=scanner.nextLine();
        System.out.println("Enter Year: ");
        year=scanner.nextLine();

        //use arrays to for student records
        String[] names = {"Alice Arnold", "Cory Brown", "Sean Doughlas", "Pete Daughlas", "Mary Fleming", "Joel Jacob", "Jeremy Ghouse", "Hansie Holder", "Loyola Ingenious", "Gary Jackson", "Russell Jacobson", "Dustan Kellart", "Carl Melone", "Samuel Peterson", "Alec Stewart"};
        double[] english_score ={76.00, 67.00, 90.00, 87.90, 95.80, 73.00, 74.00, 76.00, 98.00, 45.60, 68.00, 56.90, 93.00, 78.00, 75.00};
        double[] math_score = {65.00, 88.00, 99.00, 80.90, 93.00, 90.00, 81.00, 34.00, 87.90, 90.00, 69.00, 87.70, 97.00, 64.00, 79.00};
        double[] history_score = {91.00, 87.80, 91.00, 98.00, 95.00, 54.00, 74.00, 98.00, 91.00, 65.00, 87.80, 89.80, 90.00, 23.70, 77.00};
        double[] geography_score = {89.00, 67.90, 87.00, 97.00, 93.00, 74.00, 90.00, 76.00, 89.00, 87.00, 85.90, 89.60, 91.00, 34.90, 93.60};
        double[] science_score = {98.00, 60.90, 88.90, 91.00, 91.00, 65.00, 76.00, 47.00, 90.00, 78.00, 98.70, 87.60, 88.00, 69.00, 78.00};
        double[] programming_score = {100.00, 69.90, 80.90, 93.00, 94.00, 56.00, 45.00, 67.00, 94.00, 75.90, 87.60, 68.00, 89.50, 78.90, 81.00};


        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tSchool Name: " + school);
        System.out.println("\t\t\t\t\t\t  Teacher: " + teacher);
        System.out.println("\t\t\t\t\t\t    Grade: " + grade);
        System.out.println("\t\t\t\t\t\t\t   Year: " + year);
        System.out.println("============================================================================================================");
        System.out.printf("%-20s %5s %7s %10s %10s %10s %10s %10s %10s\n","Student Name","English","Math","History","Geography","Science","Programming","Total","Rank");
        System.out.println("============================================================================================================");

        double total_english_score=0, total_math_score=0, total_history_score=0, total_geography_score=0, total_science_score=0, total_programming_score=0;
        double total_marks=0;
        double sum_total_marks=0;

        //loop to output total subject scores
        int i;
        for(i=0; i<15; i++)
        {
            total_english_score += english_score[i];
            total_math_score += math_score[i];
            total_history_score += history_score[i];
            total_geography_score += geography_score[i];
            total_science_score += science_score[i];
            total_programming_score += programming_score[i];
        }

        //average of the marks total scores
        double english_average = total_english_score/15;
        double math_average = total_math_score/15;
        double history_average = total_history_score/15;
        double geography_average = total_geography_score/15;
        double science_average = total_science_score/15;
        double programming_average = total_programming_score/15;

        int score;
        int countA=0, countB=0, countC=0, countD=0, countF=0;
        for(score = 0; score < 15; score++)
        {
            //total marks for each student
            total_marks = english_score[score] + math_score[score] + history_score[score] + geography_score[score] + science_score[score] + programming_score[score];
            sum_total_marks +=total_marks;

            // finding ranks of students
            String rank="";
            if (total_marks>=540){
                rank="A";
                countA++;
            }else if(total_marks>=480){
                rank="B";
                countB++;
            }else if(total_marks>=420){
                rank="C";
                countC++;
            }else if(total_marks>=360){
                rank="D";
                countD++;
            }else{
                rank="F";
                countF++;
            }
            System.out.printf("%-20s %6.2f %8.2f %8.2f %9.2f %11.2f %10.2f %13.2f %8s\n",names[score],english_score[score],math_score[score],history_score[score],geography_score[score],science_score[score],programming_score[score],total_marks,rank);
        }

        // average for sum of total marks
        double total_average = sum_total_marks/15;


        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf("%28.2f %9.2f %7.2f %8.2f %11.2f %11.2f %12.2f\n",total_english_score,total_math_score,total_history_score,total_geography_score,total_science_score,total_programming_score,sum_total_marks);
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.printf("%28.2f %9.2f %7.2f %8.2f %11.2f %11.2f %12.2f\n",english_average,math_average,history_average,geography_average,science_average,programming_average,total_average);
        System.out.println("============================================================================================================");
        System.out.printf("%28s %7s %8s %9s %12s %10s\n","Ranks","A`s:"+countA,"B`s:"+countB,"C`s:"+countC,"D`s:"+countD,"F`s:"+countF);

        scanner.close();
    }
}