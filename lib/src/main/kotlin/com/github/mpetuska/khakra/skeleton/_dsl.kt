package com.github.mpetuska.khakra.skeleton

import com.github.mpetuska.khakra.KhakraDSL
import com.github.mpetuska.khakra.kt.Builder
import com.github.mpetuska.khakra.kt.KhakraComponent
import react.RBuilder
import react.RElementBuilder
import react.ReactElement

@KhakraDSL
public inline fun RBuilder.Skeleton(
  noinline props: Builder<SkeletonProps> = {},
  crossinline block: Builder<RElementBuilder<SkeletonProps>> = {},
): ReactElement = KhakraComponent(Skeleton, props, block)

@KhakraDSL
public inline fun RBuilder.SkeletonText(
  noinline props: Builder<SkeletonTextProps> = {},
  crossinline block: Builder<RElementBuilder<SkeletonTextProps>> = {},
): ReactElement = KhakraComponent(SkeletonText, props, block)

@KhakraDSL
public inline fun RBuilder.SkeletonCircle(
  noinline props: Builder<SkeletonProps> = {},
  crossinline block: Builder<RElementBuilder<SkeletonProps>> = {},
): ReactElement = KhakraComponent(SkeletonCircle, props, block)
