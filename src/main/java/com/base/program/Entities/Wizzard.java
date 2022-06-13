package com.base.program.Entities;

import com.base.program.Enum.TypeClass;

public class Wizzard extends Hero
    {
        public Wizzard(int id, String name, int level, TypeClass heroType, int life, int force) {
            super(id, name, level, heroType, life, force);
        {
            this.Id = Id;
            this.Name = Name;
            this.Level = Level;
            this.HeroType = (TypeClass)HeroType;
            this.Life = Life;
            this.Force = Force;
        }
    }
        
        public String Attack(int Bonus)
        {
            if(Bonus > 6){
                return this.Name + " Ataque magico super efetivo, bonus no ataque de " + Bonus + "\n";
            }else if(Bonus > 0){
                return this.Name + " Ataque magico com bonus no ataque de " + Bonus + "\n";
            }else if (Bonus < 0){
                return this.Name + " Ataque magico não efetivo" + "\n";
            }else{
            return this.Name + " Atacou usando bola de fogo" + "\n";
            }
            
        }
        
    }