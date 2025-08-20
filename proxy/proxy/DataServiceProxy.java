package proxy.proxy;

import proxy.interfacee.DataService;
import proxy.model.User;
import proxy.real.RealDataService;

public class DataServiceProxy implements DataService{
    private RealDataService realService;
    private User user;
    
    public DataServiceProxy (User user) {
        this.user = user;
        this.realService = new RealDataService();
    }
    
    @Override 
    public void fetchData(){
        if(user.getRole().equals("admin")){
            System.out.println("Usuario autorizado: " + user.getUsername());
            realService.fetchData();
        }
        else{
            System.out.println("Acceso denegado para el usuario: " + user.getUsername());
        }
    }
}
