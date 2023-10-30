package com.example.cleanarchitecture.domain

class DeleteItemUseCase(private val shopListRepository: ShopListRepository){

    fun deleteItemFromShopList(shopItem: ShopItem) {
        shopListRepository.deleteItemFromShopList(shopItem)
    }
}