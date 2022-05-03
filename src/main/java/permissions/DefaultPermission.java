package permissions;

public class DefaultPermission implements Permission {
    @Override
    public AccessLevel getAccess() {
        return AccessLevel.get(0);
    }
}
