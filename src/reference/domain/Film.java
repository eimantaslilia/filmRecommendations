package reference.domain;

public class Film {
    private String name;

    public Film(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return this.name;
    }
    @Override
    public boolean equals(Object object){
        if(this.getClass() != object.getClass()){
            return false;
        } Film compared = (Film) object;
        if(compared.name == null){
            return false;
        }
        if(this.name != compared.name){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
