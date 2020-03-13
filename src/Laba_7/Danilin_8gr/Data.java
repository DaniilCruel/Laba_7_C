package Laba_7.Danilin_8gr;

import java.io.*;
import java.util.ArrayList;

public class Data {

    private ArrayList<User> users = new ArrayList<>(10);

    public Data (String name, int addres) {


    }

    public  void addData () {

        users.add(new User(User.getName(), User.getAddres()));
    }






}
