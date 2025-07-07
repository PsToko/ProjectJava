import java.util.ArrayList;

class Offers {
    Donator Don;
    Offers(){}
    RequestDonationList RDL;
    void commit(){
        Don.RDLD.addAll(RDL.rdEntities);
        RDL.rdEntities.clear();  
    }
}
