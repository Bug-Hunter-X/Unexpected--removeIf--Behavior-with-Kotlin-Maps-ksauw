# Kotlin `removeIf` Bug with Maps

This repository demonstrates an uncommon behavior when using the `removeIf` function with `MutableMap` in Kotlin. While `removeIf` works as expected with `MutableList` and `MutableSet`, it produces unexpected results with maps.  The provided code showcases the issue and its solution.

## Problem

The `removeIf` function, when applied to a `MutableMap`, removes entries based on the predicate's result. However, the predicate's input is a `Map.Entry`, not just the key or value. This can lead to subtle errors if you intend to remove items based solely on the key or value.