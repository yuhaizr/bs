package com.bs.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.bs.domain.User;
import com.bs.service.CategoryService;
import com.bs.service.ConsumerService;
import com.bs.service.DepartmentService;
import com.bs.service.MaterialsService;
import com.bs.service.PositionService;
import com.bs.service.PrivilegeService;
import com.bs.service.RoleService;
import com.bs.service.SupplierService;
import com.bs.service.SystemLogService;
import com.bs.service.SystemNoticeService;
import com.bs.service.UnitService;
import com.bs.service.UserService;
import com.bs.service.WarehouseService;
import com.bs.service.XsOrderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 提供modelDriven支持和service的公用
 * 
 * @author gateway
 * 
 * @param <T>
 */
@SuppressWarnings("serial")
public abstract class BaseAction<T> extends ActionSupport implements
		ModelDriven<T> {

	// ------------ModelDriven的支持--------------
	protected T model;

	protected Class<T> modelClass;

	@SuppressWarnings("unchecked")
	public BaseAction() {

		try {
			// 通过反射获取model的真实类型
			ParameterizedType pt = (ParameterizedType) this.getClass()
					.getGenericSuperclass();
			modelClass = (Class<T>) pt.getActualTypeArguments()[0];
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public T getModel() {

		try {
			if (model == null) {
				// 通过反射创建model的实例
				model = modelClass.newInstance();
			}
			return model;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * 获取当前登录用户
	 */
	public static User getCurrentUser() {
		return (User) ActionContext.getContext().getSession().get("user");
	}

	// -----------所有service的实例声明---------------

	@Resource
	protected DepartmentService departmentService;
	@Resource
	protected RoleService roleService;
	@Resource
	protected UserService userService;
	@Resource
	protected PrivilegeService privilegeService;
	@Resource
	protected SystemLogService systemLogService;
	@Resource
	protected ConsumerService consumerService;
	@Resource
	protected SupplierService supplierService;
	@Resource
	protected WarehouseService warehouseService;
	@Resource
	protected PositionService positionService;
	@Resource
	protected CategoryService categoryService;
	@Resource
	protected UnitService unitService;
	@Resource
	protected MaterialsService materialsService;
	@Resource
	protected SystemNoticeService systemNoticeService;
	@Resource
	protected XsOrderService  xsOrderService;
	
}
