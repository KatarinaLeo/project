package java2lesson1;
import java.util.Arrays;

public class HomeWork1 {

    public static void main(String[] args){
        Track track1 = new Track("track1",100);
        Barrier barrier1 = new Barrier("barrier1", 8 );
        Obstacle[] obstacles = {track1, barrier1};
        Course course = new Course(obstacles);

        Human human1 = new Human("Vasya",101, 9);
        Human human2 = new Human("Petya", 80,7);
        Cat cat1 = new Cat("Barsik", 200, 15);
        Robot robot1 = new Robot ("Alik", 300);
        Movable[] creatures = {human1, human2, cat1, robot1};
        Team team = new Team("faggots",creatures);

        System.out.println("Информация об участниках:");
        team.info();

        System.out.println("\n" + "Старт!" + "\n");
        course.attempt(team);

        System.out.println("\n" + "Список участников успешно прошедших дистанцию:");
        team.winnersList();
    }
}
