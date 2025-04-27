
More to Be Added Soon
# Relics Plugin

**RelicsPlugin** is a custom Minecraft Paper plugin that introduces a special relic system where players can obtain powerful relic items, each granting unique potion effects and attribute boosts.
Inspired by another server that shut down: **_Maestrea_**. 
---
## What does it do: Overview

Weak mobs will now have a chance to drop relic fragments, and upon collecting 8 of them and putting them into the crafting table along with a gold block, you will create a relic.

A Relic is an item which holds a bunch of weapons and armor, and on right click you will open a relic. 


---

## ✨ Features

- 💎 Custom **Relic Items** with fancy gradient-colored names and enchants and Attributes and potion effects
- 🎨 **Relic Fragments** that can be crafted into full relics
- ⚡ Each **Relic** gives **unique Potion Effects** when held
- 🛡️ Relics can boost player **attributes** (e.g., +Max Health)
- 🛠️ Fully extendable to add more relics easily

---

## 🏗 Project Structure

```plaintext
liquidburn1.relicsPlugin
├── RelicsPlugin.java             # Main plugin class
├── Items/
│   └── RelicItems.java            # Defines both relics and fragments
│   └── RelicLoot/                 # Defines all the relicitems that can be given from a relic
│       └── Axes/     
│    └── ArchaicLoot/              # Defines all the Archaic Items that can be given from a relic
│       └── Axes/                 
│   └──Effects/
│       └── RelicEffectRegistry.java   # Maps all the relic names with a List of their potion effects
│        └── Relicpotioneffects.java   # Has the logic to go over the 6 Equipment slots for each player ever 7secs to give pot effects
├── Commands/
│   └── RelicCommandRegistrar.java # /giverelicitem command registration
├── Listeners/
│   └── RelicEffectListener.java   # Scheduled task to check and apply relic effects
