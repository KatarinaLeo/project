package java2lesson1;

public class Course {

    private Obstacle[] obstaclesArray;

    Course (Obstacle[] obstaclesArray){
        this.obstaclesArray = obstaclesArray;
    }

    public void attempt (Team team){
        for(int i = 0; i < team.getMembers().length; i++){
            boolean success = true;
            for(int j = 0; j < obstaclesArray.length; j++){
                    if(obstaclesArray[j].getClass().getName().contains("Barrier")){
                        success = team.getMembers()[i].jump(obstaclesArray[j].getSize());
                    } else {
                        success = team.getMembers()[i].run(obstaclesArray[j].getSize());
                    }
                    if(!success){
                        System.out.println("Участник сошел с дистанции");
                        break;
                    }
            }
            team.getMembers()[i].setResult(success);
            if(success){
                System.out.println("Участник прошел дистанцию!");
            }
        }
    }
}
