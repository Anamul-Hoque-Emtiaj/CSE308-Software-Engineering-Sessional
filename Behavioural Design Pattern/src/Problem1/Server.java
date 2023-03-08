package Problem1;

import java.util.ArrayList;
import java.util.List;

public class Server { //subject
    private int state;
    private List<User> users;

    public Server() {
        state = 1;
        users = new ArrayList<User>();
    }

    public void setState(int st) {
        notifyAllUsers(state,st);
        this.state = st;
    }

    public int getState() {
        return state;
    }
    public void attach(User user){
        users.add(user);
    }
    public void notifyAllUsers(int prev, int cur){
        for(User user: users){
            int flag = user.getFlag();
            if(prev==1 && cur == 2){
                if(flag==1){
                    String msg = "Do you  wants to use " +
                            "service from two servers " +
                            "(partially from the server of " +
                            "ABC and partially from the " +
                            "server of DEF)? or from one " +
                            "server (DEF)?\nPress 1 for option 1 or 2 for option 2";
                    int reply = user.update(msg,true);
                    if(reply==1){
                        user.setFlag(11);
                    }
                    else if(reply==2){
                        user.setFlag(12);
                    }
                }
                else if(flag==2){
                    String msg = "Do you wants to " +
                            "continue using the limited " +
                            "functionality or pay $20 per " +
                            "hour to enjoy the full " +
                            "functionality taking service " +
                            "from server of DEF?\nPress 1 for option 1 or 2 for option 2";
                    int reply = user.update(msg,true);
                    if(reply==1){
                        user.setFlag(21);
                    }
                    else if(reply==2){
                        user.setFlag(22);
                    }
                }
            }
            else if(prev==1 && cur == 3){
                if(flag==1){
                    String msg = "The " +
                            "service is now provided by " +
                            "our partner DEF company";
                    user.update(msg,false);
                }
                else if(flag==2){
                    String msg = "Do you wants to " +
                            "pay $20 per hour to take " +
                            "service from DEF company?\nPress 1 for option Yes or 2 for option No";
                    int reply = user.update(msg,true);
                    if(reply==1){
                        user.setFlag(22);
                    }
                    else if(reply==2){
                        user.setFlag(21);
                    }
                }
            }
            else if(prev==2 && cur == 1){
                if(flag==22){
                    String msg = "Total Bills: x";
                    user.update(msg,false);

                }
                if(flag==21 || flag==22)
                    user.setFlag(2);
                else
                    user.setFlag(1);
            }
            else if(prev==2 && cur == 3){
                if(flag==11){
                    String msg = "Our " +
                            "company shifts all the " +
                            "services to the server of DEF.";
                    user.update(msg,false);
                }
            }
            else if(prev==3 && cur == 1){
                if(flag==22){
                    String msg = "Total Bills: x";
                    user.update(msg,false);
                }
                if(flag==21 || flag==22)
                    user.setFlag(2);
                else
                    user.setFlag(1);
            }
        }
    }
}
