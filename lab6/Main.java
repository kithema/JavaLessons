public class Main {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Ширяев В. О.", "100", "Философский", "20.05.2000", "+78005553535"),
                new Reader("Шкредов А. А.", "123", "Журналистика", "27.03.2001", "+78884449999"),
                new Reader("Кушнарёв Р. Ш.", "666", "Юриспруденци", "01.03.2013", "+77775551111"),
                new Reader("Лещев Щ. Я.", "940", "Математический", "13.03.1013", "+79998887766"),
                new Reader("Левов Л. Л.", "007", "Юриспруденци", "09.09.19999", "+74003203333")
        };
        for(int i = 0; i <readers.length; i++){
            readers[i].takeBook(9);
            readers[i].takeBook("ЖОра", "Четотам", "ведро");
            readers[i].returnBook("ЖОра", "Четотам", "ведро");
            readers[i].returnBook(7);
        }


    }
}
class Reader{
    String fullname;
    String card;
    String faculty;
    String birth;
    String phone;
    public Reader(String fullname,String card,String faculty,String birth,String phone){
        this.fullname = fullname;
        this.card = card;
        this.faculty = faculty;
        this.birth = birth;
        this.phone = phone;
    }
    public void takeBook(int count){
        System.out.printf("%s взял %d книг.\n", fullname, count);
    }
    public void takeBook(String... books){
        System.out.printf("%s взял книги: %s.\n", fullname, String.join(", ", books));
    }
    public void  returnBook(int count){
        System.out.printf("%s вернул %d книг\n", fullname, count);
    }
    public void returnBook(String... books){
        System.out.printf("%s вернул книги: %s.\n", fullname, String.join(", ", books));
    }

}