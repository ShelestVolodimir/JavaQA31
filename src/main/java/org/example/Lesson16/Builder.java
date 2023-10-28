package org.example.Lesson16;

public class Builder extends Human{
    String profession;

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void building(){
        System.out.println(name + "build house" );
    }
}
