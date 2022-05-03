package permissions;

public enum AccessLevel {
    GUEST, USER, MOD, ADMIN;

    /**
     * @input int: 0 = USER, 1 = MOD, 2 = ADMIN, 3 = GUEST
     * @description Returns the access level of the given permission.
     * */
    public static AccessLevel get(int level) {
        switch (level) {
            case 0:
                return USER;
            case 1:
                return MOD;
            case 2:
                return ADMIN;
            default:
                return GUEST;
        }
    }
}
