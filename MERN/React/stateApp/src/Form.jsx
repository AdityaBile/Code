import React, { useState } from "react";

const Form = () => {
  let [formData, setFormData] = useState({
    fullname: "",
    username: "",
    password: "",
  });

  let handleInputChange = (event) => {
    setFormData((currData) => {
      // event.target.name =>  input field
      // event.target.value =>  new value of the input field
      return { ...currData, [event.target.name]: event.target.value };
    });
  };

  let submitHandler = (event) => {
    event.preventDefault();
    console.log(formData);
    setFormData({
      fullname: "",
      username: "",
      password: "",
    });
  };

  return (
    <>
      <form onSubmit={submitHandler}>
        {/* *---------------- */}
        <label htmlFor="fullname">Full Name :</label> &nbsp; &nbsp;
        <input
          id="fullname" // "id" -> "htmlFor' same
          name="fullname" // "name" -> "form data key" (useState key)
          value={formData.fullname}
          onChange={handleInputChange}
          type="text"
          placeholder="Full Name"
        />
        <br />
        <br />
        {/* *---------------- */}
        <label htmlFor="username">Username :</label> &nbsp; &nbsp;
        <input
          id="username"
          name="username"
          value={formData.username}
          onChange={handleInputChange}
          type="text"
          placeholder="Username"
        />
        <br />
        <br />
        {/* *---------------- */}
        <label htmlFor="password">Password :</label> &nbsp; &nbsp;
        <input
          id="password"
          name="password"
          value={formData.password}
          onChange={handleInputChange}
          type="password"
          placeholder="Password"
        />
        <br />
        <br />
        {/* *---------------- */}
        <button>Submit</button>
      </form>
    </>
  );
};

export default Form;

/*
import React, { useState } from "react";

const Form = () => {
  let [fullName, setFullName] = useState("");
  let handleNameChange = (event) => {
    setFullName(event.target.value);
    console.log(event.target.value);
  };
  return (
    <>
      <form>
        <label htmlFor="name">Your Full Name:</label>
        <input
          id="name"
          value={fullName}
          onChange={handleNameChange}
          type="text"
          placeholder="Full Name"
        />
        <button>Submit</button>
      </form>
    </>
  );
};

export default Form;
*/
