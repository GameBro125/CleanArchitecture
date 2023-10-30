package com.example.cleanarchitecture.data

import com.example.cleanarchitecture.domain.ShopItem
import com.example.cleanarchitecture.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl:ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0

    override fun getItemList(): List<ShopItem> {
        return shopList.toMutableList()
    }

    override fun getItemOnList(id: Int): ShopItem {
        return shopList.find {
            it.id == id
        } ?: throw RuntimeException("Element with id:$id does not exist")
    }

    override fun editItemInList(shopItem: ShopItem) {
        shopList[shopItem.id] = shopItem
    }

    override fun deleteItemFromShopList(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun addItemInList(Item: ShopItem) {
        if (Item.id == ShopItem.UNDEFINED_ID) {
            Item.id = autoIncrementId++
        }
        shopList.add(Item)
    }

}