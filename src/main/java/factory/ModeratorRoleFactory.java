package factory;

import permissions.ModeratorPermission;
import permissions.Permission;

public class ModeratorRoleFactory implements RoleFactory {

    public Permission getPermission() {
        return new ModeratorPermission();
    }

}
