package org.example.ProxyPattern;

public class Object_Access implements ObjectAccess{
    @Override
    public void access() {
        System.out.println("Предоставляется доступ к файлу");
    }
}
