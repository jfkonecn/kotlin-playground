package com.playground.year2023.day11

fun part1(lines: List<String>): Int {
    var expandFactor = 2
    var columnsWithGalaxies =
        lines.fold(hashSetOf<Int>(), { acc, s ->
            s.forEachIndexed { index, c ->
                if (c == '#') {
                    acc.add(index)
                }
            }
            acc
        })

    var map =
        lines.flatMap { it ->
            var sb = StringBuilder()
            it.forEachIndexed { index, c ->
                if (!columnsWithGalaxies.contains(index)) {
                    for (i in 1..expandFactor) {
                        sb.append(c)
                    }
                } else {
                    sb.append(c)
                }
            }
            var s = sb.toString()
            if (it.contains("#")) {
                listOf(s)
            } else {
                var l = mutableListOf<String>()
                for (i in 1..expandFactor) {
                    l.add(s)
                }
                l
            }
        }

    var galaxyCoordinates =
        map.foldIndexed(mutableListOf<Pair<Int, Int>>(), { row, acc, s ->
            s.forEachIndexed { col, c ->
                if (c == '#') {
                    acc.add(Pair(row, col))
                }
            }
            acc
        })

    var distanceBetweenGalaxies =
        galaxyCoordinates.dropLast(1).mapIndexed { index, (row, col) ->
            galaxyCoordinates.drop(index + 1).map { (row2, col2) ->
                Math.abs(row - row2) + Math.abs(col - col2)
            }
        }

    return distanceBetweenGalaxies.flatten().sum()
}

fun part2(lines: List<String>): Int {
    return 0
}
