package baer.maximilian;
//Methode zum Berechnen des Durchschnitts
public class Average {
    public static double schnittBerechnen(int grades[]){
        int numberGrades = grades.length;
        double totalGrades=0;

        for(int a = 0; a<numberGrades; a++){
            totalGrades = totalGrades + grades[a];
        }
        double result = totalGrades/numberGrades;
        return result;
    }
}
