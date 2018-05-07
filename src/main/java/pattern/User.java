package pattern;

import com.sun.istack.internal.NotNull;

import java.util.Collection;
import java.util.List;

public class User {
    private String name;
    private String address;
    private String phone;
    private List<User> friends;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", friends=" + friends +
                '}';
    }

    private User() {

    }

    public static class Builder {
        private User instance;
        boolean builded = false;


        public Builder() {
            instance = new User();
        }

        public Builder withName(String name) {
            instance.name = name;
            return this;
        }

        public Builder withAddress(String address) {
            instance.address = address;
            return this;
        }

        public Builder withPhone(String phone) {
            instance.phone = phone;
            return this;
        }

        public Builder withName(User user) {
            if (user != null) {
                instance.friends.add(user);
            }
            return this;
        }


        public Builder withFriends(@NotNull Collection<User> friends) {
            instance.friends.addAll(friends);
            return this;
        }

        User build() {
            if (!builded) {
                builded = true;
                return instance;
            }
            System.out.println("qwe");
            return null;
        }

    }

    public static void main(String[] args) {
        User user = new Builder()
                .withName("Vasia")
                .withAddress("mehnicova 16")
                .build();
        System.out.println(user);

        User user1 = new Builder().withPhone("456").build();
        System.out.println(user1);
    }
}
