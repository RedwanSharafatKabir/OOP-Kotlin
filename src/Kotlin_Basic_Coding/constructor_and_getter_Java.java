package Kotlin_Basic_Coding;

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
