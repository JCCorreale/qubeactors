/* Generated by AN DISI Unibo */ 
package it.unibo.hellocontext
import it.unibo.kactor.QakContext
import it.unibo.kactor.sysUtil
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
	QakContext.createContexts(
	        "172.20.128.1", this, "greeterdocker.pl", "sysRules.pl"
	)
}

