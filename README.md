# learnJava
Code dump of all the lectures of Kunal Kushwaha's Java + DSA bootcamp.

## Basics  
1. Hello world.
2. Variables.
3. Basic user IO.
4. Loops.
5. Conditionals.
6. Switch cases.
7. Functions.

## Advanced  
### 1. Arrays  
   #### a. Array declaration:  
    ```Java
    dataType[] arrayName = new dataType[length];
    arrayName[i -> length] = element;

    // or simply
    dataType[] arrayName = {elements};    
    ```
   
   #### b. Convert arrays to string:  
   ```Java
   Arrays.toString(arrayName);
   ```
### 2. Array Lists  
   They can store an "infinite" number of elements, as in it can change its size dynamically to accommodate more elements than its initial size.   
   #### a. ArrayList declaration:
   ```Java
   ArrayList<DataType> = new ArrayList<>(initial size of the array list);
   ```  
   #### b. Adding elements to ArrayList:
   ```Java
   nameOfArrayList.add(element);
   ```  
   #### c. Multi-dimensional ArrayList:  
   ```Java
   ArrayList<ArrayList<DataType>> alName = new ArrayList<>();
   ```  
  #### d. Adding Elements in multi-dimensional ArrayLists:  
".get(index)" method gets the ArrayList at the i-th index and adds the element passed through ".add()" method.
   ```Java
   alName.get(index).add(element);
   ```
