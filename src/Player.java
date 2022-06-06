public class Player extends Units {
    private Integer experience;
    private Integer level;
    public Player(){
        experience = 0;
        level = 1;
    }

    public String name() {
        return null;
    }

    public Integer healthPool() {
        return null;
    }

    public Integer healthAmount() {
        return null;
    }

    public Integer attackPoints() {
        return null;
    }

    public Integer defensePoints() {
        return null;
    }

    public void increaceExperience(){
        experience = experience + 1;
        if(experience == 50){
            increaseLevel();
        }
    }

    public void increaseLevel(){
        experience = experience - 50;
        level = level + 1;
    }

}
