package com.example.demo.model;

import java.util.ArrayList;

public class GetUserCardsResponse {
    ArrayList < Return > ReturnObject = new ArrayList < Return > ();

    public ArrayList < Return > getReturnObject () {
        return this.ReturnObject;
    }

    public void setReturnObject(ArrayList < Return > returnObject){
        this.ReturnObject = returnObject;
    }
    
}