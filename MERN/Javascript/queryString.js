let url = "http://universities.hipolabs.com/search?name=";

let country = "nepal";



async function getWord(){
    try{
        const res = await axios.get(url+country);
        console.log(res.data);
    }
    catch(e){
        console.log("Error",e);
    }
}