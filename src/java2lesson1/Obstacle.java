package java2lesson1;

public class Obstacle {

    protected String nameOfObstacle;
    protected int size;

    int getSize(){
        return size;
    }
}

class Track extends Obstacle{

    Track (String nameOfObstacle, int size){
        this.nameOfObstacle = nameOfObstacle;
        this.size = size;
    }
}

class Barrier extends Obstacle{

    Barrier (String nameOfObstacle, int size){
        this.nameOfObstacle = nameOfObstacle;
        this.size = size;
    }
}
