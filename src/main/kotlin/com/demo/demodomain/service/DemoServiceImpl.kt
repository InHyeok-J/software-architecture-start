package com.demo.demodomain.service

import com.demo.demodomain.controller.port.DemoService

class DemoServiceImpl : DemoService {

    override fun getHello(): String = "Hello World"
}
