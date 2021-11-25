package java2lesson1;

public interface Movable {

    boolean run(int distance);
    boolean jump(int distance);

    boolean getResult();
    void setResult(boolean newResult);
}
