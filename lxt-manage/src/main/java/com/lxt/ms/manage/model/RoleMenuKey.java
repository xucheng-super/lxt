package com.lxt.ms.manage.model;

public class RoleMenuKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role_menu.MENU_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_role_menu.ROLE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    private String roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role_menu.MENU_ID
     *
     * @return the value of lxt_role_menu.MENU_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role_menu.MENU_ID
     *
     * @param menuId the value for lxt_role_menu.MENU_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_role_menu.ROLE_ID
     *
     * @return the value of lxt_role_menu.ROLE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_role_menu.ROLE_ID
     *
     * @param roleId the value for lxt_role_menu.ROLE_ID
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }
}