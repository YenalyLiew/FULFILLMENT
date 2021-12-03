fun main() {
    print("请输入你需要抽取的人数：")
    val ramd = readLine()
    print("请输入你想选择的学号范围（首）：")
    val first = readLine()
    print("请输入你想选择的学号范围（尾）：")
    val end = readLine()
    val list = mutableListOf<Int>()
    if (ramd != null && first != null && end != null) {
        if (end.toInt() - first.toInt() < ramd.toInt()) throw IllegalArgumentException("人数过少不足以抽取！")
        else {
            repeat(ramd.toInt()) {
                list.add((first.toInt()..end.toInt()).random())
            }
        }
    } else throw IllegalArgumentException("输入为空！")
    while (hasEqual(list)) {
        list.removeAll(list)
        repeat(ramd.toInt()) {
            list.add((first.toInt()..end.toInt()).random())
        }
    }
    list.sort()
    println("\n恭喜下面${ramd}位同学获得资格：")
    println(list)
}

private fun hasEqual(_list: List<Int>): Boolean {
    for (i in 0 until _list.size - 1) {
        for (j in i + 1 until _list.size) {
            if (_list[i] == _list[j]) {
                return true
            }
        }
    }
    return false
}