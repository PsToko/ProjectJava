class Service extends Entity {
    Organization orga;
    Service(String name,String description,int id){
        super(name,description,id);
    }
    
    
    Service(){}
    
    @Override
     public String getDetails(){
         return super.getDetails() + "\nThis item is type service donation";
 }
 
 
 }