import React from "react";
import { Switch, Route } from 'react-router-dom';
import About1 from "./About1";
import Contact1 from "./Contact1";
import Error from "./Error"

const App = () =>{
    return(
        <>
        <Switch>
            <Route exact path="/" componenet={About1} />
            <Route exact path="/contact" component={Contact1} />
            <Route component={Error} />
        </Switch>
            
        </>
    )
}

export default App;