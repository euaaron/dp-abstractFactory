package factory;

import permissions.GuestPermission;
import permissions.Permission;

public class GuestRoleFactory implements RoleFactory {

    public Permission getPermission() {
        return new GuestPermission();
    }

}
