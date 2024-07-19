package JAVA102.Inheritance;

public class main {

    public static void main(String[] args) {
        worker w1 = new worker("yunus emre", "05071063431", "yunuskaratas589@gmail.com");

        academian a1 = new academian("derya kaya", "0505469307", "derya@gamil.com", "ceng", "prof.");
        lectuter l1 = new lectuter("hasan", "05428990612", "hasankemal@cbu.edu.tr", "Ceng", "lecturer");
        asistant asistant1 = new asistant("servet", "05428990748", "servetkaratas@ogr.cbu.edu.tr", "ceng", "asistant",
                "14.30");

        asistant1.takeQuiz();

    }

}
