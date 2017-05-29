package com.paulosalgado.klickerhero

import com.paulosalgado.klickerhero.Tier.Companion.getTierForLevel

data class Kareer(var kount: Int = 0,
                  var tier: Tier = Tier.Baby) {

    fun incrementKount() {

        kount++

        if (kount > tier.maxKlicks) {
            tier = getTierForLevel(tier.level + 1)
        }

    }

}
