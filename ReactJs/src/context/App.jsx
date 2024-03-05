import React, { createContext } from "react";
import ComA from "./ComA";

const firstName = createContext();
const lastName = createContext();

const App = () => {
    return(
        <>
            <firstName.Provider value={"react"}>
                <lastName.Provider value={"project"}>
                    <ComA/>
                </lastName.Provider>
            </firstName.Provider>
        </>
    )
}

export default App;
export {firstName, lastName};