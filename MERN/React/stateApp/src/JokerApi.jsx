import React, { useState, useEffect } from "react";

const JokerApi = () => {
  const url = "https://official-joke-api.appspot.com/random_joke";

  const [joke, setJoke] = useState({});

  const fetchData = async () => {
    try {
      const res = await fetch(url);
      const data = await res.json();
      console.log(data);
      setJoke({ setup: data.setup, punchline: data.punchline });
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  };

  useEffect(() => {
    fetchData();
  }, []);

  return (
    <>
      <h2>Api-Data</h2>
      <br />
      <br />
      <h4>{joke.setup}</h4>
      <br />
      <h4>{joke.punchline}</h4>
      <br />
      <button onClick={fetchData}>Get Data</button>
    </>
  );
};

export default JokerApi;
