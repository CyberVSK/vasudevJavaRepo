public class Car{
    public void fullThrottel(){
        System.out.println("The car is going as fast as it can");
    }
    public void speed(int maxSpeed){
        System.out.println("speed: "+maxSpeed);
    }
    public static void main(String[] args){
        Car car = new Car();
        car.fullThrottel();
        car.speed(200);
    }
}
