
package maricandy;

public class dispenserType {
    private int numberOfItems;
final private int cost;
    dispenserType(){
        cost=50;
        numberOfItems=50;
    }
    dispenserType(int a,int b){
        cost=a;
        numberOfItems=b;
        
    }
   int getNoOfItems(){
        return numberOfItems;
    }
    int getCost(){
        return cost;
    }
    void makeSale(){
        numberOfItems--;
    }
}
