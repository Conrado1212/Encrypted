package stage5.getAndSet;

public class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (null == firstName) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (null == lastName) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        String fullName = "";

        if ("".equals(this.firstName) && "".equals(this.lastName)) {
            fullName = "Unknown";
        } else if ("".equals(this.lastName)) {
            fullName = firstName;
        } else if ("".equals(this.firstName)) {
            fullName = lastName;
        } else {
            fullName = firstName + " " + lastName;
        }

        return fullName;
    }

    }

