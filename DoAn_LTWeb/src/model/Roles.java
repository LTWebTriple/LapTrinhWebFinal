package model;

public class Roles {
	private String RoleId;
	private String RoleName;

	public Roles() {
	}

	public Roles(String RoleId, String RoleName) {
		this.RoleId = RoleId;
		this.RoleName = RoleName;
	}

	public String getRoleId() {
		return RoleId;
	}

	public void setRoleId(String RoleId) {
		this.RoleId = RoleId;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String RoleName) {
		this.RoleName = RoleName;
	}
}
