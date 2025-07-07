import java.util.Scanner;
import javax.swing.Box;
import java.util.Random;


class  Menu{
    //αναπαριστά το μενού της εφαρμογής και περιλαμβάνει μεθόδους για την
    //εκτύπωση των επιλογών,
    //τον χειρισμό της εισόδου του χρήστη και την πλοήγηση στο μενού.
    
    Scanner scanA = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);//thn cs thn exv gia ta char 
    Admin admin ;
    public static RequestDonationList RDL ;
    String CheckPhone = new String();
    Requests REQ;
    Offers offer;
    
     void menu(){
        
            boolean bool = true;
            int select;
            boolean status;
            char choose;
            char Whatuser;
            
            int i=0;
            int chooseUser;//dialegh o xrhsths an den yparxei eidh an thelei na eggrafh h na fygei
            CheckPhone=null;
            
                System.out.println("Welcome to System voluntary organisation of beneficiaries and donators!!!");
                System.out.println("\nPlease enter your phone number");
                
               
                CheckPhone = sc.nextLine(); 
                
                Organization.CheckPhones(CheckPhone);
            
                System.out.println(CheckPhone);
               switch(Organization.getLocation()){
                  case 1:{break;}
                                
                  default:{System.out.println("Den eiste xrhsths.\n an thelte na ginete pathste 1 allios an den thelete pathste opoiodhpote koympi");
                        chooseUser=scanA.nextInt();
                        switch(chooseUser){
                            
                            case 1:{
                            System.out.println("Epilexate na eggrafhte");
                            SignUp();
                            break;}
                                        
                            default:{  
                          System.out.println("Eyxaristoume \n geia sas....");
                          System.exit(0);
                          break;}
                        }
                        
                    break;}
                    
                }
   
                
                Whatuser ='r';
                
                if(Organization.AdmPhones.contains(CheckPhone)){
                    Whatuser='a'; 
                    
                }
                else if(Organization.BenPhones.contains(CheckPhone)){
                   Whatuser='b'; 
                   
                }
                
                else if(Organization.DonPhones.contains(CheckPhone)){
                   Whatuser='d'; 
                }
                else
                    System.out.println(Whatuser);
                 
                
                
                switch(Whatuser){
                    
                case 'a' : {
                    System.out.println("Greetings Admin ("+Organization.AdmNames.get(0)+") // phone ["+ Organization.AdmPhones.get(0) + "]" );
                    System.out.println("\n[1] View \n[2] Monitor Organization \n[3] Back \n[4] Logout \n[5] Exit");
                    select = scanA.nextInt();

                    switch(select){
                        
                        case 1:{
                            Organization.ViewAdmin();
                            break;
                        }
                        
                        case 2 :{
                             Organization.monitor();                   
                        }
                        
                        
                        case 3:{
                            Back();
                            break;
                        }
                        case 4:{
                            LogOut();
                            break;
                        }
                        
                        case 5:{
                            Exit();
                            break;
                        }

                        default:{
                            System.out.println("Wrong char. Try again ");
                            scanA.nextLine();
                        }
                    }
                    break;
                }
                
               case'd': {
                        System.out.println("Greetings Donator");
                        int s;
                        Organization.DonPhones.indexOf(CheckPhone);
                        s=Organization.DonPhones.indexOf(CheckPhone);
                        Donator don = new Donator(Organization.DonNames.get(s),CheckPhone);//h logikh einai na baloyme se idia lista ta onomata kai ta thlefvna vste na pernoyme apo t
                        System.out.println("kalos hrthes piso "+don.getName()+ "piso dialexe ti thes apo ta prakato...");
                        System.out.println("\n[1] Add Offer \n[2] Show Offers \n[3] Commit \n[4] Back \n[5] Logout \n[6] Exit");
                        select = scanA.nextInt();
                        do{
                            switch(select){
                                    case 1:{
                                    Organization.AddOfferList();
                                    break;
                                }
                                case 2: {
                                    Organization.ShowOfferList();
                                    break;
                                    }
                                    
                                    
                                    case 3:{
                                        Organization.DonCommit();
                                        break;
                                    }
                                    case 4:{
                                        Back();
                                        break;
                                    }
                                    case 5 :{
                                        LogOut();
                                        break;
                                    }
                                    case 6 : {
                                        Exit();
                                        break;
                                    }
                                    default :{
                                        System.out.println("Wrong number. Try again ");
                                        scanA.nextLine();
                                    }
                                }
                            }while(select != 1 && select != 2 && select != 3 && select != 4 && select != 5 && select != 6); 
                            break;
                }
                
                case 'b':{
                        System.out.println("Greetings Beneficiary");
                        int s;
                        Organization.BenPhones.indexOf(CheckPhone);
                        s=Organization.BenPhones.indexOf(CheckPhone);
                        Beneficiary ben = new Beneficiary(Organization.BenNames.get(s),CheckPhone,Organization.BenNoPersons.get(s));//h logikh einai na baloyme se idia lista ta onomata kai ta thlefvna vste na pernoyme apo t
                        System.out.println(ben.getName()+" kalos hrthes piso dialexe ti thes apo ta prakato...");
                        System.out.println("\n[1] Add Request \n[2] Show Requests \n[3] Commit \n[4] Back \n[5] Logout \n[6] Exit");
                        select =sc.nextInt();
                        do{
                            switch(select){
                                case 1:{
                                    Organization.addRequestList();
                                    break;
                                }
                                case 2 :{
                                    Organization.ShowRequestList();
                                    break;
                                }
                               case 3 :{
                                    REQ.commit();
                                    break;
                                }
                                case 4:{
                                    Back();
                                    break;
                                }
                                case 5:{
                                    LogOut();
                                    break;
                                }
                                case 6 :{
                                    Exit();
                                    break;
                                }
                               default :{
                                    System.out.println("Wrong number. Try again ");
                                    scanA.nextLine();
                                }
                            }
                            
                        }while(select != 1 && select != 2 && select != 3 && select != 4 && select != 5 && select != 6);
                        break;
                    }
                    default:{
                        System.out.println("something went wrong press any key to  try again :(");
                        System.out.println("Press Enter key to continue...");
                        try
                        {
                            System.in.read();
                            menu();
                        }  
                        catch(Exception e){
                        System.out.println("ayto den einai enter");
                        }  
  
                    }
            }
        
        }
    

    
    void SignUp(){
        
    
        
        
        int select;
        int choiceB = 0;
        String choose;
        
        System.out.println("If you want to sign up as donator press 1");
        System.out.println("If you want to sign up as beneficiary press 2");
        System.out.println("an allajes gnvmh pata 3");
        choiceB = scanA.nextInt();
       
        
                            switch (choiceB){
                                
                                case 1:{
                                //egrafh sthn klash donator
                                
                                //eggrafh onomatos
                                System.out.println("Enter your name:");
                                scanA.nextLine();
                                String s1=scanA.nextLine();
                                Organization.AddDonName(s1);
                    
                                //eggrafh thlefonoy
                                String s2;//to String gia to thlefvno apo katv
                                System.out.println("Enter your phone number: ");
                                do{//mporeoume na to kanoyme me  Switch alla argotera 
                                        s2=scanA.nextLine();
                                        Organization.getDonPhone().add(s2);
                                    }while(s2.length()<10 && s2.length()>10);
                                int  s;                     
            
                                System.out.println("You are our new donator!!!!! \nYour details \n " + s1 + " " + s2 );
                                menu();
                                break;
                                //edv prepei na to stelnoyme pali sthn arxh  
                                }
                            
                  
                                case 2:{
                                    //egrafh sthn klash beneficiary
                                    
                                    //eggrafh onomatos
                                    System.out.println("Enter your name: ");
                                    scanA.nextLine();
                                    String s3 =new String();
                                    s3=scanA.nextLine();
                                    Organization.BenNames.add(s3);
                                    
                                    
                                    
                                    //eggrafh thlefonoy
                                    String s4 = new String();
                                    do{//mporeoume na to kanoyme me  Switch alla argotera
                                        
                                        System.out.println("Enter your phone: ");
                                            s4=scanA.nextLine();
                                            Organization.BenPhones.add(s4);
                                            
                                        }while(s4.length()<10 && s4.length()>10);
                                        
                                    //eggrafh melon oikogenoias
                                    int s5;
                                    System.out.println("posa melh exei h oikogenoia :");
                                    s5=scanA.nextInt();
                                    Organization.BenNoPersons.add(s5);
                                } 
                            
                            case 3:{System.out.println("Have a nice day ");
                                    menu();
                                    break;}
                        
                            default:{System.out.println("Please choose 1 an thes na gineis donator or 2 an thes na gineis  beneficiary");
                                break;}
                        
                    
                    }while(choiceB != 1 && choiceB != 2);
                    }      
                
      
  
                
            
            
        void LogOut(){
        int choose;
        System.out.println("You log out. Do you want to log in with another user? [1] to login again or [2] to exit ?? ");
        choose = scanA.nextInt();
        do{
            switch(choose){
             case 1 :{
                System.out.println("You choose to log in with another user");
                menu();
                break;
            }
             case 2:{
                System.out.println("Have a nice day ");
                System.exit(0);
                break;
            }
            default:{
                System.out.println("Please enter 1 or 2 ");
                scanA.nextLine();
                break;
            }
        }
        }while(choose != 1 && choose != 2);
    }   
    
    void Exit(){
        System.out.println("Have a nice day ");
        System.exit(0);
    }
    
    void Back(){
        System.out.println("You choose to go back");
        menu();
    }
    
 }