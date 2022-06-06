public class Trap extends Enemy{
    private Integer visibilityTime;
    private Integer invisibilityTime;
    private Integer ticksCount;
    private boolean visible;

    public Trap(int visibilityTime, int invisibilityTime){
        this.invisibilityTime = visibilityTime;
        this.invisibilityTime = invisibilityTime;
        ticksCount = 0;
        visible = true;
    }
}
