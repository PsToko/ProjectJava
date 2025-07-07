import java.util.Comparator;

class Admin extends User {
   
    private boolean isAdmin = true;
    
    Admin(String name,String phone){
        super(name,phone);
        this.isAdmin = true;
        
        
    }
    
    Admin(){
    this.isAdmin = true;}
    
    
    boolean AdmPhone(Organization o){
        if(getPhone().equals(o.getAdmin().getPhone())){
            isAdmin = true;
            return true;
        }
        isAdmin = false;
        return false;
    }
    
    public boolean getIsAdmin(){
    return isAdmin;
    }
    
    boolean setIsAdmin(boolean switcher){
        if(switcher==true)
           return  isAdmin= true;
        
        else
           return isAdmin= false;
    }    
}
    
