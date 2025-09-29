// Versão do Exercício em Javascript

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

for (let i = 0; i < 10; i++) {
    let valor = parseInt(lines.shift());
    if (valor <= 0) {
        valor = 1;
    }
    console.log(`X[${i}] = ${valor}`);
}