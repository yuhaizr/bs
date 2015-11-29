package com.bs.util;

import javax.annotation.Resource;

import com.bs.domain.Privilege;
import com.bs.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

/**
 * 安装时的初始化操作，只能在安装时做一次
 * 
 * @author gateway
 * 
 */
@Component
public class Installer {

	@Resource
	private SessionFactory sessionFactory;

	@Transactional
	public void install() {
		Session session = sessionFactory.getCurrentSession();

		// 插入一个超级管理员用户
		User user = new User();
		user.setLoginName("admin");
		user.setName("超级管理员");
		user.setPassword(DigestUtils.md5DigestAsHex("admin".getBytes()));// 密码为"admin"的md5的摘要
		session.save(user);

		Privilege menu, menu1, menu2, menu3, menu4, menu5, menu6, menu7, menu8, menu9, menu10;

		// ======================采购管理============================================
		menu = new Privilege("采购管理", null, "1", null);
		menu1=new Privilege("采购计划", "cgPlanAction_list", "2", menu);
		menu2=new Privilege("采购订单","cgOrderAction_list", "2", menu);
		menu3=new Privilege("采购运输计划", "cgTransPlanAction_list", "2", menu);
	
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		//采购计划
		session.save(new Privilege("采购计划列表", "cgPlanAction_list", "2", menu1));
		session.save(new Privilege("采购计划添加", "cgPlanAction_add", "2", menu1));
		session.save(new Privilege("采购计划修改", "cgPlanAction_edit", "2", menu1));
		session.save(new Privilege("采购计划删除", "cgPlanAction_delete", "2", menu1));
		session.save(new Privilege("采购计划审核", "cgPlanAction_sh", "2", menu1));
		//采购订单
		session.save(new Privilege("采购订单列表", "cgOrderAction_list", "2", menu2));
		session.save(new Privilege("采购订单添加", "cgOrderAction_add", "2", menu2));
		session.save(new Privilege("采购订单修改", "cgOrderAction_edit", "2", menu2));
		session.save(new Privilege("采购订单删除", "cgOrderAction_delete", "2", menu2));
		session.save(new Privilege("采购订单审核", "cgOrderAction_sh", "2", menu2));
		//采购运输计划
		session.save(new Privilege("采购运输计划列表", "cgTransPlanAction_list", "2", menu3));
		session.save(new Privilege("采购运输计划添加", "cgTransPlanAction_add", "2", menu3));
		session.save(new Privilege("采购运输计划修改", "cgTransPlanAction_edit", "2", menu3));
		session.save(new Privilege("采购运输计划删除", "cgTransPlanAction_delete", "2", menu3));
		session.save(new Privilege("采购运输计划审核", "cgTransPlanAction_sh", "2", menu3));

		// ======================销售管理============================================
		menu = new Privilege("销售管理", null, "1", null);
		session.save(menu);
		menu1=new Privilege("销售计划", "xsPlanAction_list", "2", menu);
		menu2=new Privilege("销售订单","xsOrderAction_list", "2", menu);
		menu3=new Privilege("销售运输计划", "xsTransPlanAction_list", "2", menu);
	
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
	
		//采购计划
		session.save(new Privilege("销售计划列表", "xsPlanAction_list", "2", menu1));
		session.save(new Privilege("销售计划添加", "xsPlanAction_add", "2", menu1));
		session.save(new Privilege("销售计划修改", "xsPlanAction_edit", "2", menu1));
		session.save(new Privilege("销售计划删除", "xsPlanAction_delete", "2", menu1));
		session.save(new Privilege("销售计划审核", "xsPlanAction_sh", "2", menu1));
		//采购订单
		session.save(new Privilege("销售订单列表", "xsOrderAction_list", "2", menu2));
		session.save(new Privilege("销售订单添加", "xsOrderAction_add", "2", menu2));
		session.save(new Privilege("销售订单修改", "xsOrderAction_edit", "2", menu2));
		session.save(new Privilege("销售订单删除", "xsOrderAction_delete", "2", menu2));
		session.save(new Privilege("销售订单审核", "xsOrderAction_sh", "2", menu2));
		//采购运输计划
		session.save(new Privilege("销售运输计划列表", "xsTransPlanAction_list", "2", menu3));
		session.save(new Privilege("销售运输计划添加", "xsTransPlanAction_add", "2", menu3));
		session.save(new Privilege("销售运输计划修改", "xsTransPlanAction_edit", "2", menu3));
		session.save(new Privilege("销售运输计划删除", "xsTransPlanAction_delete", "2", menu3));
		session.save(new Privilege("销售运输计划审核", "xsTransPlanAction_sh", "2", menu3));


		// ======================库存管理============================================
		menu = new Privilege("库存管理", null, "1", null);
		session.save(menu);
		menu1=new Privilege("库存管理", "kcAction_list", "2", menu);
		menu2=new Privilege("入库管理","rkAction_list", "2", menu);
		menu3=new Privilege("出库管理", "ckAction_list", "2", menu);
		menu4=new Privilege("盘点管理", "pdAction_list", "2", menu);
		menu5=new Privilege("调拨管理", "dbAction_list", "2", menu);
		// ======================报表查询============================================
		menu = new Privilege("报表查询", null, "1", null);
		session.save(menu);

		
		// ==================系统维护=============================================
		menu = new Privilege("系统维护", null, "1", null);
		menu1 = new Privilege("个人信息", "personAction_list", "2",
				menu);
		menu2 = new Privilege("密码修改", "passwordAction_list", "2", menu);
		menu3 = new Privilege("系统通知", "systemNoticeAction_list", "2",
				menu);
		menu4 = new Privilege("系统日志", "systemlogAction_list", "2",
				menu);
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		session.save(menu4);

		// 个人信息
		session.save(new Privilege("个人信息列表", "personAction_list", null, menu1));
		session.save(new Privilege("个人信息修改", "personAction_edit", null, menu1));

		// 密码修改
		session.save(new Privilege("密码修改", "passwordAction_edit", null, menu2));

		// =======================基础资料========================================
		// 插入权限数据
		menu = new Privilege("基础资料", null, "1", null);
		menu1 = new Privilege("岗位", "roleAction_list", "2", menu);
		menu2 = new Privilege("部门", "departmentAction_list",
				"fa fa-institution", menu);
		menu3 = new Privilege("用户", "userAction_list", "2", menu);
		menu4 = new Privilege("供应商", "supplierAction_list", "2", menu);
		menu5 = new Privilege("客户", "consumerAction_list", "2",menu);
		menu6 = new Privilege("仓库", "warehouseAction_list","2", menu);
		menu7 = new Privilege("仓位", "positionAction_list","2", menu);
		menu8 = new Privilege("物料类别", "categoryAction_list", "2", menu);
		menu9 = new Privilege("计量单位", "unitAction_list", "2", menu);
		menu10 = new Privilege("物料", "materialsAction_list", "2", menu);
		session.save(menu);
		session.save(menu1);
		session.save(menu2);
		session.save(menu3);
		session.save(menu4);
		session.save(menu5);
		session.save(menu6);
		session.save(menu7);
		session.save(menu8);
		session.save(menu9);
		session.save(menu10);

		// 岗位管理
		session.save(new Privilege("岗位列表", "roleAction_list", null, menu1));
		session.save(new Privilege("岗位添加", "roleAction_add", null, menu1));
		session.save(new Privilege("岗位删除", "roleAction_delete", null, menu1));
		session.save(new Privilege("岗位修改", "roleAction_edit", null, menu1));
		session.save(new Privilege("设置权限", "roleAction_setPrivilege", null,menu1));

		// 部门管理
		session.save(new Privilege("部门列表", "departmentAction_list", null, menu2));
		session.save(new Privilege("部门添加", "departmentAction_add", null, menu2));
		session.save(new Privilege("部门删除", "departmentAction_delete", null,menu2));
		session.save(new Privilege("部门修改", "departmentAction_edit", null, menu2));

		// 用户管理
		session.save(new Privilege("用户列表", "userAction_list", null, menu3));
		session.save(new Privilege("用户添加", "userAction_add", null, menu3));
		session.save(new Privilege("用户删除", "userAction_delete", null, menu3));
		session.save(new Privilege("用户修改", "userAction_edit", null, menu3));
		session.save(new Privilege("初始化密码", "userAction_initPassword", null,menu3));

		// 供应商管理
		session.save(new Privilege("供应商列表", "supplierAction_list", null, menu4));
		session.save(new Privilege("供应商添加", "supplierAction_add", null, menu4));
		session.save(new Privilege("供应商删除", "supplierAction_delete", null,menu4));
		session.save(new Privilege("供应商修改", "supplierAction_edit", null, menu4));

		// 客户管理
		session.save(new Privilege("客户列表", "consumerAction_list", null, menu5));
		session.save(new Privilege("客户添加", "consumerAction_add", null, menu5));
		session.save(new Privilege("客户删除", "consumerAction_delete", null, menu5));
		session.save(new Privilege("客户修改", "consumerAction_edit", null, menu5));

		// 仓库管理
		session.save(new Privilege("仓库列表", "warehouseAction_list", null, menu6));
		session.save(new Privilege("仓库添加", "warehouseAction_add", null, menu6));
		session.save(new Privilege("仓库删除", "warehouseAction_delete", null,menu6));
		session.save(new Privilege("仓库修改", "warehouseAction_edit", null, menu6));

		// 仓位管理
		session.save(new Privilege("仓位列表", "positionAction_list", null, menu7));
		session.save(new Privilege("仓位添加", "positionAction_add", null, menu7));
		session.save(new Privilege("仓位删除", "positionAction_delete", null, menu7));
		session.save(new Privilege("仓位修改", "positionAction_edit", null, menu7));

		// 物料类别管理
		session.save(new Privilege("物料类别列表", "categoryAction_list", null, menu8));
		session.save(new Privilege("物料类别添加", "categoryAction_add", null, menu8));
		session.save(new Privilege("物料类别删除", "categoryAction_delete", null,menu8));
		session.save(new Privilege("物料类别修改", "categoryAction_edit", null, menu8));

		// 计量单位管理
		session.save(new Privilege("计量单位列表", "unitAction_list", null, menu9));
		session.save(new Privilege("计量单位添加", "unitAction_add", null, menu9));
		session.save(new Privilege("计量单位删除", "unitAction_delete", null, menu9));
		session.save(new Privilege("计量单位修改", "unitAction_edit", null, menu9));

		// 物料管理
		session.save(new Privilege("物料列表", "materialsAction_list", null, menu10));
		session.save(new Privilege("物料添加", "materialsAction_add", null, menu10));
		session.save(new Privilege("物料修改", "materialsAction_edit", null, menu10));
		session.save(new Privilege("物料删除", "materialsAction_delete", null,menu10));

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Installer install = (Installer) ac.getBean("installer");
		install.install();
		System.out.println("=======安装成功=========");
	}
}
