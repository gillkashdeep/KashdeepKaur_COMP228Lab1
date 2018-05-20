public class GameObject {

    int center;
    String velocity;
    String state;
    String rotation;

    public GameObject(int center, String velocity, String state, String rotation) {
        this.velocity = velocity;
        this.state = state;
        this.rotation = rotation;
    }

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public String getObjectInfo() {

        return "ObjectCenter-" + center + "  ," + "Velocity-" + velocity + "  ," + "State-" + state + "Rotation" + "  ," + rotation;
    }
}
