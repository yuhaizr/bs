package com.bs.action;

import java.util.List;

import com.bs.base.BaseAction;
import com.bs.domain.Department;
import com.bs.domain.Role;
import com.bs.domain.User;
import com.bs.util.DepartmentUtils;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {

	private int pageNum = 1;
	private int pageSize = 9;
	private Long departmentId;
	private Long[] roleIds;
	private String condition;
	private String content;
	private Object data;
	private String loginNames;

	// =============搜索===================
	public String search() throws Exception {

		QueryHelper queryHelper = new QueryHelper(User.class, "u")
				.addOrderByProperty("u.id", true);
		if (condition.equals("loginName") && !content.equals("")) {
			queryHelper.addWhereCondition("u.loginName like ?",
					"%" + content.trim() + "%");
			PageBean pageBean = userService.getPageBean(pageNum, pageSize,
					queryHelper);
			ActionContext.getContext().getValueStack().push(pageBean);
		}
		if (condition.equals("name") && !content.equals("")) {
			queryHelper.addWhereCondition("u.name like ?", "%" + content.trim()
					+ "%");
			PageBean pageBean = userService.getPageBean(pageNum, pageSize,
					queryHelper);
			ActionContext.getContext().getValueStack().push(pageBean);
		}
		if (condition.equals("departmentName") && !content.equals("")) {
			queryHelper.addWhereCondition("u.department.name like ?", "%"
					+ content.trim() + "%");
			PageBean pageBean = userService.getPageBean(pageNum, pageSize,
					queryHelper);
			ActionContext.getContext().getValueStack().push(pageBean);
		}
		if (content.trim().equals("") || condition.equals("")) {
			PageBean pageBean = userService.getPageBean(pageNum, pageSize,
					queryHelper);
			ActionContext.getContext().getValueStack().push(pageBean);
		}
		return "search";

	}

	// ==========列表=====================
	public String list() throws Exception {

		QueryHelper queryHelper = new QueryHelper(User.class, "u")
				.addOrderByProperty("u.id", true);
		PageBean pageBean = userService.getPageBean(pageNum, pageSize,
				queryHelper);
		ActionContext.getContext().getValueStack().push(pageBean);

		return "list";
	}

	// ==========删除=====================
	public String delete() throws Exception {
		userService.delete(model.getId());
		return "toList";
	}

	// ==========添加页面=====================
	public String addUI() throws Exception {
		// 准备部门列表:部门列表，应显示为树状结构
		List<Department> topList = departmentService.findTopList();
		List<Department> departmentList = DepartmentUtils
				.getAllDepartmentList(topList);
		ActionContext.getContext().put("departmentList", departmentList);

		// 准备岗位列表
		List<Role> roleList = roleService.findAll();
		ActionContext.getContext().put("roleList", roleList);
		return "saveUI";
	}

	// 校验登录名是否可用
	public String checkLoginName() throws Exception {
		System.out.println(loginNames);

		User user = userService.findByLoginName(loginNames);
		System.out.println(user.getName());
		if (!user.equals(null)) {
			data = "no";
		}
		return "json";
	}

	// ==========添加=====================
	public String add() throws Exception {
		// 1.新建对象并设置属性
		model.setDepartment(departmentService.getById(departmentId));
		model.setRoles(roleService.getByIds(roleIds));
		// 2.保存
		userService.save(model);
		return "toList";
	}

	// ==========修改页面=====================
	public String editUI() throws Exception {
		// 准备部门列表:部门列表，应显示为树状结构
		List<Department> topList = departmentService.findTopList();
		List<Department> departmentList = DepartmentUtils
				.getAllDepartmentList(topList);
		ActionContext.getContext().put("departmentList", departmentList);

		// 准备岗位列表
		List<Role> roleList = roleService.findAll();
		ActionContext.getContext().put("roleList", roleList);

		// 准备回显的数据
		User user = userService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(user);
		if (user.getDepartment() != null) {
			departmentId = user.getDepartment().getId();
		}
		if (user.getRoles() != null) {
			roleIds = new Long[user.getRoles().size()];
			int index = 0;
			for (Role role : user.getRoles()) {
				roleIds[index++] = role.getId();
			}
		}

		return "saveUI";
	}

	// ==========修改=====================
	public String edit() throws Exception {
		// 1.获取原对象
		User user = userService.getById(model.getId());
		// 2.设置要修改的属性
		user.setName(model.getName());
		user.setLoginName(model.getLoginName());
		user.setSex(model.getSex());
		user.setBirthday(model.getBirthday());
		user.setEmail(model.getEmail());
		user.setPhoneNumber(model.getPhoneNumber());
		user.setAddress(model.getAddress());
		user.setDescription(model.getDescription());

		user.setDepartment(departmentService.getById(departmentId));
		user.setRoles(roleService.getByIds(roleIds));
		// 3.更新到数据库
		userService.update(user);
		return "toList";
	}

	// ==========初始化密码==================================
	public String initPassword() throws Exception {
		userService.initPassword(model.getId());
		return "toList";
	}

	// ========setter and getter method====================
	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long[] getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(Long[] roleIds) {
		this.roleIds = roleIds;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getLoginNames() {
		return loginNames;
	}

	public void setLoginNames(String loginNames) {
		this.loginNames = loginNames;
	}

}
