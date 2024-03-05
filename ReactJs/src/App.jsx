// import React from "react";
// import Heading from "./Heading";
// import OrderList from "./OrderlList";
// import Para from "./Para";

// function App(){
//     return(
//         <>
//             <Heading/>
//             <Para/>
//             <OrderList/>
//             <Para/>
//         </>
//     );
// }

// export default App;


// ......................................
// import React from "react";

// const address = "Ravet";
// const contact = 99975;

// function f1() {
//     let self1 = "Aditya";
//     return self1;   
// }

// function f2() {
//     let beside = "Saurabh";
//     return beside;
// }


// export default address;
// export {contact, f1, f2};



// // Hooks..........
// import React, { useState } from "react";
// const App = () =>{
//     const state = useState();

//     const [count, setCount] = useState(0);

//     const IncNum = () =>{
//         setCount(count + 1);
//     }
    
//     return(
//         <>
//             <h1>{count}</h1>
//             <button onClick={IncNum}> Click Me </button>
//         </>
//     )
    
// }

// export default App



// // On click Time.............................................
// import React, { useState } from "react";

// const App = () =>{
//     let newTime = new Date().toLocaleTimeString();
//     const [cTime, setTime] = useState(newTime);

//     const updateTime = () =>{
//         newTime = new Date().toLocaleTimeString();
//         setTime(newTime);
//     }


//    return(
//     <>
//         <h1>{cTime}</h1>
//         <button onClick={updateTime}>Get Time</button>
//     </>

//    );
// } 
// export default App;


// //Live digital Time.............................................
// import React, { useState } from "react";

// const App = () =>{
//     let newTime = new Date().toLocaleTimeString();
//     const [cTime, setTime] = useState(newTime);

//     const updateTime = () =>{
//         newTime = new Date().toLocaleTimeString();
//         setTime(newTime);
//     }

//     setInterval(updateTime, 1000);

//    return(
//     <>
//         <h1>{cTime}</h1>
//     </>

//    );
// } 
// export default App;


// // Background and button change...............................
// import React, { useState } from "react";

// const App = () =>{
//     const purple = "#8e44ad";
//     const [bg, setBg] = useState(purple);
//     const [name, setname] = useState(" Click me 🥺 ");

//     const bgChange = () =>{
//         let newBg = "#34495e";
//         setBg(newBg);
//         setname(" Ouch!! 😫 ");
         
//     }

//     const bgBack = () =>{
//         let newBg2 = "#87bc45"
//         setBg(newBg2);
//         setname(" Ayyo 😠 ");
//     }

//     return(
//         <>
//             <div style={{backgroundColor : bg}}>
//                 <button onMouseEnter={bgChange} onMouseLeave={bgBack}> <h1>{name}</h1> </button>
//             </div>
//         </>
//     );
// }

// export default App;



// // Basic of Form ........................... 
// import React, { useState } from "react";

// const App = () =>{
//     const [name, setName] = useState("");
//     const inputEvent = (event) =>{
//         setName(event.target.value);
//     }

//     const [fullName, setFullName] = useState()
//     const onSubmit = () =>{
//         setFullName(name);
//     }
//     return (
//         <>
//             <div>
//                 <h1> Hello {fullName}</h1>
//                 <input type = "text"
//                 placeholder="Enter Your Name"
//                 onChange={inputEvent}
//                 value={name}
//                 />
//                 <button onClick={onSubmit}> Click Me 👍 </button>
//             </div>
//         </>
//     )
// }

// export default App;



// // Form 2 fields .....................................
// import React, { useState } from "react";

// const App = () =>{
//     const [name, setName] = useState("");
//     const inputEvent = (event) =>{
//         setName(event.target.value);
//     }

//     const [lastName, setLastName] = useState("");
//     const inputEventNew = (event) =>{
//         setLastName(event.target.value);
//     }
    
//     const [fullName, setFullName] = useState();
//     const [lastNameNew, setLastNameNew] = useState();
//     const onSubmit = (event) =>{
//         event.preventDefault();
//         setFullName(name);
//         setLastNameNew(lastName);
//     }
    


//     return (
//         <>
//         <form onSubmit={onSubmit}>
//             <div>
//                 <h1> Hello 🖐  {fullName} {lastNameNew}</h1>
//                 <input type = "text"
//                 placeholder="Enter Your Name"
//                 onChange={inputEvent}
//                 value={name}
//                 />
//                 <br/>
//                 <input type = "text"
//                 placeholder="Enter Your last Name"
//                 onChange={inputEventNew}
//                 value={lastName}
//                 />
//                 <button type="submit"> Click Me 👍 </button>
//             </div>
//         </form>            
//         </>
//     )
// }

// export default App;



// // Form 3 fields .....................................
// import React, { useState } from "react";

// const App = () =>{
//     const [fullName, setFullName] = useState({
//         fName : "",
//         lName : "",
//         email : "",
//         phone : "",
//     });
//     const inputEvent = (event) =>{
//         console.log(event.target.value);
//         console.log(event.target.name);

//         const {value, name} = event.target;

//         // const value = event.target.value;
//         // const name = event.target.name;

//         setFullName((preValue) =>{
//             if(name === "fName"){
//                 return{
//                     fName : value,
//                     lName : preValue.lName,
//                     email : preValue.email,
//                     phone : preValue.phone
//                 }
//             }
//             else if(name === "lName"){
//                 return{
//                     fName : preValue.fName,
//                     lName : value,
//                     email : preValue.email,
//                     phone : preValue.phone
//                 }
//             }
//             else if(name === "email"){
//                 return{
//                     fName : preValue.fName,
//                     lName : preValue.lName,
//                     email : value,
//                     phone : preValue.phone
//                 }
//             }
//             else if(name === "phone"){
//                 return{
//                     fName : preValue.fName,
//                     lName : preValue.lName,
//                     email : preValue.email,
//                     phone : value
//                 }
//             }
//         });
//     }



//     const onSubmit = (event) =>{
//         event.preventDefault();
//         alert("Form submitted");
//     }
    
//     return (
//         <>
//         <form onSubmit={onSubmit}>
//             <div>
//                 <h1> Hello 🖐 {fullName.fName} {fullName.lName}</h1>
//                 <h3> 📧 {fullName.email}</h3>
//                 <h3> 📱 {fullName.phone}</h3>
//                 <input type = "text"
//                 placeholder="Enter Your Name"
//                 name="fName"
//                 onChange={inputEvent}
//                 value={fullName.fName}
//                 />
//                 <br/>
//                 <input type = "text"
//                 placeholder="Enter Your last Name"
//                 name="lName"
//                 onChange={inputEvent}
//                 value={fullName.lName}
//                 />
//                 <input type = "text"
//                 placeholder="Enter Your email"
//                 name="email"
//                 onChange={inputEvent}
//                 value={fullName.email}
//                 />
//                 <input type = "text"
//                 placeholder="Enter Your phone no."
//                 name="phone"
//                 onChange={inputEvent}
//                 value={fullName.phone}
//                 />
//                 <button type="submit"> Click Me 👍 </button>
//             </div>
//         </form>            
//         </>
//     )
// }

// export default App;
  


import React from "react";

const App = () =>{
    return(
        <>
            <div className="main_div">
                <div className="center_div">
                <br/>
                    <h1>ToDo List</h1>
                    <br/>
                    <input type="text" placeholder="Add a Item" />
                    <button>+</button>

                    <ol>
                        <li>buy Mango</li>
                    </ol>
                </div>
                    
            </div>
        </>
    )
    
}

export default App;