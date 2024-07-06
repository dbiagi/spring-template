package com.dbiagi.listing.client

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.service.annotation.GetExchange
import org.springframework.web.service.annotation.HttpExchange
import reactor.core.publisher.Mono

@HttpExchange("/accounts")
interface AccountClient {
    @GetExchange("/{id}")
    fun getById(@PathVariable("id") id: String): Mono<String>

    @GetExchange
    fun searchPaginated(@RequestParam("page") page: Int): Mono<String>

    @GetExchange("/{accountId}/listings/balance")
    fun getListingBalance(accountId: String): Mono<String>
}
