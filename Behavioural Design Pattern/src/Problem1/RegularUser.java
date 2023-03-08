package Problem1;

public class RegularUser extends User{
    public RegularUser(Server s,String str) {
        server = s;
        server.attach(this);
        flag = 2;
        name = str;
    }

    @Override
    public int update(String msg, boolean reply) {
        System.out.println("("+name+"):");
        if(reply){
            while (true){
                System.out.println(msg);
                int r = scn.nextInt();
                if(r==1 || r==2)
                    return r;
                else
                    System.out.println("Wrong input given!!");
            }
        }
        else
            System.out.println(msg);
        return 0;
    }
}
