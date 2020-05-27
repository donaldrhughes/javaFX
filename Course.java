package u4a1_javafxregisterforcourse;

/**
 *
 * @author omora
 */
public class Course {
    
    private String code = "";
    private boolean isRegisteredFor = false;
    private int creditHours = 0;
    
    public Course(String code, boolean isRegisteredFor, int creditHours){
        this.code = code;
        this.isRegisteredFor = isRegisteredFor;
        this.creditHours = creditHours;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getCode() {
        return this.code;
    }
      
    
    public void setIsRegisteredFor(boolean trueOrFalse){
        this.isRegisteredFor = trueOrFalse;
    }
    
    public boolean getIsRegisteredFor() {
        return this.isRegisteredFor;
    }
        public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }
    
    public int getCreditHours() {
        return this.creditHours;
    }
    
    @Override
    public String toString(){
        return this.getCode();
    }
    
}
