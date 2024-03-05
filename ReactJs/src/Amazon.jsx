import React from "react";
import Sdata from "./Sdata";
import Card from "./Card";

const Amazon =  () =>{
    return([<Card 
        key = {Sdata[6].id}
        imgsrc = {Sdata[6].imgsrc}
        pname = {Sdata[6].pname}
        sname = {Sdata[6].sname} 
        slink = {Sdata[6].slink}
      />,
      <Card 
      key = {Sdata[7].id}
      imgsrc = {Sdata[7].imgsrc}
      pname = {Sdata[7].pname}
      sname = {Sdata[7].sname} 
      slink = {Sdata[7].slink}
      />,
      <Card 
      key = {Sdata[5].id}
      imgsrc = {Sdata[5].imgsrc}
      pname = {Sdata[5].pname}
      sname = {Sdata[5].sname} 
      slink = {Sdata[5].slink}
      />])
}

export default Amazon;