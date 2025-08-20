package proxy;

import proxy.interfacee.DataService;
import proxy.model.User;
import proxy.proxy.DataServiceProxy;

public class Main {
    public static void main(String[] args){
        User adminUser = new User("carlos", "admin");
        User normalUser = new User("Lucia", "user");
        
        DataService adminAccess = new DataServiceProxy(adminUser);
        DataService userAccess = new DataServiceProxy(normalUser);
        
        System.out.println("Intento de acceso con usuario admin: ");
        adminAccess.fetchData();
        
        System.out.println("\nIntento de acceso con usuario normal: ");
        userAccess.fetchData();
        
    }
}
