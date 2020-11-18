fetch('drinks.json').then(function(response) {
  return response.json();
}).then(function(json) {
  
}).catch(function(err) {
  console.log('Fetch problem: ' + err.message);
  console.log(path.dir);
});

