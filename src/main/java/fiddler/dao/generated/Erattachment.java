package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
public class Erattachment {
    private int id;
    private Integer attachmentdataid;
    private String storagetype;
    private String available;
    private LocalDateTime creationdate;
    private int size;
    private Integer height;
    private Integer width;
    private String mimetype;
    private String originalfilename;
    private String webpath;
    private String filesystempath;
    private String s3Path;
    private String webserverPath;
    private String pathHash;
    private String proxied;
    private String ownerid;
    private String configurationname;
    private Integer parentid;
    private String thumbnail;
    private byte[] smalldata;
    private String cfpath;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attachmentdataid")
    public Integer getAttachmentdataid() {
        return attachmentdataid;
    }

    public void setAttachmentdataid(Integer attachmentdataid) {
        this.attachmentdataid = attachmentdataid;
    }

    @Basic
    @Column(name = "storagetype")
    public String getStoragetype() {
        return storagetype;
    }

    public void setStoragetype(String storagetype) {
        this.storagetype = storagetype;
    }

    @Basic
    @Column(name = "available")
    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Basic
    @Column(name = "creationdate")
    public LocalDateTime getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(LocalDateTime creationdate) {
        this.creationdate = creationdate;
    }

    @Basic
    @Column(name = "size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Basic
    @Column(name = "height")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Basic
    @Column(name = "width")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Basic
    @Column(name = "mimetype")
    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    @Basic
    @Column(name = "originalfilename")
    public String getOriginalfilename() {
        return originalfilename;
    }

    public void setOriginalfilename(String originalfilename) {
        this.originalfilename = originalfilename;
    }

    @Basic
    @Column(name = "webpath")
    public String getWebpath() {
        return webpath;
    }

    public void setWebpath(String webpath) {
        this.webpath = webpath;
    }

    @Basic
    @Column(name = "filesystempath")
    public String getFilesystempath() {
        return filesystempath;
    }

    public void setFilesystempath(String filesystempath) {
        this.filesystempath = filesystempath;
    }

    @Basic
    @Column(name = "s3path")
    public String getS3Path() {
        return s3Path;
    }

    public void setS3Path(String s3Path) {
        this.s3Path = s3Path;
    }

    @Basic
    @Column(name = "webserver_path")
    public String getWebserverPath() {
        return webserverPath;
    }

    public void setWebserverPath(String webserverPath) {
        this.webserverPath = webserverPath;
    }

    @Basic
    @Column(name = "path_hash")
    public String getPathHash() {
        return pathHash;
    }

    public void setPathHash(String pathHash) {
        this.pathHash = pathHash;
    }

    @Basic
    @Column(name = "proxied")
    public String getProxied() {
        return proxied;
    }

    public void setProxied(String proxied) {
        this.proxied = proxied;
    }

    @Basic
    @Column(name = "ownerid")
    public String getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    @Basic
    @Column(name = "configurationname")
    public String getConfigurationname() {
        return configurationname;
    }

    public void setConfigurationname(String configurationname) {
        this.configurationname = configurationname;
    }

    @Basic
    @Column(name = "parentid")
    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    @Basic
    @Column(name = "thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Basic
    @Column(name = "smalldata")
    public byte[] getSmalldata() {
        return smalldata;
    }

    public void setSmalldata(byte[] smalldata) {
        this.smalldata = smalldata;
    }

    @Basic
    @Column(name = "cfpath")
    public String getCfpath() {
        return cfpath;
    }

    public void setCfpath(String cfpath) {
        this.cfpath = cfpath;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Erattachment that = (Erattachment) object;

        if (id != that.id) return false;
        if (size != that.size) return false;
        if (attachmentdataid != null ? !attachmentdataid.equals(that.attachmentdataid) : that.attachmentdataid != null) return false;
        if (storagetype != null ? !storagetype.equals(that.storagetype) : that.storagetype != null) return false;
        if (available != null ? !available.equals(that.available) : that.available != null) return false;
        if (creationdate != null ? !creationdate.equals(that.creationdate) : that.creationdate != null) return false;
        if (height != null ? !height.equals(that.height) : that.height != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (mimetype != null ? !mimetype.equals(that.mimetype) : that.mimetype != null) return false;
        if (originalfilename != null ? !originalfilename.equals(that.originalfilename) : that.originalfilename != null) return false;
        if (webpath != null ? !webpath.equals(that.webpath) : that.webpath != null) return false;
        if (filesystempath != null ? !filesystempath.equals(that.filesystempath) : that.filesystempath != null) return false;
        if (s3Path != null ? !s3Path.equals(that.s3Path) : that.s3Path != null) return false;
        if (webserverPath != null ? !webserverPath.equals(that.webserverPath) : that.webserverPath != null) return false;
        if (pathHash != null ? !pathHash.equals(that.pathHash) : that.pathHash != null) return false;
        if (proxied != null ? !proxied.equals(that.proxied) : that.proxied != null) return false;
        if (ownerid != null ? !ownerid.equals(that.ownerid) : that.ownerid != null) return false;
        if (configurationname != null ? !configurationname.equals(that.configurationname) : that.configurationname != null) return false;
        if (parentid != null ? !parentid.equals(that.parentid) : that.parentid != null) return false;
        if (thumbnail != null ? !thumbnail.equals(that.thumbnail) : that.thumbnail != null) return false;
        if (!java.util.Arrays.equals(smalldata, that.smalldata)) return false;
        if (cfpath != null ? !cfpath.equals(that.cfpath) : that.cfpath != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (attachmentdataid != null ? attachmentdataid.hashCode() : 0);
        result = 31 * result + (storagetype != null ? storagetype.hashCode() : 0);
        result = 31 * result + (available != null ? available.hashCode() : 0);
        result = 31 * result + (creationdate != null ? creationdate.hashCode() : 0);
        result = 31 * result + size;
        result = 31 * result + (height != null ? height.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (mimetype != null ? mimetype.hashCode() : 0);
        result = 31 * result + (originalfilename != null ? originalfilename.hashCode() : 0);
        result = 31 * result + (webpath != null ? webpath.hashCode() : 0);
        result = 31 * result + (filesystempath != null ? filesystempath.hashCode() : 0);
        result = 31 * result + (s3Path != null ? s3Path.hashCode() : 0);
        result = 31 * result + (webserverPath != null ? webserverPath.hashCode() : 0);
        result = 31 * result + (pathHash != null ? pathHash.hashCode() : 0);
        result = 31 * result + (proxied != null ? proxied.hashCode() : 0);
        result = 31 * result + (ownerid != null ? ownerid.hashCode() : 0);
        result = 31 * result + (configurationname != null ? configurationname.hashCode() : 0);
        result = 31 * result + (parentid != null ? parentid.hashCode() : 0);
        result = 31 * result + (thumbnail != null ? thumbnail.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(smalldata);
        result = 31 * result + (cfpath != null ? cfpath.hashCode() : 0);
        return result;
    }
}
