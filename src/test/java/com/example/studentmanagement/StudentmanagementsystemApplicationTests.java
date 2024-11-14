package com.example.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("local") // Use "azure" when deploying to Azure, "local" for local development
class StudentmanagementsystemApplicationTests {

	@Test
	void contextLoads() {
		// This test will check if the application context loads successfully
	}
}
