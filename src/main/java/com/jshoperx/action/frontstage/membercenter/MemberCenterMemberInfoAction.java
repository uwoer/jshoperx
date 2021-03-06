package com.jshoperx.action.frontstage.membercenter;


import com.jshoperx.action.backstage.base.DataCollectionTAction;
import com.jshoperx.action.backstage.staticspage.FreeMarkervariable;
import com.jshoperx.action.backstage.utils.BaseTools;
import com.jshoperx.action.backstage.utils.statickey.StaticKey;
import com.jshoperx.entity.MemberT;
import com.jshoperx.service.MemberTService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
@ParentPackage("jshoperx")
@Namespace("")
@InterceptorRefs({  
    @InterceptorRef("defaultStack")  
})
public class MemberCenterMemberInfoAction extends ActionSupport implements  
ServletResponseAware {
	@Resource
	private MemberTService memberTService;
	@Resource
	private DataCollectionTAction dataCollectionTAction;
	private String id;
	private String loginname;
	private String loginpwd;
	private String nick;
	private String realname;
	private String city;
	private String district;
	private String sex;
	private String whichsex;
	private String merrystatus;
	private String birthday;
	private String blood;
	private String constellation;
	private String des;
	private String email;
	private String qq;
	private String weixin;
	private String sinaweibo;
	private String tag;
	private Integer belove;
	private Integer loveother;
	private Integer postingcount;
	private String question;
	private String answer;
	private String memberstate;
	private String headpath;
	private Date createtime;
	private String creatorid;
	private Date updatetime;
	private String mobile;
	private int versiont;
	private String mid;
	private String paypassword;
	private String memberGroupId;
	private String memberGroupName;
	private Integer integration;
	private String telno;
	private File fileupload; // 和JSP中input标记name同名  
    private String imageUrl;  
    private String attachmentUrl;  
    private String fileRealName;  
    private HttpServletResponse response;  
    // Struts2拦截器获得的文件名,命名规则，File的名字+FileName  
    // 如此处为 'fileupload' + 'FileName' = 'fileuploadFileName'  
    private String fileuploadFileName; // 上传来的文件的名字  
	private MemberT bean= new MemberT();
	private String redirecturl;
	private boolean sucflag;


	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Integer getPostingcount() {
		return postingcount;
	}

	public void setPostingcount(Integer postingcount) {
		this.postingcount = postingcount;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}



	public int getVersiont() {
		return versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getPaypassword() {
		return paypassword;
	}

	public void setPaypassword(String paypassword) {
		this.paypassword = paypassword;
	}

	public String getMemberGroupId() {
		return memberGroupId;
	}

	public void setMemberGroupId(String memberGroupId) {
		this.memberGroupId = memberGroupId;
	}

	public String getMemberGroupName() {
		return memberGroupName;
	}

	public void setMemberGroupName(String memberGroupName) {
		this.memberGroupName = memberGroupName;
	}

	public Integer getIntegration() {
		return integration;
	}

	public void setIntegration(Integer integration) {
		this.integration = integration;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getHeadpath() {
		return headpath;
	}

	public void setHeadpath(String headpath) {
		this.headpath = headpath;
	}

	public File getFileupload() {
		return fileupload;
	}

	public void setFileupload(File fileupload) {
		this.fileupload = fileupload;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getAttachmentUrl() {
		return attachmentUrl;
	}

	public void setAttachmentUrl(String attachmentUrl) {
		this.attachmentUrl = attachmentUrl;
	}

	public String getFileRealName() {
		return fileRealName;
	}

	public void setFileRealName(String fileRealName) {
		this.fileRealName = fileRealName;
	}

	public String getRedirecturl() {
		return redirecturl;
	}

	public void setRedirecturl(String redirecturl) {
		this.redirecturl = redirecturl;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public String getFileuploadFileName() {
		return fileuploadFileName;
	}

	public void setFileuploadFileName(String fileuploadFileName) {
		this.fileuploadFileName = fileuploadFileName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getLoginpwd() {
		return loginpwd;
	}

	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getWhichsex() {
		return whichsex;
	}

	public void setWhichsex(String whichsex) {
		this.whichsex = whichsex;
	}

	public String getMerrystatus() {
		return merrystatus;
	}

	public void setMerrystatus(String merrystatus) {
		this.merrystatus = merrystatus;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getConstellation() {
		return constellation;
	}

	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}

	public String getSinaweibo() {
		return sinaweibo;
	}

	public void setSinaweibo(String sinaweibo) {
		this.sinaweibo = sinaweibo;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getBelove() {
		return belove;
	}

	public void setBelove(Integer belove) {
		this.belove = belove;
	}

	public Integer getLoveother() {
		return loveother;
	}

	public void setLoveother(Integer loveother) {
		this.loveother = loveother;
	}

	public String getMemberstate() {
		return memberstate;
	}

	public void setMemberstate(String memberstate) {
		this.memberstate = memberstate;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public MemberT getBean() {
		return bean;
	}

	public void setBean(MemberT bean) {
		this.bean = bean;
	}

	public boolean isSucflag() {
		return sucflag;
	}

	public void setSucflag(boolean sucflag) {
		this.sucflag = sucflag;
	}


	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub

	}

	/**
	 * 清理错误
	 */
	@Override
	public void validate() {
		this.clearErrorsAndMessages(); 
	
	}
	
	/**
	 * 根据用户id获取用户信息
	 * @return
	 */
	@Action(value = "findMemberInfo", results = { 
			@Result(name = "success",type="freemarker",location = "/WEB-INF/theme/default/shop/memberinfo.ftl"),
			@Result(name = "input",type="redirect",location = "/html/default/shop/user/login.html")
	})
	public String findMemberInfo(){
		MemberT memberT=(MemberT)ActionContext.getContext().getSession().get(StaticKey.MEMBER_SESSION_KEY);
		if(memberT!=null){
			dataCollectionTAction.putBaseInfoToContext();
			MemberT m=memberTService.findByPK(MemberT.class, memberT.getId());
			ActionContext.getContext().put(FreeMarkervariable.MEMBERINFO, m);
			return SUCCESS;
		}
		return INPUT;
	}
	
	
	
	/**
	 * 更新用户更新自己的资料
	 * @return
	 */
	@Action(value = "updateMemberforMyInfo", results = { @Result(name = "json",type="json")})
	public String updateMemberforMyInfo(){
		MemberT memberT=(MemberT)ActionContext.getContext().getSession().get(StaticKey.MEMBER_SESSION_KEY);
		if(memberT!=null){
			memberT.setNick(this.getNick().trim());
			memberT.setRealname(this.getRealname().trim());
			memberT.setCity(this.getCity().trim());
			memberT.setDistrict(this.getDistrict().trim());
			memberT.setSex(this.getSex());
			memberT.setWhichsex(this.getWhichsex());
			memberT.setMerrystatus(this.getMerrystatus());
			memberT.setBirthday(this.getBirthday().trim());
			memberT.setBlood(this.getBlood());
			memberT.setConstellation(this.getConstellation());
			memberT.setDes(this.getDes());
			memberT.setEmail(this.getEmail());
			memberT.setQq(this.getQq());
			memberT.setWeixin(this.getWeixin());
			memberT.setSinaweibo(this.getSinaweibo());
			memberT.setUpdatetime(BaseTools.getSystemTime());
			memberT.setMobile(this.getMobile().trim());
			memberT.setVersiont(memberT.getVersiont()+1);
			memberT.setTelno(this.getTelno());
			this.memberTService.update(memberT);
			this.setSucflag(true);
			return "json";
		}else{
			return "json";
		}
	}
	


	/**
	 * 根据用户id获取用户头像
	 * 
	 * @return
	 */
	@Action(value = "findMemberHeadById", results = { @Result(name = "json", type = "json") })
	public String findMemberHeadById() {
		MemberT memberT=(MemberT)ActionContext.getContext().getSession().get(StaticKey.MEMBER_SESSION_KEY);
		bean = this.memberTService.findByPK(MemberT.class,memberT.getId());
		if (bean != null) {
			this.setSucflag(true);
			return "json";
		}
		return "json";
	}
	
	
}
