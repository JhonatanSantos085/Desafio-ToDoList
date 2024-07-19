package jhon.todo.demo.service;

import jhon.todo.demo.entity.Todo;
import jhon.todo.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return null;

    }
    public List<Todo> list(){
        return null;
    }
    public List<Todo> update(){
        return null;
    }
    public List<Todo> delet(){
        return null;
    }
}
