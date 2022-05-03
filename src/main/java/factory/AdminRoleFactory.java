package factory;

import permissions.AdminPermission;
import permissions.Permission;

public class AdminRoleFactory implements RoleFactory {

    public Permission getPermission() {
        return new AdminPermission();
    }

}
