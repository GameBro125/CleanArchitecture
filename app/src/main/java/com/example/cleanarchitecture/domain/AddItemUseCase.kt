package com.example.cleanarchitecture.domain

class AddItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addItemInList(shopItem: ShopItem) {
        shopListRepository.addItemInList(shopItem)
    }
}