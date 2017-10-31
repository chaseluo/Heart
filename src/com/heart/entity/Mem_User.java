package com.heart.entity;

/**
 * @author 111222
 * 数据库实体 用户表
 */
public class Mem_User {
	private int User_Id;//自增长id
	private String User_Name;//用户用户
	private String User_Pass;//用户密码
	private String User_Paypass;//支付密码
	
	private double User_Money;//用户余额
	private double User_Dong;//冻结金额
	private double User_Show;//需要消费多少才能出款
	private double User_Red;//红包金额
	private int User_Point;//积分
	private int User_Level;//等级积分
	
	private String User_Word;//座右铭（或者关键字等）
	private String User_Regtime;//注册时间
	private String User_Logintime;//登录时间
	private String User_Logintimeold;//上次登录时间
	private String User_Loginip;//登录ip
	private String User_Loginipold;//上次登录ip
	private int User_Phonecheck;//手机是否验证 0未验证 1验证
	private int User_Zipcheck;	//用户身份证验证 0未验证 1验证
	private int User_Emailcheck;//用户邮箱验证 0未验证 1验证
	private String User_Qq;		//用户qq 15位
	private String User_Image;	//用户头像 80位
	
	private int User_Type;		//用户类型 0普通 1代理 2测试 9超级
	private int User_Status;	//用户状态 0正常 1停用
	private String User_Back;//用户返点
	private double User_Dian;//用户返点
	private String User_Power;//用户权限
	public double getUser_Dian() {
		return User_Dian;
	}
	public void setUser_Dian(double user_Dian) {
		User_Dian = user_Dian;
	}
	public String getUser_Power() {
		return User_Power;
	}
	public void setUser_Power(String user_Power) {
		User_Power = user_Power;
	}
	public int getUser_Id() {
		return User_Id;
	}
	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getUser_Pass() {
		return User_Pass;
	}
	public void setUser_Pass(String user_Pass) {
		User_Pass = user_Pass;
	}
	public String getUser_Paypass() {
		return User_Paypass;
	}
	public void setUser_Paypass(String user_Paypass) {
		User_Paypass = user_Paypass;
	}
	public double getUser_Money() {
		return User_Money;
	}
	public void setUser_Money(double user_Money) {
		User_Money = user_Money;
	}
	public double getUser_Dong() {
		return User_Dong;
	}
	public void setUser_Dong(double user_Dong) {
		User_Dong = user_Dong;
	}
	public double getUser_Show() {
		return User_Show;
	}
	public void setUser_Show(double user_Show) {
		User_Show = user_Show;
	}
	public double getUser_Red() {
		return User_Red;
	}
	public void setUser_Red(double user_Red) {
		User_Red = user_Red;
	}
	public int getUser_Point() {
		return User_Point;
	}
	public void setUser_Point(int user_Point) {
		User_Point = user_Point;
	}
	public int getUser_Level() {
		return User_Level;
	}
	public void setUser_Level(int user_Level) {
		User_Level = user_Level;
	}
	public String getUser_Word() {
		return User_Word;
	}
	public void setUser_Word(String user_Word) {
		User_Word = user_Word;
	}
	public String getUser_Regtime() {
		return User_Regtime;
	}
	public void setUser_Regtime(String user_Regtime) {
		User_Regtime = user_Regtime;
	}
	public String getUser_Logintime() {
		return User_Logintime;
	}
	public void setUser_Logintime(String user_Logintime) {
		User_Logintime = user_Logintime;
	}
	public String getUser_Logintimeold() {
		return User_Logintimeold;
	}
	public void setUser_Logintimeold(String user_Logintimeold) {
		User_Logintimeold = user_Logintimeold;
	}
	public String getUser_Loginip() {
		return User_Loginip;
	}
	public void setUser_Loginip(String user_Loginip) {
		User_Loginip = user_Loginip;
	}
	public String getUser_Loginipold() {
		return User_Loginipold;
	}
	public void setUser_Loginipold(String user_Loginipold) {
		User_Loginipold = user_Loginipold;
	}
	public int getUser_Phonecheck() {
		return User_Phonecheck;
	}
	public void setUser_Phonecheck(int user_Phonecheck) {
		User_Phonecheck = user_Phonecheck;
	}
	public int getUser_Zipcheck() {
		return User_Zipcheck;
	}
	public void setUser_Zipcheck(int user_Zipcheck) {
		User_Zipcheck = user_Zipcheck;
	}
	public int getUser_Emailcheck() {
		return User_Emailcheck;
	}
	public void setUser_Emailcheck(int user_Emailcheck) {
		User_Emailcheck = user_Emailcheck;
	}
	public String getUser_Qq() {
		return User_Qq;
	}
	public void setUser_Qq(String user_Qq) {
		User_Qq = user_Qq;
	}
	public String getUser_Image() {
		return User_Image;
	}
	public void setUser_Image(String user_Image) {
		User_Image = user_Image;
	}
	public int getUser_Type() {
		return User_Type;
	}
	public void setUser_Type(int user_Type) {
		User_Type = user_Type;
	}
	public int getUser_Status() {
		return User_Status;
	}
	public void setUser_Status(int user_Status) {
		User_Status = user_Status;
	}
	public String getUser_Back() {
		return User_Back;
	}
	public void setUser_Back(String user_Back) {
		User_Back = user_Back;
	}
}