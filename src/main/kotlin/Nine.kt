//fun main() {
//    for (i in 2..9) {
//        for (j in 1..9) {
//            if (i*j<10) {
//                print("$i*$j＝ ${i * j}  ")
//            } else {
//                print("$i*$j＝${i * j}  ")
//            }
//        }
//        println()
//    }
//}

//fun main() {
//    for (i in 2..9) {
//        for (j in 1..9) {
//            print("$i*$j＝${i * j}\t")
//        }
//        println()
//    }
//}

//fun main() {
//    for (i in 2..9) {
//        for (j in 1..9) {
//            var space = if (i*j<10) " " else ""
//            print("$i*$j＝$space${i * j}\t")
//        }
//        println()
//    }
//}

fun main() {
    for (i in 2..9) {
        for (j in 1..9) {
            if (j%3 == 0) {
                print("$i*$j＝${i * j}\t")
                println()
            } else {
                print("$i*$j＝${i * j}\t")
            }
        }
    }
}