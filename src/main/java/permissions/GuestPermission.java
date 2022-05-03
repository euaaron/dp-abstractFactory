package permissions;

public class GuestPermission implements Permission {

    @Override
    public AccessLevel getAccess() {
        return AccessLevel.get(3);
    }
}
