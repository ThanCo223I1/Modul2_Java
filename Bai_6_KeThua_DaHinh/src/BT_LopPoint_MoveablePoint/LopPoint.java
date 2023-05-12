package BT_LopPoint_MoveablePoint;

public class LopPoint {
    private float x = 1.0f;
    private float y = 1.0f;

    public LopPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public LopPoint(){}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
      float[] arr = new  float[2];
      return arr;
    }

    @Override
    public String toString() {
        return "LopPoint{" + "x=" + x + ", y=" + y + '}';
    }
}
