class Offer03 {
    //
    var number: IntArray = intArrayOf(2, 3, 1, 0, 2, 5, 3)
    fun main(args: Array<String>) {
        findRepeatNumber()
    }
    fun  findRepeatNumber():Int{
        var i = 0
     while (i<number.size){
         if(number[i]==i){
             i++
             continue
         }
         if(number[number[i]]==number[i]){
             return number[i]
         }
         var temp = number[i]
         number[i] = number[temp]
         number[temp] = temp

     }

        return -1
    }
}