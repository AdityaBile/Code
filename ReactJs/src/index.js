// import React from "react";
// import ReactDOM from "react-dom";

// const flname = "Aditya Bile"
// ReactDOM.render(
//   <>
//   <h1>My name is {flname}</h1>
//   <p>My lucky number is {1 * 7}</p>
//   </>,
//   document.getElementById("root"));



// import React from "react";
// import ReactDOM from "react-dom";

// const fname = "Aditya";
// var lname = "Bile";
// let date = new Date().toLocaleDateString();
// let time = new Date().toLocaleTimeString();

// ReactDOM.render(
//   <>
//   <h1>
//     {`My self ${fname} ${lname} learning reactjs from last ${2+2} hours`}
//   </h1>
//   <p>
//     {`The current time is = ${time}`}
//   </p>
//   <p>
//     {`The todays date is = ${date}`}
//   </p>
//   </>,
//   document.getElementById("root")
// );


// import React from "react";
// import ReactDOM from "react-dom";
// import "./index.css";

// let name = "Aditya";
// let img1 = "https://picsum.photos/200/300";
// let img2 = "https://picsum.photos/id/237/200/300";
// let img3 = "https://picsum.photos/seed/picsum/200/300";
// let link = "https://www.youtube.com/watch?v=OloAP8p1k1w&list=PLwGdqUZWnOp3aROg4wypcRhZqJG3ajZWJ&index=14";
// ReactDOM.render(
//   <>
//     <h1 className="heading">{`Lets learn Reactjs`}</h1>
//     <div className="divImg">
//       <img src={img1} alt="random Image"/>
//       <img src={img2} alt="Random Images"/>
//       <a href={link} target="_blank">
//         <img src={img3} alt="Random Image"/>
//       </a>
//     </div>
//   </>,
//   document.getElementById("root")
// );


// import React from "react";
// import ReactDOM from "react-dom";

// let img1 = "https://picsum.photos/200/300";
// let img2 = "https://picsum.photos/id/237/200/300";
// let img3 = "https://picsum.photos/seed/picsum/200/300";
// let link = "https://www.youtube.com/watch?v=OloAP8p1k1w&list=PLwGdqUZWnOp3aROg4wypcRhZqJG3ajZWJ&index=14";

// const heading = {
//   color: "coral",
//   textAlign: "center",
//   textTransform: "capitalize",
//   fontWeight: "bold",
//   textShadow: "0px 2px 4px",
//   margin: "50px 0"
// }
// ReactDOM.render(
//   <>
//     <h1 style={heading}>{`Lets learn Reactjs`}</h1>
//     <div style={{
//       display: "flex",
//       justifyContent: "center"
//     }}>
//       <img src={img1} alt="random Image"/>
//       <img src={img2} alt="Random Images"/>
//       <a href={link} target="_blank">
//         <img src={img3} alt="Random Image"/>
//       </a>
//     </div>
//   </>,
//   document.getElementById("root")
// );


// import React from "react";
// import ReactDOM from "react-dom";
// import "./index.css";

// let currTime = new Date(2022,12,24,1);
// currTime = currTime.getHours();
// let greeting = "";
// let cssStyle = {};

// if(currTime>=1 && currTime<12){
//   greeting = "Good Morning";
//   cssStyle.color = "Green";
// }
// else if(currTime>=12 && currTime<18){
//   greeting = "Good Afternoon";
//   cssStyle.color = "rgb(236, 147, 38)";
// }
// else{
//   greeting = "Good Night";
//   cssStyle.color = "Black";
// }

// ReactDOM.render(
//   <>
//     <div className="backHead">
//       <h1>Hello Sir, <span style={cssStyle}>{greeting}</span></h1>
//     </div>
//   </>,
//   document.getElementById("root")
// );



// import React from "react";
// import ReactDOM from "react-dom";
// import App from "./App";


// ReactDOM.render(
//   <App/>,
//   document.getElementById("root")
// );


// import React from "react";
// import ReactDOM from "react-dom";
// import address,{contact, f1, f2} from "./App";
// ReactDOM.render(
//   <>
//     <ol>
//       <li>{address}</li>
//       <li>{contact}</li>
//       <li>{f1()}</li>
//       <li>{f2()}</li>
//     </ol>

//   </>,
//   document.getElementById("root")
// );

// import React from "react";
// import ReactDOM from "react-dom";
// import {add, sub, multi, div} from "./CalciCal"

// ReactDOM.render(
//   <>
//     <ol>
//       <li>Sum of 2 numbers {add(40, 4)}</li>
//       <li>Subtract of 2 numbers {sub(40, 4)}</li>
//       <li>Multiply of 2 numbers {multi(40, 4)}</li>
//       <li>Divison of 2 numbers {div(40, 4)}</li>
//     </ol>
//   </>,document.getElementById("root")
// );


// //// Netflix
// import React from "react";
// import ReactDOM from "react-dom";
// import "./index.css";
// import Card from "./Card"
// import Sdata from "./Sdata"




// ReactDOM.render(
//   <>
//     <h1 className="heading_style">Top 5 Netflix series</h1>
    
//     <Card imgsrc={Sdata[0].imgsrc}
//       pname={Sdata[0].pname}
//       sname={Sdata[0].sname}
//       slink={Sdata[0].slink}/>
    
//     <Card imgsrc={Sdata[1].imgsrc}
//       pname={Sdata[1].pname}
//       sname={Sdata[1].sname}
//       slink={Sdata[1].slink}/>
    
//     <Card imgsrc={Sdata[2].imgsrc}
//       pname={Sdata[2].pname}
//       sname={Sdata[2].sname}
//       slink={Sdata[2].slink}/>
    
//     <Card imgsrc={Sdata[3].imgsrc}
//       pname={Sdata[3].pname}
//       sname={Sdata[3].sname}
//       slink={Sdata[3].slink}/>
    
//     <Card imgsrc={Sdata[4].imgsrc}
//       pname={Sdata[4].pname}
//       sname={Sdata[4].sname}
//       slink={Sdata[4].slink}/>
//   </>,document.getElementById("root")
// );


// //// Netflix
// import React from "react";
// import ReactDOM from "react-dom";
// import "./index.css";
// import Card from "./Card"
// import Sdata from "./Sdata"
// import sdata from "./Sdata";

// //// Method 1...........................
// // const ncard = (val) =>{
// //   return (
// //     <Card 
// //       imgsrc={val.imgsrc}
// //       pname = {val.pname}
// //       sname = {val.sname}
// //       slink = {val.slink}
// //     />
// //   )
// // }


// ReactDOM.render(
//   <>
//     <h1 className="heading_style">Top 5 Netflix series</h1>
//     {/* {sdata.map(ncard)}  //Method 1..................... */}

//     {sdata.map((val) => {
//       return(
//         <Card 
//           key = {val.id}
//           imgsrc = {val.imgsrc}
//           pname = {val.pname}
//           sname = {val.sname} 
//           slink = {val.slink}
//         />
//       )
//     })}

    
    
//   </>,document.getElementById("root")
// );






// //// Netflix if else
// import React from "react";
// import ReactDOM from "react-dom";
// import "./index.css";
// import Netflix from "./Netflix";
// import Amazon from "./Amazon";

// const FavSeries = "Netflix";

// //// Method 1
// // const Series = () =>{
// //   if(FavSeries=== "Netflix"){
// //     return(
// //       <Netflix/>
// //     )
// //   }
// //   else{
// //     return(<Amazon/>);
// //   }
// // }

// ReactDOM.render(
//   <>
//     <h1 className="heading_style">Top 5 Netflix series</h1>
//     {/* <Series/> */}
//     {/* Method 2........................ */}
//     {FavSeries === "Amazon" ? <Netflix/> : <Amazon/>}
//   </>,document.getElementById("root")
// );


// // Emoji..........................
// import React from "react";
// import ReactDOM from "react-dom";

// const Emoji = () =>{
//     let x = "🔥 ☁ ";
//     return(
//         <h1>My name is {x}</h1>
//     )
// }

// ReactDOM.render(
//     <Emoji/>,document.getElementById("root")
// );


// // Hooks.......................
// import React from "react";
// import ReactDOM from "react-dom";
// import App from "./App";
// import "./click.css";

// ReactDOM.render(
//     <>
//         <App/>
//     </>,
//     document.getElementById("root")
// );


// import React from "react";
// import ReactDOM from "react-dom";
// import App from "./context/App";

// ReactDOM.render(
//     <>
//         <App/>
//     </>,document.getElementById("root")
// );


