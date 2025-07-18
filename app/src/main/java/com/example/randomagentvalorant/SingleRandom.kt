package com.example.randomagentvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.random.Random

class SingleRandom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_random)

        val random: Button = findViewById(R.id.random)
        val back: Button = findViewById(R.id.back)

        val agentcheck = listOf<CheckBox>(
            findViewById(R.id.check_Jett),
            findViewById(R.id.check_Raze),
            findViewById(R.id.check_Breach),
            findViewById(R.id.check_Omen),
            findViewById(R.id.check_Brimstone),
            findViewById(R.id.check_Phoenix),
            findViewById(R.id.check_Sage),
            findViewById(R.id.check_Sova),
            findViewById(R.id.check_Viper),
            findViewById(R.id.check_Cypher),
            findViewById(R.id.check_Reyna),
            findViewById(R.id.check_Killjoy),
            findViewById(R.id.check_Skye),
            findViewById(R.id.check_Yoru),
            findViewById(R.id.check_Astra),
            findViewById(R.id.check_Kayo),
            findViewById(R.id.check_Chamber),
            findViewById(R.id.check_Neon),
            findViewById(R.id.check_Fade),
            findViewById(R.id.check_Harbor),
            findViewById(R.id.check_Gekko),
            findViewById(R.id.check_Deadlock),
            findViewById(R.id.check_Iso)
        )

        val agentNames = mutableListOf(
            "Jett", "Raze", "Breach", "Omen", "Brimstone", "Phoenix", "Sage",
            "Sova", "Viper", "Cypher", "Reyna", "Killjoy", "Skye", "Yoru", "Astra",
            "Kayo", "Chamber", "Neon", "Fade", "Harbor", "Gekko", "Deadlock", "Iso"
        )

        agentcheck.forEachIndexed { index, checkBox ->
            checkBox.text = agentNames[index]
        }

        val controller: CheckBox = findViewById(R.id.controller)
        val duelist: CheckBox = findViewById(R.id.duelist)
        val initiator: CheckBox = findViewById(R.id.initiator)
        val sentinel: CheckBox = findViewById(R.id.sentinel)

        val controllerAgent = listOf("Omen", "Brimstone", "Viper", "Astra", "Harbor")
        val duelistAgent = listOf("Jett", "Raze", "Phoenix", "Reyna", "Yoru", "Neon", "Iso")
        val initiatorAgent = listOf("Breach", "Sova", "Skye", "Kayo", "Fade", "Gekko")
        val sentinelAgent = listOf("Sage", "Cypher", "Killjoy", "Chamber", "Deadlock")

        val controllerAndduelistAndinitiator = controllerAgent + duelistAgent + initiatorAgent
        val controllerAndduelistAndsentinel = controllerAgent + duelistAgent + sentinelAgent
        val controllerAndinitiatorAndsentinel = controllerAgent + initiatorAgent + sentinelAgent
        val duelistAndinitiatorAndsentinel = duelistAgent + initiatorAgent + sentinelAgent

        val controllerAndduelist = controllerAgent + duelistAgent
        val controllerAndinitiator = controllerAgent + initiatorAgent
        val controllerAndsentinel = controllerAgent + sentinelAgent

        val duelistAndinitiator = duelistAgent + initiatorAgent
        val duelistAndsentinel = duelistAgent + sentinelAgent

        val initiatorAndsentinel = initiatorAgent + sentinelAgent

        random.setOnClickListener {
            //ฟังก์ชันสุ่มตัว Controller, Duelist, Initiator, Sentinel
            if (agentcheck.isNotEmpty() && controller.isChecked && duelist.isChecked &&
                initiator.isChecked && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Controller, Duelist, Initiator, Sentinel ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && controller.isChecked && duelist.isChecked &&
                    initiator.isChecked && sentinel.isChecked) {
                    val selectedAgents = agentcheck.filter { it.isChecked }
                    val selectedAgentNames = selectedAgents.map { it.text.toString() }

                    if (agentNames.isNotEmpty()) {
                        val randomIndex = Random.nextInt(agentNames.size)
                        val randomAgent = agentNames[randomIndex]
                        val intent = Intent(this, ResultSingleRandom::class.java)
                        intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                        intent.putExtra("randomAgent", randomAgent)
                        startActivity(intent)
                        finish()
                    }
                } //ฟังก์ชันสุ่มตัว Controller, Duelist, Initiator
            else if (agentcheck.isNotEmpty() && controller.isChecked && duelist.isChecked &&
                initiator.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAndduelistAndinitiator)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Controller, Duelist, Initiator ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && controller.isChecked && duelist.isChecked &&
                initiator.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(controllerAndduelistAndinitiator)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Controller, Duelist, Sentinel
            else if (agentcheck.isNotEmpty() && controller.isChecked && duelist.isChecked &&
                sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAndduelistAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Controller, Duelist, Sentinel ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && controller.isChecked && duelist.isChecked &&
                sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(controllerAndduelistAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Controller, Initiator, Sentinel
            else if (agentcheck.isNotEmpty() && controller.isChecked && initiator.isChecked &&
                sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAndinitiatorAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Controller, Initiator, Sentinel ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && controller.isChecked && initiator.isChecked &&
                sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(controllerAndinitiatorAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Duelist , Initiator, Sentinel
            else if (agentcheck.isNotEmpty() && duelist.isChecked && initiator.isChecked &&
                sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(duelistAndinitiatorAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Duelist, Initiator, Sentinel ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && duelist.isChecked && initiator.isChecked &&
                sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(duelistAndinitiatorAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Controller, Duelist
            else if (agentcheck.isNotEmpty() && controller.isChecked && duelist.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAndduelist)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Controller, Duelist ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && controller.isChecked && duelist.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(controllerAndduelist)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Controller, Initiator
            else if (agentcheck.isNotEmpty() && controller.isChecked && initiator.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAndinitiator)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Controller, Initiator ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && controller.isChecked && initiator.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAndinitiator)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Controller, Sentinel
            else if (agentcheck.isNotEmpty() && controller.isChecked && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(controllerAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Controller, Sentinel ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && controller.isChecked && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(controllerAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Initiator, Sentinel
            else if (agentcheck.isNotEmpty() && initiator.isChecked && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(initiatorAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Initiator, Sentinel ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && initiator.isChecked && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(initiatorAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Duelist, Sentinel
            else if (agentcheck.isNotEmpty() && duelist.isChecked && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(duelistAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Duelist, Sentinel ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && duelist.isChecked && sentinel.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(duelistAndsentinel)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Duelist, Initiator
            else if (agentcheck.isNotEmpty() && duelist.isChecked && initiator.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)
                agentNames.retainAll(duelistAndinitiator)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } //ฟังก์ชันสุ่มตัว Duelist, Initiator ถ้าไม่เลือกตัว
            else if (agentcheck.isEmpty() && duelist.isChecked && initiator.isChecked) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.retainAll(duelistAndinitiator)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }//ฟังก์ชันสุ่มตัว Controller
            else if (agentcheck.isNotEmpty() && controller.isChecked) {
                        val selectedAgents = agentcheck.filter { it.isChecked }
                        val selectedAgentNames = selectedAgents.map { it.text.toString() }

                        agentNames.removeAll(selectedAgentNames)
                        agentNames.retainAll(controllerAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                            val intent = Intent(this, ResultSingleRandom::class.java)
                            intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                            intent.putExtra("randomAgent", randomAgent)
                            startActivity(intent)
                            finish()
                        }
                    } else if (agentcheck.isEmpty() && controller.isChecked) {

                        agentNames.retainAll(controllerAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                            val intent = Intent(this, ResultSingleRandom::class.java)
                            intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                            intent.putExtra("randomAgent", randomAgent)
                            startActivity(intent)
                            finish()
                        }
                    } // ฟังก์ชันสุ่มตัว Duelist
                    else  if (agentcheck.isNotEmpty() && duelist.isChecked) {
                        val selectedAgents = agentcheck.filter { it.isChecked }
                        val selectedAgentNames = selectedAgents.map { it.text.toString() }

                        agentNames.removeAll(selectedAgentNames)
                        agentNames.retainAll(duelistAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                            val intent = Intent(this, ResultSingleRandom::class.java)
                            intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                            intent.putExtra("randomAgent", randomAgent)
                            startActivity(intent)
                            finish()
                        }
                    } else if (agentcheck.isEmpty() && duelist.isChecked) {

                        agentNames.retainAll(duelistAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                            val intent = Intent(this, ResultSingleRandom::class.java)
                            intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                            intent.putExtra("randomAgent", randomAgent)
                            startActivity(intent)
                            finish()
                        }
                    } // ฟังก์ชันสุ่มตัว Initiator
                    else  if (agentcheck.isNotEmpty() && initiator.isChecked) {
                        val selectedAgents = agentcheck.filter { it.isChecked }
                        val selectedAgentNames = selectedAgents.map { it.text.toString() }

                        agentNames.removeAll(selectedAgentNames)
                        agentNames.retainAll(initiatorAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                            val intent = Intent(this, ResultSingleRandom::class.java)
                            intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                            intent.putExtra("randomAgent", randomAgent)
                            startActivity(intent)
                            finish()
                        }
                    } else if (agentcheck.isEmpty() && initiator.isChecked) {

                        agentNames.retainAll(initiatorAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                            val intent = Intent(this, ResultSingleRandom::class.java)
                            intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                            intent.putExtra("randomAgent", randomAgent)
                            startActivity(intent)
                            finish()
                        }
                    } // ฟังก์ชันสุ่มตัว Sentinel
                    else  if (agentcheck.isNotEmpty() && sentinel.isChecked) {
                        val selectedAgents = agentcheck.filter { it.isChecked }
                        val selectedAgentNames = selectedAgents.map { it.text.toString() }

                        agentNames.removeAll(selectedAgentNames)
                        agentNames.retainAll(sentinelAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                            val intent = Intent(this, ResultSingleRandom::class.java)
                            intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                            intent.putExtra("randomAgent", randomAgent)
                            startActivity(intent)
                            finish()
                        }
                    } else if (agentcheck.isEmpty() && sentinel.isChecked) {

                        agentNames.retainAll(sentinelAgent)

                        if (agentNames.isNotEmpty()) {
                            val randomIndex = Random.nextInt(agentNames.size)
                            val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else if (agentcheck.isNotEmpty()) {
                val selectedAgents = agentcheck.filter { it.isChecked }
                val selectedAgentNames = selectedAgents.map { it.text.toString() }

                agentNames.removeAll(selectedAgentNames)

                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            } else {
                if (agentNames.isNotEmpty()) {
                    val randomIndex = Random.nextInt(agentNames.size)
                    val randomAgent = agentNames[randomIndex]
                    val intent = Intent(this, ResultSingleRandom::class.java)
                    intent.putStringArrayListExtra("agentNames", ArrayList(agentNames))
                    intent.putExtra("randomAgent", randomAgent)
                    startActivity(intent)
                    finish()
                }
            }
        }

        back.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
        }
    }
}