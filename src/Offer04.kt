class Offer04 {


    var array = arrayOf(
        intArrayOf(1, 4, 7, 11, 15),
        intArrayOf(2, 5, 8, 12, 19),
        intArrayOf(3, 6, 9, 16, 22),
        intArrayOf(10, 13, 14, 17, 24),
        intArrayOf(18, 21, 23, 26, 30)
    )

    constructor(){
       val c =  test04(array,4)
        println(""+c)
    }

    fun  test04(intArray: Array<IntArray>, target :Int):Boolean{
        var i = intArray.size - 1
        var j = 0
        while (i >= 0 && j < intArray[0].size){
            if(intArray[i][j]>target){
                i--
            }else if(intArray[i][j]<target){
                j++
            }else{
                return true
            }
        }
        return false;
    }

}

