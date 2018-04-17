package me.afua.demo;

public class Vehicle {
    private int weight;
    private String brand;
    private int speed;
    private String image;

    public Vehicle() {
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /*Non getter/setter methods*/
    public String started()
    {
        return "This vehicle has started";

    }

    public String stopped()
    {
        return "This vehicle has stopped";
    }


    public void accelerate(int byAmount)
    {
        this.speed+=byAmount;
    }

    public void decelerate(int byAmount)
    {
       this.speed-=byAmount;
    }

    public String hasPassed(Vehicle v)
    {
      return this.brand+" has passed the "+v.getBrand();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
