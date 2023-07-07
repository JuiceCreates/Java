public class TrafficLightEnum {
  enum TrafficLight {
    RED(10), GREEN(20), YELLOW(15);

    TrafficLight(int duration) {
      this.duration = duration;
    }

    private int duration;

    public int getDuration() {
      return duration;
    }
  }

  public static void main(String args[]){
    TrafficLight[] trafficLights = TrafficLight.values();
    for(TrafficLight trafficLight: trafficLights){
      System.out.println(trafficLight.name()+" duration is "+trafficLight.getDuration()+".");
    }
  }
}
