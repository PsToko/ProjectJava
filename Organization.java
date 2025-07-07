import java.util.ArrayList;
import java.util.Scanner;
 


  class  Organization {
    private static String name;
    private static Admin admin;
    

    public  static ArrayList <RequestDonation> OffersList = new ArrayList();
    public  static ArrayList <Material> MaterialsList = new ArrayList() ;
    public  static ArrayList <Service> ServicesList = new ArrayList() ;
    
   
   
    public  static ArrayList <Beneficiary> beneficiarylist ;
    public  static ArrayList <Donator> donatorlist; 
    

    public  static ArrayList <String> DonNames = new ArrayList();
    public  static ArrayList <String> BenNames = new ArrayList();
    public  static ArrayList <String> AdmNames = new ArrayList();
    
    
    
    
    public  static ArrayList <String> AdmPhones = new ArrayList<String>();
    public  static ArrayList <String> BenPhones  = new ArrayList<String>();
    public  static ArrayList <String> DonPhones = new ArrayList<String>();

    
    public  static ArrayList<Integer> BenNoPersons= new ArrayList();
    
    
   public static Offers offer = new Offers();
   public  static Requests REQ = new Requests();
   public static Material mat = new Material();
   public static Service ser = new Service();
   public  static Beneficiary ben ;
   public  static Donator don ;
   public  static Menu m = new Menu();
   public  static RequestDonation RD ;
   public  static  RequestDonationList RDL ;

   public  static int value,f;
   public  static int choose;
   public  static String s;
   public  static Scanner Scaner = new Scanner(System.in);
    
    
        
        
       public  static void addToOffers(RequestDonation rd){
            OffersList.add(rd);
        }
    
       public  static ArrayList GetOfferList(){
            return OffersList;
        }
        
        //BENEFICIARY EINAI EDV APO KATV
       public  static Beneficiary getBen(){
        return ben;
        }
        
       public  static ArrayList getBenName(){
        return BenNames;
        }
        
       public  static ArrayList getBenNoPersons(){
            return BenNoPersons;
        }
        
       public  static  ArrayList getBenPhone(){
        return BenPhones;
        }
        
       public  static ArrayList <Beneficiary> getBenlist(){
        return beneficiarylist;
        }
        
       public  static  void  AddBenPhone(String AddPhone){
        BenPhones.add(AddPhone);
        }
        
       public  static void  AddBenNoPersons(Integer addNoPersons){
        BenNoPersons.add(addNoPersons);
        }
      
        
        public  static void RemoveBeneficiary(String DelName,String DelPhone){
            BenNames.remove(DelName);
            BenPhones.remove(DelPhone);
        }
        
       public  static void BenList(){
            
            for(int i=0; i<BenPhones.size(); i++){
                    System.out.println("["+(i)+"]"+" "+BenNames.get(i) +"phone :"+BenPhones.get(i));
                    System.out.println("\n");
                    
                }
        
            System.out.println("If you want to clear the lists press 1 of press 2 to remove a beneficiary");
            f = Scaner.nextInt();
            switch(f){
                case 1:{
                BenNames.clear();
                BenPhones.clear();
                m.menu();
                break;
            }
                
            case 2:{
                System.out.println("poion thelte na sbhsete :");
                for(int i=0; i<BenPhones.size(); i++){
                    System.out.println("["+(i)+"]"+" "+BenNames.get(i) +"phone :"+BenPhones.get(i));
                    System.out.println("\n");
                }
                int k;
                k = Scaner.nextInt();
                BenNames.remove(k);
                BenPhones.remove(k);
                m.menu();
                break;
            }
            default:{
                System.out.println("Error!!!");
                m.menu();
            }
         }
        }
        
               
       public  static String AddBenName(String AddName){
        BenNames.add(AddName);
        return AddName;
        }
        
       public  static void insertBeneficiary(Beneficiary b){
        beneficiarylist.add(new Beneficiary());
        BenPhones.add(b.getPhone());
        //onoma add kai to idio sthn don
        }
    
       public  static void removeBeneficiary (Beneficiary b){
        beneficiarylist.remove(new Beneficiary());
        }
    
       public  static void listBeneficiaries(){
        System.out.println("Beneficiary lists: " + beneficiarylist);
        }
        
        //DONATOR EINAI KATV APO EDV
       public  static Donator getDon(){
        return don;
        }
        
    
       public  static  ArrayList getDonPhone(){
        return DonPhones;
        }
        
       public  static ArrayList <Donator> getDonatorlist(){
        return donatorlist;
        }
        
         
        public  static void RemoveDonator(String DelName,String DelPhone){
            DonNames.remove(DelName);
            DonPhones.remove(DelPhone);
        }
        
        
        
       public  static void DonList(){
            for(int i=0; i<DonPhones.size(); i++){
                    System.out.println("["+(i)+"]"+" "+DonNames.get(i) +"phone :"+DonPhones.get(i));
                    System.out.println("\n");
                }
        
            System.out.println("If you want to clear the lists press 1 of press 2 to remove a beneficiary");
            f = Scaner.nextInt();
            switch(f){
                case 1:{
                DonNames.clear();
                DonPhones.clear();
                m.menu();
                break;
            }
            case 2:{
                System.out.println("poion thelte na sbhsete :");
                for(int i=0; i<DonNames.size(); i++){
                    System.out.println("["+(i)+"]"+" "+DonNames.get(i) +"phone :"+DonPhones.get(i));
                    System.out.println("\n");
                }
                int k;
                k = Scaner.nextInt();
                DonPhones.remove(k);
                DonNames.remove(k);
                m.menu();
                break;
            }
            default:{
                System.out.println("Error!!!");
                m.menu();
            }
         }
        }
        
        
        
        
        public  static String AddDonName(String AddName){
        DonNames.add(AddName);
        return AddName;
        }
        
       public  static void addOffer(Donator d){
            d.getOfferList().add(new Offers());
        }
        
       public  static void DonClear(){
            System.out.println("You choose to clear ");
            don.getOfferList().clear();
            }
        
       public  static void DonCommit(){
             System.out.println("Your donation has completed" );
            // tha thelei kai apotelesmata lοgika
            }
             
       public  static void insertDonator(Donator d){
            donatorlist.add(new Donator());
            DonPhones.add(d.getPhone());   
            }
        
       public  static void listDonators(){
             System.out.println("Donators lists: " + donatorlist);
            }
       
            
            
         //ADMINS EDV APO KATV
       public  static void setAdmin(Admin admin) {
        admin = admin;
        }
        
       public  static ArrayList getAdmPhone(){
            return AdmPhones;
        }
        
       public  static Admin getAdmin() {
        return admin;
        }
         
        
       public  static void ViewAdmin(){
       
            System.out.println("1. Material (" + MaterialsList.size() +") / 2. Services ("+ ServicesList.size() + ") ");
            System.out.println("An theleis na deis to material pathse 1 h an thes service pathse 2 ");
            int n;
            n = Scaner.nextInt();
            do{
                switch(n){
                case 1 :{
                    System.out.println("Materials:\n");
                                                        
                    System.out.println("[1] Dialexe ena id \n[2] Dhmiourghse ena Material \n[3] Pisw: ");
                     int Choice=Scaner.nextInt();
                                     switch (Choice){
                                                case 1://[1]Choose an id
                                                       System.out.print("Grapste to id: ");
                                                       int ID = Scaner.nextInt();
                                                          
                                                       //System.out.print(getId(ID).getDetails() +" quantity: "+ getId(ID).getQuantity()+"\n");
                                                       break;
                                                case 2:
                                                       System.out.print("Onoma: ");
                                                       Scaner.nextLine();//Clear Buffer
                                                       String matName = Scaner.nextLine();
                                                       System.out.print("Perigrafh: ");
                                                       String matDescription= Scaner.nextLine();
                                                       System.out.print("id: ");
                                                       ID = Scaner.nextInt();
    
                                                      Material material = new Material(matName,matDescription,ID);
    
                                                      System.out.print("Enter material quantity: ");
                                                      double mq = Scaner.nextDouble();
                                                      RequestDonation rdm = new RequestDonation(material,mq);
    
                                                  //addEntity(material);
                                                 //addCurrentDonations(rdm);
                                                 break;
                                       case 3:
                                              break;
                                           default:
                                              System.out.println("Lathos epilogh");
                                          break;
                                    }
                    
                }
                case 2:{
                    System.out.println("[1] Dialexe ena id \n[2] Dhmiourghse ena Service \n[3] Pisw: ");
                     int Choice=Scaner.nextInt();
                                       switch (Choice){
                                           case 1:
                                                System.out.print("Grapste to id: ");
                                                int ID = Scaner.nextInt();        
                                                //System.out.print(getId(ID).getDetails() +" quantity: "+ getId(ID).getQuantity()+"\n");
                                                break;
                                           case 2:
                                                System.out.print("Enter material name:");
                                                Scaner.nextLine();//Clear Buffer
                                                String matName = Scaner.nextLine();
                                                System.out.print("Enter material description: ");
                                                String matDescription= Scaner.nextLine();
                                                System.out.print("Enter material id: ");
                                                ID = Scaner.nextInt();
    
                                                Material material = new Material(matName,matDescription,ID);
    
                                                System.out.print("Enter material quantity: ");
                                                double mq = Scaner.nextDouble();
                                                RequestDonation rdm = new RequestDonation(material,mq);
    
                                                  //addEntity(material);
                                                 //addCurrentDonations(rdm);
                                                 break;
                                           case 3:
                                                  break;
                                               default:
                                                  System.out.println("Lathos epilogh");
                                              break;
                                       }
                }
                
                default:{
                    System.out.println("lathos epilogh jana bale");
                    Scaner.nextLine();
                }
                }
        }while(n !=1 && n !=2);
       }
       
       
       public static void monitor(){
           System.out.println("Gia na deite toyu beneficiarys pathste [1] gia na deite toys Donators pathste [2] allios pthste otidhpote allo ");
           int p;
            p = Scaner.nextInt();
            switch(p){
                case 1:{
                 BenList();
                 break;
                }
                case 2:{
                DonList();
                break;
                }
                
                default:{
                 m.menu();
                }

            }
         }
        
       
       

        //Organization
        Organization(String name){
            this.name = name;
        }   
    
    
        //LISTES PANE EDV
        
      public  static  void addRequestList(){
        System.out.println("ti tha thelate na prosthesete sthn lista sas:");
        System.out.println("pathste [1] gia materials kai [2] gia  sevices");
        int p;
        p = Scaner.nextInt();
        int i;
        
        switch(p){
        case 1:{
            System.out.println("Ti apo ta  parkato materials tha thelate na prosthesete : ");
             for(i=0; i<MaterialsList.size(); i++){
                    System.out.println("["+(i)+"]"+" "+MaterialsList.get(i).getEntityInfo());
                    System.out.println("\n");
                }
             int y;
             System.out.println("epilexte ena apo ta parpanv");
             y = Scaner.nextInt();
               

                        System.out.println("epilexate na prosthesete "+MaterialsList.get(y).getEntityInfo());
                        double k;
                        System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                        k = Scaner.nextDouble();
    
                        RequestDonation RDN = new RequestDonation(MaterialsList.get(y),k);
                        REQ.AddRdEntities(RDN,y,k);
    
                    break;
                    } 
                    
         case 2:{
            System.out.println("Ti apo ta  parkato Services tha thelate na prosthesete : ");
             for(i=0; i<ServicesList.size(); i++){
                    System.out.println("["+(i+1)+"]"+" "+ServicesList.get(i).getEntityInfo());
                    System.out.println("\n");
                }
             int y;
             double k;
             System.out.println("epilexte ena apo ta parpanv");
             y = Scaner.nextInt();
                
                     System.out.println("epilexate na prosthesete "+ServicesList.get(y).getEntityInfo());
                     System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                     k = Scaner.nextDouble();
                     RequestDonation Serv = new RequestDonation(ServicesList.get(y),k);
                     
                     REQ.AddRdEntities(Serv,y,k);
                break;
                }
           
         }
      }
    
    
            
    
    public  static void AddOfferList(){
        System.out.println("ti tha thelate na prosthesete sthn lista sas:");
        System.out.println("pathste [1] gia materials kai [2] gia  sevices");
        int p;
        p = Scaner.nextInt();
        int i;
        
        switch(p){
        case 1:{
            System.out.println("Ti apo ta  parkato materials tha thelate na prosthesete : ");
             for(i=0; i<MaterialsList.size(); i++){
                    System.out.println("["+(i)+"]"+" "+MaterialsList.get(i).getEntityInfo());
                    System.out.println("\n");
                }
             int y;
             System.out.println("epilexte ena apo ta parpanv");
             y = Scaner.nextInt();
                switch(y){
                    case 0:{
                        System.out.println("epilexate na prosthesete "+MaterialsList.get(0).getEntityInfo());
                        double k;
                        System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                        k = Scaner.nextDouble();
    
                        RequestDonation food1 = new RequestDonation(MaterialsList.get(0),k);
                        System.out.println(food1.getEntity().getEntityInfo()+" " +food1.getQuantity());
                        RDL.AddRdEntities(food1);
                        break;
                    }
                    case 1:{
                        System.out.println("epilexate na prosthesete "+MaterialsList.get(1).getEntityInfo());
                        double k;
                        System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                        k = Scaner.nextDouble();
    
                        RequestDonation food2 = new RequestDonation(MaterialsList.get(1),k);
                        RDL.AddRdEntities(food2);
                        break;
                    }
                    case 2:{
                        System.out.println("epilexate na prosthesete "+MaterialsList.get(2).getEntityInfo());
                        double k;
                        System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                        k = Scaner.nextDouble();
    
                        RequestDonation food3 = new RequestDonation(MaterialsList.get(2),k);
                        RDL.AddRdEntities(food3);
                        break;
                    }
                    default :{
                        System.out.println("den exoume ayto to material");
                        ShowRequestList();
                    }
            
                }
            
        
            break;
         }
        
         case 2:{
             System.out.println("Ti apo ta  parkato Services tha thelate na prosthesete : ");
             for(i=0; i<ServicesList.size(); i++){
                    System.out.println("["+(i+1)+"]"+" "+ServicesList.get(i).getEntityInfo());
                    System.out.println("\n");
                }
             int y;
             System.out.println("epilexte ena apo ta parpanv");
             y = Scaner.nextInt();
                switch(y){
                    case 1:{
                        System.out.println("epilexate na prosthesete "+ServicesList.get(1).getEntityInfo());
                        int k;
                        System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                        k = Scaner.nextInt();
    
                        RequestDonation Serv1 = new RequestDonation(ServicesList.get(1),k);
                        RDL.AddRdEntities(Serv1);
                        break;
                    }
                    
                    case 2:{
                        System.out.println("epilexate na prosthesete "+ServicesList.get(2).getEntityInfo());
                        int k;
                        System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                        k = Scaner.nextInt();
    
                        RequestDonation Serv2 = new RequestDonation(ServicesList.get(2),k);
                        RDL.AddRdEntities(Serv2);
                        break;
                    }
                    
                    case 3:{
                        System.out.println("epilexate na prosthesete "+ServicesList.get(3).getEntityInfo());
                        int k;
                        System.out.println("posh posothta apo ayto tha thlete na prosthesete:");
                        k = Scaner.nextInt();
    
                        RequestDonation Serv3 = new RequestDonation(ServicesList.get(3),k);
                        RDL.AddRdEntities(Serv3);
                        break;
                    }
                    
                    default :{
                        System.out.println("den exoume ayto to Servicce");
                        //tha ton stelnei sto  menu
                    }
        
                }
            break;
         }
       }
     }
    
        
        
      public  static  void ShowRequestList(){
            int d;
            System.out.println("If you want to remove something press [1]\nif you want to change a quatnity press 2 \n if you want to commit the list press [3]\nif you want to clear all press [4]\n if you want to add somthing press [5]");
           System.out.println("sas analogoune : "+mat.ReturnLevel()+" antikhmena synolika ");
            int k;
            k = Scaner.nextInt();
            
            
            switch(k){
                case 1:{
                    System.out.println("ti apo ta parakato thelte na aferesete");
                    int i;
                    for(i=0; i<RDL.rdEntities.size(); i++){
                        System.out.println("["+(i)+"]"+" "+RDL.rdEntities.get(i).getEntity().getEntityInfo());
                        System.out.println("\n");
                        }
                        System.out.println("");
                    
                    int y;
                    y = Scaner.nextInt();
                    RDL.remove(RDL.rdEntities.get(y));
            }
                    
                    
                case 2:{
                     System.out.println("ti apo ta parakato thelte na aferesete");
                    int i;
                    for(i=0; i<RDL.rdEntities.size(); i++){
                        System.out.println("["+(i)+"]"+" "+RDL.rdEntities.get(i).getEntity().getEntityInfo());
                        System.out.println("\n");
                        }
                        System.out.println("");
                    
                    int y;
                    y = Scaner.nextInt();
                    REQ.modify(RDL.rdEntities.get(y),y);  
           }
           
           
            case 3:{
            REQ.commit();
            break;         
            }
            case 4:{
                RDL.reset();
            }
            
            case 5:{
            addRequestList();}
            
            default:{
            System.out.println("kati phge straba dokimeaste jana");
            ShowOfferList();
            }
         
        }
    }
    

    public  static void ShowOfferList(){
            int d;
            System.out.println("If you want to remove something press [1]\nif you want to change a quatnity press [2] \n if you want to commit the list press [3]\nif you want to clear all press [4]\n if you want to add somthing press [5]");
            int k;
            k = Scaner.nextInt();
            
            switch(k){
                case 1:{
                    System.out.println("ti apo ta parakato thelte na aferesete");
                    int i;
                    for(i=0; i<RDL.rdEntities.size(); i++){
                        System.out.println("["+(i)+"]"+" "+RDL.rdEntities.get(i).getEntity().getEntityInfo());
                        System.out.println("\n");
                        }
                    System.out.println("");
                    
                    int y;
                    y = Scaner.nextInt();
                    System.out.println("ti apo ta parakato thelte na aferesete");
                    RDL.remove(RDL.rdEntities.get(y));
            }
                    
                    
                case 2:{
                    System.out.println("ti apo ta parakato thelte na allaxete");
                    int i;
                    for(i=0; i<RDL.rdEntities.size(); i++){
                        System.out.println("["+(i)+"]"+" "+RDL.rdEntities.get(i).getEntity().getEntityInfo());
                        System.out.println("\n");
                    }
                    System.out.println("");
                    
                    int e;
                    e= Scaner.nextInt();
                    RDL.modify(RDL.rdEntities.get(e));
                    
               
           }
           
           
            case 3:{
               offer.commit();
            break;         
            }
            case 4:{
                RDL.reset();
            }
            
             case 5:{
            AddOfferList();}
             
           
            
            default:{
            System.out.println("kati phge straba dokimeaste jana");
            ShowOfferList();
            }
         
        }
    }

     
    

        
        
        //LOCATION
       public  static int location=3;    
       public  static void CheckPhones(String CheckPhone){
        
            if(BenPhones.contains(CheckPhone)){
                location = 1;
                }
                    
            else if(DonPhones.contains(CheckPhone)){
                location = 1;
                }
                        
            else if(AdmPhones.contains(CheckPhone)){
                location = 1;
                } 
            else{System.out.println(location);}
        }
        
         public  static int getLocation(){
        return location;
        }
    
}



     