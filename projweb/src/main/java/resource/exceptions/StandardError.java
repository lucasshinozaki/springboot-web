package resource.exceptions;

import java.io.Serializable;
import java.sql.Timestamp;

public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private Timestamp timestamp;
    private int status;
    private String error;
    private String messsage;
    private String path;

    public StandardError() {

    }

    public StandardError(Timestamp timestamp, int status, String error, String messsage, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.messsage = messsage;
        this.path = path;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
