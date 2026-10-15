package com.example.lab_6

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class WizardTest {

    private lateinit var evilWizard: Wizard

    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }

    @Test
    fun castSpell_explosion_successful() {
        val damageDealt = evilWizard.castSpell("Explosion")

        Assert.assertEquals(30, damageDealt)
        Assert.assertEquals(20, evilWizard.mana)
    }

    @Test
    fun castSpell_explosion_unsuccessful() {
        evilWizard.mana = 5
        val damageDealt = evilWizard.castSpell("Explosion")

        Assert.assertEquals(0, damageDealt)
        Assert.assertEquals(5, evilWizard.mana)
    }

    @Test
    fun castSpell_frostbite_successful() {
        val damageDealt = evilWizard.castSpell("Frostbite")

        Assert.assertEquals(20, damageDealt)
        Assert.assertEquals(25, evilWizard.mana)
    }

    @Test
    fun castSpell_frostbite_unsuccessful() {
        evilWizard.mana = 3
        val damageDealt = evilWizard.castSpell("Frostbite")

        Assert.assertEquals(0, damageDealt)
        Assert.assertEquals(3, evilWizard.mana)
    }
}