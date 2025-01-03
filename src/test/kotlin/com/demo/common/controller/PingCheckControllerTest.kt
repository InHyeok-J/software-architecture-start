package com.demo.common.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@SpringBootTest
@AutoConfigureMockMvc
class PingCheckControllerTest(
    @Autowired private val mockMvc: MockMvc,
) {
    @Test
    fun `Ping요청시응답을_받을_수_있다`() {
        // given
        // when
        // then
        mockMvc.perform(get("/ping"))
            .andExpect(status().isOk)
            .andExpect(content().string("pong"))
    }
}
