package com.example.cleanarchitecture.domain

interface ShopListRepository {

    fun getItemList():List<ShopItem>

    fun getItemOnList(id: Int): ShopItem

    fun editItemInList(shopItem: ShopItem)

    fun deleteItemFromShopList(shopItem: ShopItem)

    fun addItemInList(Item: ShopItem)
}