package cn.image.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 组织机构表
 * @author zhenglei
 *
 */
public class Organ implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String SEQ_ID = "SEQ_ORGAN";// 常量名称不变 value都是以 ”SEQ_“开头
	
	public static final String USER_ORGAN = "USER_ORGAN";// 对户对应的机构
	private String id;

	private String code; //编号   这个才是业务编号，实体都关联这个编号

	private String incode;  //内部编号    只是用来调整顺序和数据显示用的

	private String parentCode;  //上级内部编号

	private String name;  //名称

	private String nameEn;  //英文名称

	private String nameTw;  //繁体名称

	private String shortName;  //简称

	private Date formingDate;  //成立时间

	private String address;  //地址

	private String operator;  //创建人

	private String remarks;  //备注

	private String headMan;  //负责人

	private Date createDate;  //创建时间

	private String delFlag;  //是否删除    0正常  1删除
	
	//以下不生成数据库字段
	private String parentName;  //上级内部名称

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getIncode() {
		return incode;
	}

	public void setIncode(String incode) {
		this.incode = incode == null ? null : incode.trim();
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode == null ? null : parentCode.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName == null ? null : shortName.trim();
	}

	public Date getFormingDate() {
		return formingDate;
	}

	public void setFormingDate(Date formingDate) {
		this.formingDate = formingDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator == null ? null : operator.trim();
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}

	public String getHeadMan() {
		return headMan;
	}

	public void setHeadMan(String headMan) {
		this.headMan = headMan == null ? null : headMan.trim();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag == null ? null : delFlag.trim();
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameTw() {
		return nameTw;
	}

	public void setNameTw(String nameTw) {
		this.nameTw = nameTw;
	}
}