package pro.jtaylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    private String description; //Description for Time Entry.
    private float rate;         //Rate of time entry.
    private int time;           //Time of Time enrty.
    /**
     * Get description Method.
     */
    public String getDescription() {
        return description;
    }
    /**
     * Set Description Method.
     * @param value to describe entries
     */
    public void setDescription(final String value) {
        this.description = value;
    }
    /**
     * Get Rate Method.
     */
    public float getRate() {
        return rate;
    }
    /**
     * SetRate Method.
     * @param value to add to set rate
     */
    public void setRate(final float value) {
        this.rate = value;
    }
    /**
     * Get Time Method.
     */
    public int getTime() {
        return time;
    }
    /**
     * Set Time Method.
     * @param value to add to set time
     */
    public void setTime(final int value) {
        this.time = value;
    }

    @Override
    public String toString() {
        return "TimeEntry{" 
                +
                "description='" + description + '\'' 
                +
                ", rate=" + rate 
                +
                ", time=" + time 
                +
                '}';
    }
}

