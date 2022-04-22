package io.cucumber.skeleton;

public class Belly {

    private boolean isFull;
    private int bellyCakeCapacity;

    public Belly() {
        this.isFull = false;
        this.bellyCakeCapacity = 0;
    }

    public void eat(Integer numberOfCakes) {
        this.bellyCakeCapacity += numberOfCakes;
    }

    public void digest(Integer digestTime) {
        this.bellyCakeCapacity -= digestTime;
        if (bellyCakeCapacity <= 0)
            this.isFull = false;
    }

    public boolean isFull() {
        return this.isFull;
    }
}
