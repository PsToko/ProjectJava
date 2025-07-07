import java.util.ArrayList;

class Requests extends RequestDonationList {
        
    
    
    String fN;
    int Fi;
    boolean getOut = false;
    double p;
    int i,e,choose;
    static Material mat;
    Beneficiary Ben;
    Menu m = new Menu();
    
    double level1,level2,level3;
    void AddRdEntities(RequestDonation RDN,int e, double p){

        if(Organization.MaterialsList.contains(RDN.getEntity())){
            Fi=Organization.MaterialsList.indexOf(RDN.getEntity());
            choose = 1;
        } 
        else if (Organization.ServicesList.contains(RDN.getEntity())){
            Fi=Organization.ServicesList.indexOf(RDN.getEntity());
            choose = 2;
        }
        else{System.out.println("lathoooos");}
        
        System.out.println(mat.ReturnLevel());
        switch(choose){
            case 1:{
                do{
                 if(RequestDonationLists.get(Fi).getQuantity()>p){
                    if(validRequestDonation(p)<mat.ReturnLevel()){
                        if(Organization.MaterialsList.contains(RDN.getEntity())){
                           if(rdEntities.equals(RDN)){
                             System.out.println("to exete jana prothesh  "+RDN.getEntity().getEntityInfo() +"\n me posothta : "+RDN.getQuantity());
                             System.out.println("\nplevn exete sthn lista sas :");
                             printEntity();
                             Organization.ShowRequestList();
                            //apo edv ton stelnoyme piso sto menu
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
                         getOut= true;
                    }
                else
                System.out.println("den sas analogh allo material lypoymaste...");
              }
             else{
                System.out.println(" den yparxei diathesimh posothta dokimaste ligotero apo "+ RequestDonationLists.get(Fi).getQuantity());
               
               }
          }while(RequestDonationLists.get(Fi).getQuantity()<p);
          System.out.println("\nplevn exete sthn lista sas :");
          
         printEntity();
         Organization.ShowRequestList();
              
            break; 
        }
            
            
          case 2:{
              do{
                try{
                    if(RequestDonationLists.get(Fi).getQuantity()>p){
                        if(Organization.ServicesList.contains(RDN.getEntity())){
                           if(rdEntities.equals(RDN)){
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
                         getOut= true;
                    }
                }
                 catch( Exception IndexOutOfBounds){
                    System.out.println(" den yparxei diathesimh posothta dokimaste ligotero apo "+ RequestDonationLists.get(Fi).getQuantity());
                    Organization.ShowRequestList();
               }
          }while(RequestDonationLists.get(Fi).getQuantity()<p);
          System.out.println("\nplevn exete sthn lista sas :");
            printEntity();
            Organization.ShowRequestList();
            
            break; 
        }
            
         default :{System.out.println("kati phge straba!!!");
            Organization. ShowRequestList();
            }
        }
 
  }
    
    void modify(RequestDonation RDN , int e){
        
       do{
        System.out.println("poso thelte na to kanete:");
        
        p= scan.nextInt();
        
        fN=rdEntities.get(e).getEntity().getEntityInfo();
        
        if(Organization.MaterialsList.contains(fN)){
            Fi=Organization.MaterialsList.indexOf(fN);
            choose = 1;
        } 
        else if (Organization.ServicesList.contains(fN)){
            Fi=Organization.ServicesList.indexOf(fN);
            choose = 2;
        }
        else{System.out.println("egine lathos jana prospthiste");}
        
        
        switch(choose){
            case 1:{
                if(RequestDonationLists.get(Fi).getQuantity()>p){
                    if(validRequestDonation(p)>mat.ReturnLevel()){
                    RDN.setQuantity(p);
                    getOut= true;
                     
                }
                else
                System.out.println("den sas analogh allo material lypoymaste..");
              }
             else
                System.out.println("Den yparxei diathesimh posothta dokimaste ligotero apo "+ RequestDonationLists.get(Fi).getQuantity());
              System.out.println("\nplevn exete sthn lista sas :");
              printEntity();
              Organization.ShowRequestList();
              break;
          }
          case 2:{
             if(RequestDonationLists.get(Fi).getQuantity()>=p){
                RDN.setQuantity(p);
                getOut= true;
                }
                else{
                System.out.println(" den yparxei diathesimh posothta dokimaste ligotero apo "+ RequestDonationLists.get(Fi).getQuantity());
                }
             System.out.println("\nplevn exete sthn lista sas :");
            printEntity();
            Organization.ShowRequestList();
           
            break;
            }
            
         default :{System.out.println("kati phge straba!!!");
            Organization. ShowRequestList();
            }
        }
       }while(RequestDonationLists.get(Fi).getQuantity()<p);
        
          
  }
    
    double validRequestDonation(double p){
        double k;
        double j =0;
        for(int i=0; i<rdEntities.size(); i++){
           j+=rdEntities.get(i).getQuantity();      
        }
        return k = p + j;
    }
  
    void commit(){
        Ben.RDLBL.addAll(rdEntities);
        rdEntities.clear(); 
        System.out.println("plevn h lhsta sas : \n");
        for(i=0; i<Ben.RDLBL.size(); i++){
                        System.out.println("["+(i)+"]"+" "+Ben.RDLBL.get(i).getEntity().getEntityInfo());
                        System.out.println("\n");
                        }
       m.menu();
        }
}