fetch('drinks.json').then(function(response) {
  return response.json();
}).then(function(json) {
    let drinks = json;
    console.log(drinks.length);
    for(var i = 0;i<drinks.length;i++)
    {
        var drink = drinks[i];
        console.log(drink.name);
    }
    
    document.getElementById("results").innerHTML = 
        `
        <h1>${drinks.length} drinks suggested</h1>
        
        ${drinks.map(function(drink){
        return `<div class="card">
                    <img class="drink-photo" src="${drink.image}">
                    <h1>${drink.name}</h1>
                    <p>${drink.description}</p>
                </div>
        `
    }).join('')}

        `
    
   
        
  
}).catch(function(err) {
  console.log('Fetch problem: ' + err.message);
  console.log(path.dir);
});



