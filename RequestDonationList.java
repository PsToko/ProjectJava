import java.util.ArrayList;
import java.util.Scanner;

class RequestDonationList{
   public static ArrayList <RequestDonation> rdEntities = new ArrayList <RequestDonation>();
   public static ArrayList <RequestDonation> RequestDonationLists = new ArrayList <RequestDonation>();
    
    
    public static RequestDonation RD;
    public static double value;
    Scanner scan = new Scanner(System.in);
    public static Organization orga;
    public static Donator Don;
    public static Beneficiary Ben;
    public static  Admin admin;
    public static Offers offer;
        
    RequestDonationList(){}
    
    //ArrayList<RequestDonation> 
    void printEntity(){
        for(int i=0; i<rdEntities.size(); i++){
                        System.out.println("["+(i)+"]"+" "+rdEntities.get(i).getEntity().getEntityInfo()+" "+rdEntities.get(i).getQuantity());
                        System.out.println("\n");
                        }
    }
    
     void getRdEntities(int id){
        if(rdEntities.equals(RD.getEntity().id)){
            int s;
            s=rdEntities.indexOf(id);
            System.out.println(rdEntities.get(s));
        }
        else
         System.out.println("lypoymaste den exoume ayto to antikhmeno");
    }
    
    
    void AddRdEntities(RequestDonation RDN){
          if(Organization.MaterialsList.contains(RDN.getEntity())||Organization.ServicesList.contains(RDN.getEntity())){
           if(rdEntities.equals(RDN.getEntity())){
             System.out.println("to exete jana prothesh  "+RDN.getEntity().getEntityInfo() +"\n me posothta : "+RDN.getQuantity());
             System.out.println("\nplevn exete sthn lista sas :");
             printEntity();
            Organization.ShowRequestList();
           }
           else{
            rdEntities.add(RDN);
            System.out.println("prothesate me epitixia to antikhmenv : "+RDN.getEntity().getEntityInfo()+" "+RDN.getQuantity());
            System.out.println("\nplevn exete sthn lista sas :");
             printEntity();
            Organization.ShowRequestList();
            } 
        }

        else{
            System.out.println("ayto poy epilexate den to exoyme");
            Organization.ShowRequestList();
          }
        
        }
    
    void remove(RequestDonation RDN){
        System.out.println("epilexate na sbhsete apo thn lista sas to antikeimno "+RDN.getEntity().getEntityInfo());
        
            if(rdEntities.equals(RDN.getEntity())){
            rdEntities.remove(RDN);
        }
        
    }
    
    
    void modify(RequestDonation RDN){
        System.out.println("poso thelte na to kanete:");
        double p;
        p= scan.nextInt();
        RDN.setQuantity(p);
        System.out.println("prothesate me epitixia to antikhmenv : "+RDN.getEntity().getEntityInfo()+" "+RDN.getQuantity());
        System.out.println("\nplevn exete sthn lista sas :");
        printEntity();
        Organization.ShowRequestList(); 
    }
    //RequestDonation Show
    void monitor(){
           System.out.println(rdEntities);
                      
    }

    void reset(){
    rdEntities.clear();
    System.out.println("\nplevn exete sthn lista sas :");
    printEntity();
    }
}