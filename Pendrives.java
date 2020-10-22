package hu.mak.methodstructure;

import java.util.List;

public class Pendrives {
    public Pendrive best(List<Pendrive> pendriveList){
        Pendrive best = pendriveList.get(0);
        for (Pendrive item:pendriveList
             ) {
            if(item.comparePricePerCapacity(best) == -1){
                best = item;
            }
        }
        return best;
    }

    public Pendrive cheapest(List<Pendrive> pendriveList){
        Pendrive cheapest = pendriveList.get(0);
        for (Pendrive item:pendriveList
             ) {
            if(item.cheaperThan(cheapest)){
                cheapest = item;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity){
        for (int i = 0; i < pendriveList.size(); i++){
            if(pendriveList.get(i).getCapacity() == capacity){
                pendriveList.get(i).risePrice(percent);
            }
        }
    }

}
