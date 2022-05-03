import factory.RoleFactory;
import permissions.AccessLevel;
import permissions.Permission;

public class User {
    private Permission accessLevel;
    private String name;

    public User(RoleFactory role, String name) {
        this.accessLevel = role.getPermission();
        this.name = name;
    }

    public AccessLevel getAccess() {
        return this.accessLevel.getAccess();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
