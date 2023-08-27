package com.example.stockmarketapp.data.mapper

import com.example.stockmarketapp.data.local.CompanyListingEntity
import com.example.stockmarketapp.domain.model.CompanyListingModel

fun CompanyListingEntity.toCompanyListingModel() : CompanyListingModel {
    return CompanyListingModel(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListingModel.toCompanyListingModel() : CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}