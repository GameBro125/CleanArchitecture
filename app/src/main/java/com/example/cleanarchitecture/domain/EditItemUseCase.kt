package com.example.cleanarchitecture.domain

class EditItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editItemInList(shopItem: ShopItem) {
        shopListRepository.editItemInList(shopItem)
    }
}