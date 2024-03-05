import React from "react";
import {firstName, lastName} from "./App";

const ComC = () => {
    return(
        <>
            <firstName.Consumer>
                {(fName)=>{
                    return(
                        <>
                            <lastName.Consumer>
                                {(lName) =>{
                                    return<h1>Hello I am working on {fName} {lName}</h1>    
                                }}
                            </lastName.Consumer>                                    
                        </>
                    )
                }}
            </firstName.Consumer>
        </>
    )
}

export default ComC;