// https://stackoverflow.com/questions/34878569/how-to-store-check-box-values-using-javascript-or-jquery

$('#allergies_confirm').click(function() {
    alert($('input').serialize());
})

// look i don't really know how to make sure this is working in any expedient way, but since it's not important for the design right now, i'm gonna leave this hanging
// we also need to figure out how to store this information locally so that it doesn't disappear on reload


var path = ["hotcold"];

var types = ["hotespresso", "hotnoespresso", "hotfruity", "hotnofruity", "hotchocolate", "hotjuice", "hotsteamer", "coldcaramelfrap", "coldmochafrap", "coldcoffeefrap", "coldchocolatefrap", "coldnochocolatefrap", "coldespresso", "coldnoespresso", "coldfruity", "coldnofruity", "coldrefresher", "coldcoconutmilk"]


function hide(pageID) {
    document.getElementById(pageID).style.display = "none";
}

function register(pageID) {
    path.push(pageID);
}

function goto(pageID) {
    document.getElementById(pageID).style.display = "block";
}

function goBack() {
    var currentPage = path.pop();
    if (types.includes(currentPage)) {
        currentPage = "sugar";
    }
    document.getElementById(currentPage).style.display = "none";
    var currentPage = path[path.length - 1];
    document.getElementById(currentPage).style.display = "block";
}