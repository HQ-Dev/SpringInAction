package com.archy.spittr.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by huang on 2016/11/23.
 */
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
        MockMvc mockMvc = standaloneSetup(controller).build();   // 搭建 MockMvc

        mockMvc.perform(get("/"))
                .andExpect(view().name("home"));  // 对 "/" 执行 GET 请求，  预期得到 home 视图
//
//        mockMvc.perform(get("/homepage"))
//                .andExpect(view().name("home"));
    }
}
