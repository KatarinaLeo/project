package java2lesson1;

public class Robot implements Movable {

    private String name;
    private int limitRunRobot;
    private boolean result;

    Robot (String name, int limitRunRobot){
        this.name = name;
        this.limitRunRobot = limitRunRobot;
        this.result = false;

    }

    public boolean run(int distance){
        System.out.println(name + " пробежал");
        return true;
    }

    public boolean jump(int distance){
        System.out.println("Роботы не прыгают");
        return false;
    }

    @Override
    public boolean getResult() {
        return result;
    }

    @Override
    public void setResult(boolean newResult) {
        this.result = newResult;
    }

    @Override
    public String toString(){
        return name + " информания находится под грифом 'секретно'";
    }
}
