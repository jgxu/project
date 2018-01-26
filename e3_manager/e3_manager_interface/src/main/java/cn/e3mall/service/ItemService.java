package cn.e3mall.service;

import cn.e3mall.pojo.DatagridResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {
	public TbItem findById(Long itemId);

	public DatagridResult pageQuery(int page, int rows);
}
