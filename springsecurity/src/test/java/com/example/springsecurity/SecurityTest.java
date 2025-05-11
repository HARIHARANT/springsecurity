/*package com.example.springsecurity;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SecurityTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @WithMockUser(username = "user", roles = {"USER"})
  public void accessSecuredResourceWithUserRole() throws Exception {
    mockMvc.perform(get("/user/dashboard"))
      .andExpect(status().isOk());
  }

  @Test
  @WithMockUser(username = "user", roles = {"USER"})
  public void accessSecuredResourceWithUnauthorizedRole() throws Exception {
    mockMvc.perform(get("/admin/dashboard"))
      .andExpect(status().isForbidden());
  }
}
*/