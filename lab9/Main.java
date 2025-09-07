import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = {
                new Student("Никитос Яцекрутов", 2004, "Ставропольская 13", "88889999999", "3", "Филосовский"),
                new Student("Влад Владимиров", 2044, "Круговая 163", "83339999999", "13", "Чорный"),
                new Student("Диман БМВ", 2104, "Серпуховская 13", "87779999999", "43", "Чорный")
        };
        for(int i = 0; i < students.length; i++){
            students[i].getFullname();
        }
        System.out.println("Введите желаемый факультет");
        String findFaculty = input.nextLine();
        for(int i = 0; i < students.length; i++){
            String trueFaculty = students[i].getFaculty();
            if(trueFaculty.equals(findFaculty)){
                students[i].getFullname();
            }
        }
        System.out.println("Введите дату поступления");
        int findDatebegins = input.nextInt();
        for(int i = 0; i < students.length; i++){
            int trueDate = students[i].getDatebegins();
            if(trueDate >= findDatebegins){
                students[i].getFullname();
            }
        }


    }
}
class Student{
    private String fullname;
    private int datebegins;
    private String adress;
    private String phone;
    private String stage;
    private String faculty;
        public Student(String fullname, int datebegins, String adress, String phone, String stage, String faculty){
            this.fullname = fullname;
            this.datebegins = datebegins;
            this.adress = adress;
            this.phone = phone;
            this.stage = stage;
            this.faculty = faculty;
        }
        public void getFullname(){
            System.out.println(this.fullname);
        }
        public void setFullname(String fullname){
            this.fullname = fullname;
        }
        public void setDatebegins(int datebegins){
            this.datebegins = datebegins;
        }
        public int getDatebegins(){
            return this.datebegins;
        }
        public void getAdress(){
            System.out.println(this.adress);
        }
        public void getPhone(){
            System.out.println(this.phone);
        }
        public void setPhone(String phone){
            this.phone = phone;
        }
        public void setStage(String stage){
            this.stage = stage;
        }
        public String getFaculty(){
            //System.out.println(this.faculty);
            return this.faculty;
        }


}
