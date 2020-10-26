package teoria.aula3tec;

public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja("Naruto","Uzumaki");
        mostrarTreino(ninja);
        Ninja academicStudent = new AcademicStudent("Sakuke","uchiha");
        mostrarTreino(academicStudent);
        Chunin chunin = new Chunin("Ikura","Umino","Treinar XYZ");
        mostrarTreino(chunin);
        chunin.goToMission();
        Ninja Jonin = new Jonin("Kakashi","Hatake","Train Sasuke");
        mostrarTreino(Jonin);
    }
    static void mostrarTreino(Ninja ninja){
        ninja.train();
    }
}
