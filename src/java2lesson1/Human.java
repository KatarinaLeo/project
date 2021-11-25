package java2lesson1;

public class Human implements Movable {

    private String name;
    private int limitRunHuman;
    private int limitJumpHuman;
    private boolean result;

    Human (String name, int limitRunHuman, int limitJumpHuman){
        this.name = name;
        this.limitRunHuman = limitRunHuman;
        this.limitJumpHuman = limitJumpHuman;
        this.result = false;
    }

    public boolean run(int distance){
        boolean answer;
        if(distance > limitRunHuman){
            System.out.println(name + " не пробежал");
            answer = false;
        } else {
            System.out.println(name + " пробежал");
            answer = true;
        }
        return answer;
    }

    public boolean jump(int distance){
        boolean answer;
        if(distance > limitJumpHuman){
            System.out.println(name + " не перепрыгнул");
            answer = false;
        } else {
            System.out.println(name + " перепрыгнул");
            answer = true;
        }
        return answer;
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
        return name + " может пробежать: " + limitRunHuman + ", может перепрыгнуть: " + limitJumpHuman;
    }
}
