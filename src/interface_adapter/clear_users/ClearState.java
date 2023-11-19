package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> users = new ArrayList<>();

    public ClearState(ClearState copy) {
        users = copy.users;
    }

    public ClearState() {
    }

    public ArrayList<String> getUsers() {
        return users;
    }
}
