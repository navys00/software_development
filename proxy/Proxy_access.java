package org.example.ProxyPattern;

public class Proxy_access implements ObjectAccess{
    private final Object_Access someObjectAccess = new Object_Access();
    private final org.example.ProxyPattern.role role;

    public Proxy_access(org.example.ProxyPattern.role role) {
        this.role = role;
    }

    @Override
    public void access() {
        if (role == org.example.ProxyPattern.role.Admin) {
            System.out.println("Доступ подтвержден");
            someObjectAccess.access();
        }
        else {
            System.out.println("Права доступа имеет только Admin");
        }
    }
}
