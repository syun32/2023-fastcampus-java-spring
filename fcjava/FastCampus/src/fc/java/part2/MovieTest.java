package fc.java.part2;

public class MovieTest {
    public static void main(String[] args) {
        Movie m = new Movie();
        m.title = "아바타";
        m.relaseDate = "2022.12.14";
        m.hero = "제이크 설리";
        m.genre = "액션";
        m.runningTime = 192;
        m.rate = 12;
        System.out.println(m.title + "\t" + m.relaseDate + "\t" + m.hero + "\t" + m.genre + "\t" + m.runningTime + "\t" + m.rate + "세");
    }
}
