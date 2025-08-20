package proxy.real;

import proxy.interfacee.DataService;
import proxy.model.User;

import java.util.ArrayList;
import java.util.List;

public class RealDataService implements DataService{
    
    private List<User> users;
    
    public RealDataService(){
        users = new ArrayList<>();
        users.add(new User("Carlos", "admin"));
        users.add(new User("Lucia", "user"));
        users.add(new User("Maria", "admin"));
        users.add(new User("Juan", "user"));
    }
    
    @Override
    public void fetchData(){
        System.out.println("Mostrando usuarios registrados en el systema: ");
        for(User u : users){
           System.out.println(" - Usuario: " + u.getUsername() + ", Rol: " + u.getRole());
        }
    }
}


