import React, { useContext } from "react";
// import ComC from "./ComC"
import {firstName, lastName} from "./App";


const ComB = () => {
    const fName = useContext(firstName);
    const lName = useContext(lastName);

    return(
        <h1>Hey!!! I am working on {fName} {lName}</h1>
    )
}

export default ComB;



// const ComB = () => {
//     return(
//         <ComC/>
//     )
// }

// export default ComB;