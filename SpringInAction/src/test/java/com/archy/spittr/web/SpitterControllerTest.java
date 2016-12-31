package com.archy.spittr.web;

import com.archy.spittr.Spitter;
import com.archy.spittr.data.SpitterRepository;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

/**
  * @ClassName: SpitterControllerTest
  * @Description:
  * @author Archy技术部-huang
  * @date 2016年12月30日 下午10:05:59
 */
public class SpitterControllerTest {

    @Test
    public void shouldShowRegistrationForm() throws Exception {
        SpitterController controller = new SpitterController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/spitter/register"))
                .andExpect(view().name("registerForm"));
    }

    @Test
    public void shouldProcessRegistration() throws Exception {
        SpitterRepository mockRepository = mock(SpitterRepository.class);
        Spitter unsavedSpitter = new Spitter("archy","24hours","Jack","Bauer","archy@163.com");
        Spitter savedSpitter = new Spitter(24L, "archy","24hours","Jack","Bauer","archy@163.com");

        when(mockRepository.save(unsavedSpitter)).thenReturn(savedSpitter);

        SpitterController controller = new SpitterController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(post("/spitter/register")
                .param("firstName", "Jack")
                .param("lastName", "Bauer")
                .param("username", "archy")
                .param("password","24hours")
                .param("email", "archy@163.com")).andExpect(redirectedUrl("/spitter/archy"));

          verify(mockRepository, atLeastOnce()).save(unsavedSpitter);
    }

}