package cn.weisoft.shirostudy.bean;

public class Permissions {
    private String id;

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }

    private String permissionsName;


    public Permissions(String id, String permissionsName) {
        this.id = id;
        this.permissionsName = permissionsName;
    }

}