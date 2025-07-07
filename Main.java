import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


class Main {
    public static Menu m = new Menu();
    public static RequestDonationList RDL = new RequestDonationList() ;
    public static void main(String[] args){
        
        
        
        RequestDonation RD;
      
        
        
        
        Admin admin = new Admin("leonidas","6971972391");
        Organization.AdmPhones.add("6971972391");
        Organization.AdmNames.add("leonidas");
     
        
        Material bread = new Material("bread","olikhs",10);
        Material tuna = new Material("tuna","tuna can",20);
        Material meat = new Material(" meat","meat",30);
        Service babySitter = new Service("babySitting","from leonidas",40);
        Service Coocker = new Service("coocker","cooker",50);
        Service Singer = new Service("Doctor","Doctor",60);
        
        
         Organization.MaterialsList.add(bread);
         Organization.MaterialsList.add(tuna);
         Organization.MaterialsList.add(meat);
         Organization.ServicesList.add(babySitter);
         Organization.ServicesList.add(Coocker);
         Organization.ServicesList.add(Singer);
          
         
        RequestDonation rdbread =  new RequestDonation(bread,500);
        RequestDonation rdtuna =  new RequestDonation(tuna,50);
        RequestDonation rdmeat =  new RequestDonation(meat,0);
        RequestDonation rdbabySitter =  new RequestDonation(babySitter,3);
        RequestDonation rdCoocker =  new RequestDonation(Coocker,2);
        RequestDonation rdSinger =  new RequestDonation(Singer,9);
        
        RDL.RequestDonationLists.add(rdbread);
        RDL.RequestDonationLists.add(rdtuna);
        RDL.RequestDonationLists.add(rdmeat);
        RDL.RequestDonationLists.add(rdbabySitter);
        RDL.RequestDonationLists.add(rdCoocker);
        RDL.RequestDonationLists.add(rdSinger);
      
        m.menu();   
     }  
     
    }