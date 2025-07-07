abstract class User {
    private String name;
    private String phone;
    
    User(String name,String phone) {
        this.name = name;
        this.phone = phone;
        
    }
    
    User(){}
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    
    void setPhone(String phone){
        this.phone = phone;
    }
    
    String getPhone(){
        return phone;
    }
}