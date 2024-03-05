import React from "react";
import Sdata from "./Sdata";
import Card from "./Card";

const Netflix =  () =>{
    return([<Card 
        key = {Sdata[0].id}
        imgsrc = {Sdata[0].imgsrc}
        pname = {Sdata[0].pname}
        sname = {Sdata[0].sname} 
        slink = {Sdata[0].slink}
      />,
      <Card 
      key = {Sdata[1].id}
      imgsrc = {Sdata[1].imgsrc}
      pname = {Sdata[1].pname}
      sname = {Sdata[1].sname} 
      slink = {Sdata[1].slink}
      />,
      <Card 
      key = {Sdata[2].id}
      imgsrc = {Sdata[2].imgsrc}
      pname = {Sdata[2].pname}
      sname = {Sdata[2].sname} 
      slink = {Sdata[2].slink}
      />,
      <Card 
      key = {Sdata[3].id}
      imgsrc = {Sdata[3].imgsrc}
      pname = {Sdata[3].pname}
      sname = {Sdata[3].sname} 
      slink = {Sdata[3].slink}
      />,
       <Card 
       key = {Sdata[4].id}
       imgsrc = {Sdata[4].imgsrc}
       pname = {Sdata[4].pname}
       sname = {Sdata[4].sname} 
       slink = {Sdata[4].slink}
       />
      ])
}

export default Netflix;