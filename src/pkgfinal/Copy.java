/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;
import java.util.Date;
/**
 *
 * @author sa
 */
public class Copy {
    private int ID;
    private Boolean status;
    private  Date inseryData;

    public Copy() {
    }

    public Copy(int ID, Boolean status, Date inseryData) {
        this.ID = ID;
        this.status = status;
        this.inseryData = inseryData;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getInseryData() {
        return inseryData;
    }

    public void setInseryData(Date inseryData) {
        this.inseryData = inseryData;
    }

    @Override
    public String toString() {
        return "Copy{" + "ID=" + ID + ", status=" + status + ", inseryData=" + inseryData + '}';
    }
    
}
