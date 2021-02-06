@file:JsModule("@chakra-ui/checkbox/dist/esm/checkbox-icon")

package io.github.mpetuska.khakra.checkbox

import io.github.mpetuska.khakra.system.HTMLChakraProps
import react.RClass

public external interface CheckboxIconProps : HTMLChakraProps

/**
 * CheckboxIcon is used to visually indicate the checked or indeterminate
 * state of a checkbox.
 *
 * @todo allow users pass their own icon svgs
 */
public external val CheckboxIcon: RClass<CheckboxIconProps>
