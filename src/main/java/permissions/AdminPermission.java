package permissions;

public class AdminPermission implements Permission{

    @Override
    public AccessLevel getAccess() {
        return AccessLevel.get(2);
    }
}
