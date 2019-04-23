import java.util.*;
import java.util.Comparator;

public class User implements Comparable<User> {

    private byte old;
    private String name;
    private String lastName;
    private Date birthDate;
    private boolean married;

    public User(byte old) {
        this.old = old;
    }

    /**
     * @return the old
     */
    public byte getOld() {
        return old;
    }

    /**
     * @return the married
     */
    public boolean isMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(boolean married) {
        this.married = married;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param old the old to set
     */
    public void setOld(byte old) {
        this.old = old;
    }

    public int compareTo(User other) {

        if (this.old > other.old) {
            return 1;
        } else if (this.old < other.old) {
            return -1;
        } else {
            return 0;
        }

    }

    public String toString() {

        return this.name + " " + this.lastName + " tiene  " + this.old + "annos";

    }

}