Java 8 Functional streams
 

A stream  represents sequence of elements from a data source .
Streams  allow us to operate on the elements from that data source and makes bulk processing convenient and fast.
Streams are wrappers around a data source(eg : array , collection , file) .

A stream does not store data , meaning   it is not a data structure. It also never modifies the underlying data source.

API  – java.util.stream – supports functional-style operations on streams of elements, such as filter -map-reduce transformations on collections.

Typically Stream will have
source
intermediate operations(0 or multiple)
terminal opeartion (single)

Details

1. How to create stream of ints from array?
java.util.Arrays class method
public static IntStream stream(int[] array)
Returns a sequential IntStream with the specified array as its source.

2. How to create stream(sequential) from Collection ?
Collection i/f method
public Stream<E> stream()

3.How to create stream(parallel) from Collection ?
Collection i/f method
public Stream<E> parallelStream()


IntStream Methods

1. public void forEach(IntConsumer action)
Performs an action for each element of this stream.

Solve : 
1.Create int[] ---> IntStream & display its contents.
1.5 Create int[] ---> IntStream --> sort(asc) --> & display its contents.
2. Create AL<Integer> , populate it.
Convert it to seq stream & display elems
2.5 Convert it to parallel stream & display elems
3. Create stream of ints between 1-100 & display all even elements.
(Hint : IntStream methods --range,filter,forEach)
3.5. Create Stream<Integer> from a fixed size list (un sorted ) of integers , sort (desc) n display it.

4. list : Display all product names of a particular category , exceeding specific price.
I/P category name & price.
eg : productList.stream()
.filter(p -> p.getCategory()==cat)
.filter(p -> p.getPrice() > price)
.forEach(p -> sop(p.getName()));

5.map : Display all product names of a particular category , exceeding specific price.
map.values() //Collection<Product>
.stream()
.filter(p -> p.getCategory()==cat)
.filter(p -> p.getPrice() > price)
.forEach(p -> sop(p.getName()));

6. Display sum of prices of all products from a chosen category
eg : list.stream() //Stream<Product> : all
.filter(...) //Stream<Product> : filtered
.mapToDouble(p -> p.getPrice() //DoubleStream 
.sum(); //terminal

4.5 Prompt user for category n discount.
Apply that discount on all products of specified category n print it.


5. Display sum of all even nos between 1-100 .
Hint : IntStream --range --filter --reduce(sum)

6. Display average of all odd nos between 1-100 .

7.Print avg of odd numbers between 10 & 50 ((if strm is empty print -100 or else print avg)
(filter,average,optional)

8. Display sum of product prices of a specific category.
I/P category name
Products are stored in a map
o/p sum.

9. Display average of product prices of a specific category.
I/P category name
o/p average

10. Sort products of a specific category as per price n display their names.
i/p category name



Exam objectives 
Important Facts of Java 8 Streams:
1. Streams are implicitely closed , after terminal operation (i.e they can't be re used after terminal operation) 
Otherwise throws --IllegalStateException (reason :stream has already been operated upon or closed)
Where as , collections are re-usable.

2. Streams follow , vertical execution order.

3. Streams support lazy evaluation (meaning none of the intermediate operations are performed , until its closed by terminal operation)



