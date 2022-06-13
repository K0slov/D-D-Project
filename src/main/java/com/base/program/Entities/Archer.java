package com.base.program.Entities;

import com.base.program.Enum.TypeClass;

public class Archer extends Hero
    {
        public Archer(int id, String name, int level, TypeClass heroType, int life, int force) {
        super(id, name, level, heroType, life, force);

        this.Id = Id;
        this.Name = Name;
        this.Level = Level;
        this.HeroType = (TypeClass)HeroType;
        this.Life = Life;
        this.Force = Force;
        }
		
        // private void Hero(int id, String name, int level, TypeClass heroType, int life, int force) {
        // }
        public String Attack(int Bonus)
        {
            if(Bonus > 6){
                return this.Name + " Ataque com a flecha super efetivo, bonus no ataque de " + Bonus + "\n";
            }else if(Bonus > 0){
                return this.Name + " Ataque com a flecha com bonus no ataque de " + Bonus + "\n";
            }else if (Bonus < 0){
                return this.Name + " Ataque com a flecha não efetivo" + "\n";
            }else{
            return this.Name + " Atirou uma flecha" + "\n";
            }
        }
    }