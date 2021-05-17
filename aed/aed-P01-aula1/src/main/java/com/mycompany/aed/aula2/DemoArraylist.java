package com.mycompany.aed.aula2;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArraylist<T extends Comparable> {
    
    private ArrayList<T> lista;
    
    public DemoArraylist() {
        
        lista=  new ArrayList<T>();
    }
    
    
    
    public void limpa()
    {
        this.lista.clear();
        
        
    }
    
    public int procura(T elem)
    {
        
        return this.lista.indexOf(elem);
        
        
        
    }
    
    
    public T nesimo(int pos)
    {
        return this.lista.get(pos);
        
    }
    
    
    public void add(T elem)
    {
        this.lista.add(elem);
        
    }
    
    
    public void  ordena()
    {
        
        Collections.sort(lista);
        
        
    }
    
    
    public void remove(T elem)
    {
        this.lista.remove(elem);
    }
    
    @Override
    public String toString() {
        String result="DemoArrayList->";
        
        for (int i = 0; i < this.lista.size(); i++) {
            result += " " + this.lista.get(i);
        }
        return result;
    }
    
    
    
    
    
    
}
