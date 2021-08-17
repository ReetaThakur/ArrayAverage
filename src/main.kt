import java.util.*

fun main() {
    val obj=Scanner(System.`in`)
    var size=obj.nextInt()
    val arr = IntArray(size)
    for (i in 0 until size) {
        arr[i] = obj.nextInt()
    }
    print(average(arr, size))
}

fun average(arr: IntArray, size: Int):Int {
    var sum=0
    var average=0;
    for (i in 0 until size){
        sum+=arr[i]
    }
    average=sum/size
    return average
}
