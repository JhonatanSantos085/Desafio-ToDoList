package jhon.todo.demo;

import jhon.todo.demo.entity.Todo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class DesafioTodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;


	@Test
	void testCreateSuccess(){
		var todo = new Todo("todo 1", "desc todo 1", false, 1);
	}

	@Test
	void testCreateFailure(){

	}

}
