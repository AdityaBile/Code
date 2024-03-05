import React from "react";
import Images from "./Images";
import Head from "./Head";

function Card(props){
    return(
      <div className="cards">
        <div className="card">
          <Images imgsrc={props.imgsrc}/>
          <div className="card__info">
            <Head pname={props.pname}/>
            <h3 className="card__title">{props.sname}</h3>

            <a href={props.slink} target="_blank">
              <button> Watch Now </button>
            </a>
          </div>
        </div>
      </div>
    );
  }

  export default Card;