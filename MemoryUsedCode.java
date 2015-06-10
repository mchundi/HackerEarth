/****Memory usage*/ 
// Get the Java runtime
Runtime runtime = Runtime.getRuntime();
// Run the garbage collector
runtime.gc();
// Calculate the used memory
long memory = runtime.totalMemory() - runtime.freeMemory();
System.out.println("Used memory is bytes: " + memory);



/****execution time*/
long startTime = System.currentTimeMillis();
//code
long stopTime = System.currentTimeMillis();
long elapsedTime = stopTime - startTime;
System.out.println(elapsedTime);