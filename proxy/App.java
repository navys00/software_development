package org.example.ProxyPattern;

public class App {
    public static void noRoles() {
        ObjectAccess someObjectAccess = new Object_Access();
        someObjectAccess.access();
    }

    public static void withRolesFail() {
        ObjectAccess someObjectAccess = new Proxy_access(role.User);
        someObjectAccess.access();
    }

    public static void withRolesGranted() {
        ObjectAccess someObjectAccess = new Proxy_access(role.Admin);
        someObjectAccess.access();
    }

    public static void main(String[] args) {
        noRoles();
        System.out.println("     ");
        withRolesFail();
        System.out.println("     ");
        withRolesGranted();
        
    }


}
