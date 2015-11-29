package com.bs.action;

import com.bs.base.BaseAction;
import com.bs.domain.Warehouse;
import com.bs.util.PageBean;
import com.bs.util.QueryHelper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

@SuppressWarnings("serial")
@Controller
@Scope("prototype")
public class WarehouseAction extends BaseAction<Warehouse> {

	private int pageNum = 1;
	private int pageSize = 10;

	// ==========列表=====================
	public String list() throws Exception {
		QueryHelper queryHelper = new QueryHelper(Warehouse.class, "wa")
				.addOrderByProperty("id", true);
		PageBean pageBean = warehouseService.getPageBean(pageNum, pageSize,
				queryHelper);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "list";
	}

	// ==========删除=====================
	public String delete() throws Exception {
		warehouseService.delete(model.getId());
		return "toList";
	}

	// ==========添加页面=====================
	public String addUI() throws Exception {
		return "saveUI";
	}

	// ==========添加=====================
	public String add() throws Exception {
		warehouseService.save(model);
		return "toList";
	}

	// ==========修改页面=====================
	public String editUI() throws Exception {
		Warehouse warehouse = warehouseService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(warehouse);
		return "saveUI";
	}

	// ==========修改=====================
	public String edit() throws Exception {
		Warehouse warehouse = warehouseService.getById(model.getId());

		warehouse.setName(model.getName());
		warehouse.setAddress(model.getAddress());
		warehouse.setDescription(model.getDescription());

		warehouseService.update(warehouse);
		return "toList";
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

}
