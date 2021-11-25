package java2lesson1;

public class Team {

    private String teamName;
    private Movable[] members;

    Team(String teamName, Movable[] members) {
        this.teamName = teamName;
        this.members = members;
    }

    @Override
    public String toString(){
        return teamName;
    }

    void winnersList(){
        for (int i = 0; i < members.length; i++) {
            if(members[i].getResult()) {
                System.out.println(members[i]);
            }
        }
    }

    Movable[] getMembers(){
       return members;
    }

    void info() {
        for (int i = 0; i < members.length; i++) {
            System.out.println(members[i]);
        }
    }
}
