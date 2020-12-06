package cn.image.entity;

import java.util.List;

public class OrgUserVo {
    private Organ organ;
    private Role role;
    private User user;
    private List<Menu> menuList;

    public OrgUserVo(){}

    public OrgUserVo(Organ organ, Role role, User user, List<Menu> menuList) {
        this.organ = organ;
        this.role = role;
        this.user = user;
        this.menuList = menuList;
    }

    public Organ getOrgan() {
        return organ;
    }

    public void setOrgan(Organ organ) {
        this.organ = organ;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
