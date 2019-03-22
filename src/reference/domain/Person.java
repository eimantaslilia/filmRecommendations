package reference.domain;

public class Person {
    private String name;

    public Person(String name){
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
        if(object.getClass() != this.getClass()){
            return false;
        } Person compared = (Person) object;
        if(this.name == null){
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
