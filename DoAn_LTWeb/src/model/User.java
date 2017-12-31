package model;

public class User {
	String UserId, UserName, FullName, Pass, Birth, CMND, Tel, RoleId;
	byte[] Avatar =  new byte[4000];
	String AvatarPath;
	String RoleName, SubjectName;
	
	public User(String UserId, String FullName, String Pass, String Birth, String CMND, String Tel, String RoleId, byte[] Avatar) {
		this.UserId = UserId;
		this.FullName = FullName;
		this.Pass = Pass;
		this.Birth = Birth;
		this.CMND = CMND;		
		this.Tel = Tel;
		this.RoleId = RoleId;
		this.Avatar = Avatar;
		
	}
	
	public User(String UserId,String UserName, String FullName, String Pass, String Birth, String CMND, String Tel, String RoleName) {
		this.UserId = UserId;
		this.UserName = UserName;
		this.FullName = FullName;
		this.Pass = Pass;
		this.Birth = Birth;
		this.CMND = CMND;		
		this.Tel = Tel;
		this.RoleName = RoleName;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String UserId) {
		this.UserId = UserId;
	}
	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String UserName) {
		this.UserName = UserName;
	}

	public String getName() {
		return FullName;
	}

	public void setName(String FullName) {
		this.FullName = FullName;
	}

	public String getPass() {
		return Pass;
	}

	public void setPass(String Pass) {
		this.Pass = Pass;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String Tel) {
		this.Tel = Tel;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String CMND) {
		this.CMND = CMND;
	}

	public String getBirth() {
		return Birth;
	}

	public void setBirth(String Birth) {
		this.Birth = Birth;
	}

	public String getRoleId() {
		return RoleId;
	}

	public void setRoleId(String RoleId) {
		this.RoleId = RoleId;
	}

	public byte[] getAvatar() {
		return Avatar;
	}

	public void setAvatar(byte[] Avatar) {
		this.Avatar = Avatar;
	}
	
	public String getAvatarPath() {
		return AvatarPath;
	}

	public void setAvatarPath(String avatarPath) {
		AvatarPath = avatarPath;
	}
	
	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String RoleName) {
		this.RoleName = RoleName;
	}
	
	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String SubjectName) {
		this.SubjectName = SubjectName;
	}
}
