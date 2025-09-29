var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let V = parseInt(lines.shift());
let N = [];
N[0] = V;

console.log(`N[0] = ${V}`);

for (let i = 1; i < 10; i++) {
    N[i] = N[i - 1] * 2;
    console.log(`N[${i}] = ${N[i]}`);
}