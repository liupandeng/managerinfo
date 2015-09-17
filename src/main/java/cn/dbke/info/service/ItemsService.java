package cn.dbke.info.service;

import cn.dbke.info.domain.ItemsCustom;
import cn.dbke.info.domain.ItemsQueryVo;

import java.util.List;

/**
 * Created by lpd on 2015/9/10.
 */
public interface ItemsService {
    //根据物品名称模糊查询
    public List<ItemsCustom> findItemsByname(ItemsQueryVo itemsQueryVo)throws Exception;
}

