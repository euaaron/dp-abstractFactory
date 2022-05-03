package factory;

import permissions.DefaultPermission;
import permissions.Permission;

public class DefaultRoleFactory implements RoleFactory {

    public Permission getPermission() {
        return new DefaultPermission();
    }

}
