package java2lesson1;

public class Cat implements Movable {

    private String name;
    private int limitRunCat;
    private int limitJumpCat;
    private boolean result;

    Cat (String name, int limitRunCat, int limitJumpCat){
        this.name = name;
        this.limitRunCat = limitRunCat;
        this.limitJumpCat = limitJumpCat;
        this.result = false;
    }

    public boolean run(int distance){
        boolean answer;
        if(distance > limitRunCat){
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
        if(distance > limitJumpCat){
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
        return name + " может пробежать: " + limitRunCat + ", может перепрыгнуть: " + limitJumpCat;
    }
}
