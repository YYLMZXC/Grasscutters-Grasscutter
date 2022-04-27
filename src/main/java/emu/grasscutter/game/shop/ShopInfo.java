package emu.grasscutter.game.shop;

import emu.grasscutter.data.common.ItemParamData;

import java.util.ArrayList;
import java.util.List;

public class ShopInfo {
    public int shopId = 1004;
    public int goodsId = 0;
    public ItemParamData goodsItem;
    public int scoin = 0;
    public List<ItemParamData> costItemList;
    public int boughtNum = 0;
    public int buyLimit = 0;
    public int beginTime = 0;
    public int endTime = 1924992000;
    public int nextRefreshTime = 1924992000;
    public int minLevel = 0;
    public int maxLevel = 61;
    public List<Integer> preGoodsIdList = new ArrayList<>();
    public int mcoin = 0;
    public int hcoin = 0;
    public int disableType = 0;
    public int secondarySheetId = 0;

    public int getHcoin() {
        return hcoin;
    }

    public void setHcoin(int hcoin) {
        this.hcoin = hcoin;
    }

    public List<Integer> getPreGoodsIdList() {
        return preGoodsIdList;
    }

    public void setPreGoodsIdList(List<Integer> preGoodsIdList) {
        this.preGoodsIdList = preGoodsIdList;
    }

    public int getMcoin() {
        return mcoin;
    }

    public void setMcoin(int mcoin) {
        this.mcoin = mcoin;
    }

    public int getDisableType() {
        return disableType;
    }

    public void setDisableType(int disableType) {
        this.disableType = disableType;
    }

    public int getSecondarySheetId() {
        return secondarySheetId;
    }

    public void setSecondarySheetId(int secondarySheetId) {
        this.secondarySheetId = secondarySheetId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public ItemParamData getGoodsItem() {
        return goodsItem;
    }

    public void setGoodsItem(ItemParamData goodsItem) {
        this.goodsItem = goodsItem;
    }

    public int getScoin() {
        return scoin;
    }

    public void setScoin(int scoin) {
        this.scoin = scoin;
    }

    public List<ItemParamData> getCostItemList() {
        return costItemList;
    }

    public void setCostItemList(List<ItemParamData> costItemList) {
        this.costItemList = costItemList;
    }

    public int getBoughtNum() {
        return boughtNum;
    }

    public void setBoughtNum(int boughtNum) {
        this.boughtNum = boughtNum;
    }

    public int getBuyLimit() {
        return buyLimit;
    }

    public void setBuyLimit(int buyLimit) {
        this.buyLimit = buyLimit;
    }

    public int getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(int beginTime) {
        this.beginTime = beginTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getNextRefreshTime() {
        return nextRefreshTime;
    }

    public void setNextRefreshTime(int nextRefreshTime) {
        this.nextRefreshTime = nextRefreshTime;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }
}
