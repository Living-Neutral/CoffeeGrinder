let temp = false;
let type = 'None';
let espresso = false;
let fruity = false;
let coconut_milk = false;
let category = 'None';
let wheat = false;
let treenuts = false;
let soy = false;
let dairy = false;
let firstSugar = 0.5;
let secondSugar = 1.5;
let thirdSugar = 2.5;


console.log(temp);


function updateHot()
{
    console.log(temp);
    temp = false;
    console.log(temp);
}


function updateCold()
{
    console.log(temp);
    temp = true;
    console.log(temp);
}

function updateCoffee()
{
    console.log(type);
    type = 'Coffee';
    console.log(type);
}

function updateTea()
{
    console.log(type);
    type = 'Tea'
    console.log(type);
}

function updateFrap()
{
    console.log(type);
    type = 'Frappuccino'
    console.log(type);
}

function updateOther()
{
    console.log(type);
    type = 'Drink';
    console.log(type);
}

function yesEspresso()
{
    console.log(espresso);
    espresso = true;
    console.log(espresso);
}

function noEspresso()
{
    console.log(espresso);
    espresso = false;
    console.log(espresso);
}

function yesFruity()
{
    console.log(fruity);
    fruity = true;
    console.log(fruity);
}

function noFruity()
{
    console.log(fruity);
    fruity = false;
    console.log(fruity);
}

function yesRefresher()
{
	console.log(category);
	category = 'Starbucks Refresher';
	console.log(category);
}

function yesCoconut_Milk()
{
	console.log(coconut_milk);
	coconut_milk = true;
	console.log(coconut_milk);
}

function yesHot_Chocolate()
{
	console.log(category);
	category = 'Hot Chocolate';
	console.log(category);
}

function yesCreme_Frappuccino()
{
	console.log(category);
	category = 'Creme Frappuccino';
	console.log(category);
}

function yesCoffee_Frappuccino()
{
	console.log(category);
	category = 'Coffee Frappuccino';
	console.log(category);
}

function yesSoy()
{
	console.log(soy);
	soy = true;
	console.log(soy);
}

function noSoy()
{
	console.log(soy);
	soy = false;
	console.log(soy);
}

function yesDairy()
{
	console.log(dairy);
	dairy = true;
	console.log(dairy);
}

function noDairy()
{
	console.log(dairy);
	dairy = false;
	console.log(dairy);
}

function yesWheat()
{
	console.log(wheat);
	wheat = true;
	console.log(wheat);
}

function noWheat()
{
	console.log(wheat);
	wheat = false;
	console.log(wheat);
}

function yesTreenuts()
{
	console.log(treenuts);
	treenuts = true;
	console.log(treenuts);
}

function noTreenuts()
{
	console.log(treenuts);
	treenuts = false;
	console.log(treenuts);
}

function yesJuice()
{
	console.log(category);
	category = 'Juice';
	console.log(category);
}

function yesSteamer()
{
	console.log(category);
	category = 'Steamer';
	console.log(category);
}

function firstSweet()
{
	
}

function drinkTemplate(drink){
    return `
    <div class="card">
        <img class="drink-photo" src="${drink.image}">
        <h1>${drink.name}</h1>
`
}

fetch('drinks.json').then(function(response) {
  return response.json();
}).then(function(json) {
  let drinks = json;
  
    final_order = [];
    
    for(i = 0;i<drinks.length;i++)
    {
        if(drinks[i].type=='Coffee')
            final_order.push(drinks[i]);

    }
    console.log(final_order.length);
    
    document.getElementById("results").innerHTML = `
    ${final_order.map(function(drink){
        return `
                    <div class = "card">
                        <img class="drink-photo" src="${drink.image}">
                        <h1>${drink.name}</h1>
                        <p>${drink.description}</p>
                    </div>

                `
    }
    
    
    ).join('')}
    
    `
    
}).catch(function(err) {
  console.log('Fetch problem: ' + err.message);
});