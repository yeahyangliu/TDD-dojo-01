猜数字游戏
=====================
题目：

       猜数字游戏会产生一个非重复的四位数字，参与游戏的人给出四位非重复数字；
       对于游戏者给出的每一个数字，如果出现在游戏服务器给出的四位数字中但位置
       不对，就返回B；如果数字相同并且位置也对，就返回A；比如游戏服务器的数字
       是1234，而参与游戏的人给出的是1567，那么就返回"1A0B"。游戏如果返回
       4A0B，意味着四个数字都才对了，那么就打印"You Win'；如果尝试超过六次，
       游戏就结束。


练习题目

tdd-train-measure
=================

 1: 实现一个库: 通过这个库,用户可以以Mile为单位来表示一个长度。 并且,可以对比两个长度的相等性.

 2: 用户除了可以使用Mile为单位来表示长度之外,还可以使用Yard为单位来表示长 度,其中:
    • 当以Mile为单位来表示一个长度时;
    • 当以Yard为单位来表示一个长度时;
    • 能够对比任意两个长度的相等性 :
        o 1 Mile == 1760 Yard
        o 3 Yard == 3 Yard
        o 1 Mile != 1761 Yard o 3 Yard != 4 Yard

 3: 增加两个新的长度单位,Feet和Inch,用户可以使用它们为单位来表现一个长度。 其中:
    • 1 Yard == 3 Feet
    • 1 Feet == 12 Inch
    • 当用Feet为单位来表示长度的时候。
    • 当用Inch为单位来表示长度的时候。

 4. 并实现单位之间的加减换算.