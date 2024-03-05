const add = (a,b) =>{
    return(a+b);
};

const sub = (a,b) =>{
    return(a-b);
}

const multi = (a,b) =>{
    return(a*b);
}

const name = "Aditya";

// module.exports = add;
// module.exports = name;

// module.exports = {add, sub, multi}

module.exports.add1 = add;
module.exports.sub1 = sub;
module.exports.multi1 = multi;
