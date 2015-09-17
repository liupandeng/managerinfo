package cn.dbke.info.domain;

/**
 * Created by lpd on 2015/9/11.
 * 包装查询条件(物品包装对象)
 */
public class ItemsQueryVo {
    private Items items;
    private ItemsCustom itemsCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
