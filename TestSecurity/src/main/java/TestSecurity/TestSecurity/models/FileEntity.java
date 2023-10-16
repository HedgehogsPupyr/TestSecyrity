package TestSecurity.TestSecurity.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String nameFile;
    private String typeFile;
    private long sizeFile;
    private String pathFile;
    private int keyFile;

    public long getId() {
        return Id;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getTypeFile() {
        return typeFile;
    }

    public void setTypeFile(String typeFile) {
        this.typeFile = typeFile;
    }

    public long getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(long sizeFile) {
        this.sizeFile = sizeFile;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public int getKeyFile() {
        return keyFile;
    }

    public void setKeyFile(int keyFile) {
        this.keyFile = keyFile;
    }

    public FileEntity(String nameFile, String typeFile, long sizeFile, String pathFile, int keyFile) {
        this.nameFile = nameFile;
        this.typeFile = typeFile;
        this.sizeFile = sizeFile;
        this.pathFile = pathFile;
        this.keyFile = keyFile;
    }

    public FileEntity(String nameFile, String typeFile, long sizeFile) {
        this.nameFile = nameFile;
        this.typeFile = typeFile;
        this.sizeFile = sizeFile;
    }

    public FileEntity() {
    }
}
