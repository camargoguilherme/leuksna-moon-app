package com.costular.leuksna_moon_phases.presentation.settings

import com.costular.leuksna_moon_phases.domain.model.Location
import com.costular.leuksna_moon_phases.domain.model.MeasureUnit
import io.uniflow.core.flow.UIState

data class SettingsState(
    val measureUnit: MeasureUnit = MeasureUnit.KM,
    val showStarsBackgroundEnabled: Boolean = true,
    val location: Location = Location.NotSet
): UIState()