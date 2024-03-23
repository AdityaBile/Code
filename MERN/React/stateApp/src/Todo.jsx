import React, { useState } from "react";
import { v4 as uuidv4 } from "uuid";

const Todo = () => {
  // let [todo, setTodo] = useState(["Task 1"]);
  let [todo, setTodo] = useState([
    { task: "Task 1", id: uuidv4(), isDone: false },
  ]);
  let [input, setInput] = useState("");

  // Passing input value
  let updateInput = (event) => {
    setInput(event.target.value);
  };

  // Change in list by adding new task
  let updateTask = () => {
    setTodo((prevValue) => {
      return [...prevValue, { task: input, id: uuidv4(), isDone: false }];
    });
    setInput("");
  };

  // Delete task
  let deleteTask = (id) => {
    setTodo((todos) => todos.filter((delTask) => delTask.id != id));
  };

  // Update All -> UpperCase
  let updateAll = () => {
    setTodo((todos) =>
      todos.map((todo) => {
        return { ...todo, task: todo.task.toUpperCase() };
        // task is object which we are updating so "{ }"
      })
    );
  };

  //Update One
  let updateOne = (id) => {
    setTodo((todos) =>
      todos.map((todo) => {
        if (todo.id === id) {
          return { ...todo, task: todo.task.toUpperCase() };
        } else {
          return todo;
        }
      })
    );
  };

  // Mark as done
  let markDone = (id) => {
    setTodo((todos) =>
      todos.map((todo) => {
        if (todo.id === id) {
          return { ...todo, isDone: true };
        } else {
          return todo;
        }
      })
    );
  };

  return (
    <>
      <input
        value={input}
        onChange={updateInput}
        placeholder="Add Task"
        style={{ padding: "10px" }}
      ></input>
      <button onClick={updateTask}>Add</button>
      <br></br>
      <hr></hr>
      <h4>All Tasks</h4>
      <ul>
        {todo.map((todo) => (
          <li key={todo.id}>
            <button onClick={() => markDone(todo.id)}>Mark Done</button>
            &nbsp; &nbsp;
            <span
              style={todo.isDone ? { textDecorationLine: "line-through" } : {}}
            >
              {todo.task}
            </span>
            &nbsp; &nbsp; &nbsp;
            {/* updateTask(todo.id)  // This will execute function, we dont want
            () => updateTask(todo.id) // that so we pass it like this  */}
            <button onClick={() => deleteTask(todo.id)}>Delete</button>
            &nbsp; &nbsp;
            {/* "() => call-fun(parameter)"" // any parameter to pass function 
            else simply function name "call-funName" */}
            <button onClick={() => updateOne(todo.id)}>Update</button>
          </li>
        ))}
      </ul>
      <br />
      <button onClick={updateAll}>Update All</button>
    </>
  );
};

export default Todo;
