import java.util.Comparator;

class RequestDonation implements Comparator  {
   private Entity entity;
   private double quantity;
   
   RequestDonation(){}
   
   RequestDonation(Entity entity, double quantity)
    {
        this.entity = entity;
        this.quantity = quantity;
    }
   
   Entity getEntity(){
        return entity;
    }

   double getQuantity(){ 
        return quantity; 
    }
    
    double setQuantity(double x){
        return quantity = x;
    }
    
   void addQuantity(){ 
        quantity++;
   }
    
   void removeQuantity(){
        quantity--;
   }
   
   int getId(){ 
       return getEntity().getId(); 
   }
   
    @Override
   public int compare(Object ob1, Object ob2) {
       if (ob1.equals(ob2))
           return 1;
       else {
           return 0;
       }
    }
    
    
}