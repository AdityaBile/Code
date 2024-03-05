
let url = `https://world.openfoodfacts.org/api/v0/product/737628064502.json`;

async function getUrl(){
    try{
        let res = await axios.get(url);
        console.log(res.data.code);
    }
    catch (e){
        console.log("Error: ", e);
    }
}

