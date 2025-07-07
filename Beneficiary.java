import java.util.ArrayList;
import java.util.Scanner;

class Beneficiary extends User {
    public static ArrayList <RequestDonation> RDLBL = new ArrayList <RequestDonation>();
    
    RequestDonationList RDLB = new RequestDonationList();
    
    private static  int noPerson ;

    Beneficiary(String name,String phone,int noPerson){
        super(name,phone);
        this.noPerson = noPerson; 
    }
    
    Beneficiary(){}
    
    ArrayList <RequestDonation> getReceivedList(){
        return RDLBL;
    }
    
    ArrayList <RequestDonation> getRequestList(){
        return RDLBL;
    }
    
    boolean BenPhone(Organization o){
            for (int b=0;b<o.getBenlist().size();b++){
                if(getPhone().equals(o.getBenlist().get(b).getPhone())){
                setPhone(o.getBenlist().get(b).getName());
                return true;
            }
        }
        return false;
    }
    
    public static int getNoPerson(){
        return noPerson;
    }
    
    
    void removeRequestList(){
        RDLBL.remove(new Requests());
    }
    
    void clearRequestList(){
        RDLBL.clear();
    }
    
  
}