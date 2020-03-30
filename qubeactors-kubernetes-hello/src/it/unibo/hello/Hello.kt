/* Generated by AN DISI Unibo */ 
package it.unibo.hello

import it.unibo.kactor.*
import alice.tuprolog.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
	
class Hello ( name: String, scope: CoroutineScope ) : ActorBasicFsm( name, scope){
 	
	override fun getInitialState() : String{
		return "s0"
	}
		
	override fun getBody() : (ActorBasicFsm.() -> Unit){
		return { //this:ActionBasciFsm
				state("s0") { //this:State
					action { //it:State
						itunibo.qubeactor.probes.httpProbe.create(myself ,"/probe", 9999 )
					}
					 transition( edgeName="goto",targetState="waitGreetings", cond=doswitch() )
				}	 
				state("waitGreetings") { //this:State
					action { //it:State
					}
					 transition(edgeName="t00",targetState="greet",cond=whenDispatch("greet"))
				}	 
				state("greet") { //this:State
					action { //it:State
						if( checkMsgContent( Term.createTerm("greet(Name)"), Term.createTerm("greet(Name)"), 
						                        currentMsg.msgContent()) ) { //set msgArgList
								println("Hello ${payloadArg(0)}")
						}
					}
					 transition( edgeName="goto",targetState="waitGreetings", cond=doswitch() )
				}	 
			}
		}
}
