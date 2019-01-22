import java.util.LinkedList;
import java.util.Queue;

public class TruckBridege {
    public static int solution(int bridge_length, int weight, int[] truck_weights){
        Queue<Truck> bridge = new LinkedList<Truck>();
        Truck truck= new Truck(truck_weights[0], bridge_length -1);
        bridge.add(truck);
        int time = 1;
        int total = truck_weights[0];
        int index = 1;
        while(!bridge.isEmpty()){
            time += 1;

            if(bridge.peek().getLength()==0){
                Truck t = bridge.poll();
                total -= t.getWeight();
            }

            if(index < truck_weights.length){
                if( (bridge.size() < bridge_length) &&( total + truck_weights[index] <= weight)){
                    truck = new Truck(truck_weights[index++], bridge_length);
                    bridge.add(truck);
                    total += truck.getWeight();
                }
            }

            for(Truck t : bridge){
                t.minusLength();
            }

        }
        return time;
    }
    public static void main(String[] args){
        System.out.println(solution(2	,10	,new int[]{7,4,5,6}));
        System.out.println(solution(100	,10	,new int[]{10}));
    }
}

class Truck{
    private int weight;
    private int length;
    public Truck(int weight, int bridge_length){
        this.weight = weight;
        this.length = bridge_length;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public void minusLength(){
        length--;
    }
}
