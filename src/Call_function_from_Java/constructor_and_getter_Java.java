package Call_function_from_Java;

public class constructor_and_getter_Java {
    String name;
    int id;
    public constructor_and_getter_Java(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
