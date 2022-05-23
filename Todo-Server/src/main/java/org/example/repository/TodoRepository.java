package org.example.repository;

import org.example.model.TodoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository<데이터베이스와 연결될 객체, 해당 객체의 id의 필드 타입>
@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Long> {

}
