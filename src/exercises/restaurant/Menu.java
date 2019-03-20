package exercises.restaurant;

import java.util.Date;

public class Menu {
    private Date lastUpdated;

    public Menu(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
