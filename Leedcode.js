// This function checks if a number is prime

function isprime(num){
    if (num <= 1) return false;
    for (let i = 2; i < Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}
 
let num= 29;

if(isprime(num)){
    console.log(num + " is a prime number");
} else {
    console.log(num + " is not a prime number");
}