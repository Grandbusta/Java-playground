public class User {
    public String name;
    private String firstName;
    public String getFullName(){
        return name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String fn){
        firstName=fn;
    }
}
