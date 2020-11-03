package sk.kosickaakademia.kolesarova.school.hobby;                           
                                                                              
public class Music extends Hobby{                                             
    private String skladatel;                                                 
                                                                              
    public Music(String name, String druh, String skladatel){                 
        super(name, druh);                                                    
        this.skladatel=skladatel;                                             
    }                                                                         
                                                                              
    public String getSkladatel() {                                            
        return skladatel;                                                     
    }                                                                         
}                                                                             