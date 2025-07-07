import java.util.ArrayList;
import java.util.Scanner;

class Donator extends User {
    ArrayList<Offers> offerlist = new ArrayList<Offers>();
    ArrayList <RequestDonation> RDLD = new ArrayList <RequestDonation>();
    
    int c;
    String n;
    
    
    Donator(){}
    
    Donator(String name,String phone){
        super(name,phone);
        
    }
    
    boolean DonPhone(Organization o) {
        for (int d=0;d<o.getDonatorlist().size();d++){
            if(getPhone().equals(o.getDonatorlist().get(d).getPhone())){
                setName(o.getDonatorlist().get(d).getName());
                return true;
            }
        }
        return false;
    }
    
    ArrayList <Offers> getOfferList(){
        return offerlist;
    }

    
}