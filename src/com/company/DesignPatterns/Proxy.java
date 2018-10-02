package com.company.DesignPatterns;

public class Proxy {

    public static void main(String[] args) {
     //admin access Proxy usecase
     Role role = new Role("Admin");
     Accessable accessable = new RecordProxy(role);
     accessable.access();
     //non admin access Proxy usecase
     Role role2 = new Role("NotAdmin");
     Accessable accessable2 = new RecordProxy(role);
     accessable2.access();
    }
}

class Role{

    private String authorization;

    public Role(String authorization){
        this.authorization = authorization;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
}
interface Accessable{

    void access();
}

class Record implements Accessable{

    protected Role role;

    public Record(Role role){

        this.role = role;

    }

    @Override
    public void access() {
        System.out.println("access the student record");
    }
}
//Proxy class
class RecordProxy extends Record{

    public RecordProxy(Role role){
        super(role);
    }

    @Override
    public void access() {
        if(role.getAuthorization()=="Admin"){
            System.out.println("You are admin so can access the Student Record");
        }
        else{
            System.out.println("You are not a Admin,so cannot access the Student Record");
        }
    }
}


