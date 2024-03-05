let url = "https://v2.jokeapi.dev/joke/Any?safe-mode";

async function getHeader(){
    try {
        let config  = {headers : {Accept : "application/json" }};
        let res  = await axios.get(url, config);
        console.log(res.data) ;
        
        let config1  = {headers : {Accept : "application/json"}};
        let joke = await axios.get(url, config1);
        console.log(joke.data.setup);
   
        
    } catch (error) {
        console.log("No result",error) ;
    }
}