import factory.*;
import org.junit.jupiter.api.Test;
import permissions.AccessLevel;

class UserTest {

    @Test
    void shouldAssignAccessToGuests() {
        RoleFactory factory = new GuestRoleFactory();
        User guest = new User(factory, "Reginaldo");
        assert(guest.getAccess() == AccessLevel.GUEST);
    }

    @Test
    void shouldAssignAccessToUser() {
        RoleFactory factory = new DefaultRoleFactory();
        User guest = new User(factory, "Roberval");
        assert(guest.getAccess() == AccessLevel.USER);
    }

    @Test
    void shouldAssignAccessToModerator() {
        RoleFactory factory = new ModeratorRoleFactory();
        User guest = new User(factory, "Regina");
        assert(guest.getAccess() == AccessLevel.MOD);
    }

    @Test
    void shouldAssignAccessToAdmin() {
        RoleFactory factory = new AdminRoleFactory();
        User guest = new User(factory, "Renata");
        assert(guest.getAccess() == AccessLevel.ADMIN);
    }


}