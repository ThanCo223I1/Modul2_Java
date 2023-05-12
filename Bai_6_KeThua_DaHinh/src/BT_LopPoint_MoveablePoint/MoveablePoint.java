package BT_LopPoint_MoveablePoint;

public class MoveablePoint extends  LopPoint{
    private float xSpeed = 2.0f;
    private float ySpeed = 3.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){}

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr1 = {this.xSpeed, this.ySpeed};
        return arr1;
    }

    @Override
    public String toString() {
        return  "xSpeed=" + xSpeed + "\t" +
                "ySpeed=" + ySpeed + "\t" +
                super.getX() + "\t" +
                super.getY()
                ;
    }
    public MoveablePoint move(){
        super.setX(getX() + xSpeed);
        super.setY(getY() + ySpeed);
        return this;
    }
}
