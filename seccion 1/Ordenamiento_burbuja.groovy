
Integer[] intArray = [3, 5, 4, 2, 10, 50, 3, 14];

println ("*************************") 
println ("*  Arreglo desordenado  *") 
println ("*************************") 

for(int z=0 ; z<intArray.length ; z++){
 println (intArray[z])
}

println ("*************************") 
println ("*     Asendente         *") 
println ("*************************") 

for(int i=0 ; i<intArray.length -1; i++){
for(int j=0 ; j<intArray.length -1; j++){
if(intArray[j]>intArray[j+1]){
int aux = intArray[j];
intArray[j]=intArray[j+1];
intArray[j+1]=aux;
}
}
}

for(int z=0 ; z<intArray.length ; z++){
 println (intArray[z]); 

}

println ("*************************")
println ("*     Desendente        *")
println ("*************************")


for(int i=0 ; i<intArray.length -1; i++){
for(int j=0 ; j<intArray.length -1; j++){
if(intArray[j]<intArray[j+1]){
int aux = intArray[j];
intArray[j]=intArray[j+1];
intArray[j+1]=aux;
}
}
}

for(int z=0 ; z<intArray.length ; z++){
 println (intArray[z])

}

