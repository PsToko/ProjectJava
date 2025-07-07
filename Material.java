class Material extends Entity {
    private static double level1,level2,level3;
    public static Beneficiary Ben;
    Material(String name,String description,int id){
        super(name,description,id);
    }
    
    Material(){}
    
    
    public static double ReturnLevel(){
        
        if(Ben.getNoPerson() == 1){
            return level1 = 10;
        }
        else if(Ben.getNoPerson() == 2 || Ben.getNoPerson() == 3 || Ben.getNoPerson() == 4){
            return level2 = 20;
        }
        else if (Ben.getNoPerson() >= 5){
             return level3 = 30;
        }
        else{
            return 0;
        }
        
    }
       
   
    
    @Override
    public String getDetails(){
        return  super.getDetails() + "\nLevels:" + "\n Level 1: " + level1 + "\n Level 2: " +level2 + "\n Level 3: " + level3 + "\nThis item is type material donation";
    }
    
}