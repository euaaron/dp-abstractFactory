package permissions;

public class ModeratorPermission implements Permission {

    @Override
    public AccessLevel getAccess() {
        return AccessLevel.get(1);
    }
}
