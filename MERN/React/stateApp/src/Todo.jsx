import React, { useState } from "react";

const Todo = () => {
  let [todo, setTodo] = useState(["Task 1"]);
  let [input, setInput] = useState("");

  // Passing input value
  let updateInput = (event) => {
    setInput(event.target.value);
  };

  // Change in list by adding new task
  let updateTask = () => {
    setTodo([...todo, input]);
    setInput("");
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
        {todo.map((task, index) => (
          <li key={index}>{task}</li>
        ))}
      </ul>
    </>
  );
};

export default Todo;
