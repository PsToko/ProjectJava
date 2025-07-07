   class Entity {
    String name;
    String description;
    int id;
    
    Entity(String name,String description,int id){
        this.name = name;
        this.description = description;
        this.id = id;
    }
    
    Entity(){}
    
   void  SetnameEntity(String Newname){
    this.name = Newname;
    }
    
    void  SetIdEntity(int Newid){
    this.id = Newid;
    }
    
    void  Setdescription(String Newdescription){
    this.description = Newdescription;
    }
    
    String getEntityInfo(){
        return name ;
    }
    
    String getDetails(){
        return description;
    }
    
    int getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return getEntityInfo() + "\n" + getDetails()+ "\n" + getId();
    }
    
}