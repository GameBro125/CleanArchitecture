package com.example.cleanarchitecture.domain

class GetItemOnIdUseCase(private val shopListRepository: ShopListRepository) {
    fun getItemOnList(id: Int): ShopItem {
        return shopListRepository.getItemOnList(id)
    }
}