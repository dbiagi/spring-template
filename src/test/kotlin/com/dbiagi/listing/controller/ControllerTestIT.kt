package com.dbiagi.listing.controller

import com.dbiagi.listing.ApplicationTest
import org.springframework.test.web.reactive.server.WebTestClient
import java.util.*

class ControllerTestIT(webTestClient: WebTestClient) : ApplicationTest({

    test("given a random UUID should return 404 when searching") {
        val uuid = UUID.randomUUID().toString()

        webTestClient
            .get().uri("/listings/$uuid")
            .exchange()
            .expectStatus()
            .isNotFound
    }
})
