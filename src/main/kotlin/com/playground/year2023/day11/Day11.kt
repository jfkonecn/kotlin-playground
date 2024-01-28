package com.playground.year2023.day11

fun sumOfDistancesBetweenGalaxies(
    lines: List<String>,
    expandFactor: Int,
): Long {
    var columnsWithGalaxies =
        lines.fold(hashSetOf<Int>(), { acc, s ->
            s.forEachIndexed { index, c ->
                if (c == '#') {
                    acc.add(index)
                }
            }
            acc
        })

    var rowOffset = 0
    var galaxyCoordinates =
        lines.foldIndexed(mutableListOf<Pair<Long, Long>>(), { row, acc, s ->
            var columnOffset = 0
            if (!s.contains("#")) {
                rowOffset += expandFactor - 1
            } else {
                s.forEachIndexed { col, c ->
                    if (!columnsWithGalaxies.contains(col)) {
                        columnOffset += expandFactor - 1
                    } else if (c == '#') {
                        acc.add(Pair(row.toLong() + rowOffset, col.toLong() + columnOffset))
                    }
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

fun part1(lines: List<String>): Long {
    return sumOfDistancesBetweenGalaxies(lines, 2)
}

fun part2(
    lines: List<String>,
    expandFactor: Int,
): Long {
    return sumOfDistancesBetweenGalaxies(lines, expandFactor)
}
