package com.base.program.Entities;

import java.util.LinkedList;

import com.base.program.Classes.dadosBase;
import com.base.program.Enum.TypeClass;

    public class Hero<get> extends dadosBase
    {
        public Hero(LinkedList<Hero> id, String name, int level, TypeClass heroType, int life, int force)
        {
            this.Id = id;
            this.Name = name;
            this.Level = level;
            this.HeroType = heroType;
            this.Life = life;
            this.Excluido = false;
            this.Force = force;
        }
        public Hero(int id2, String name2, int level2, TypeClass heroType2, int life2, int force2) {
        }
        public LinkedList<Hero> Id; { get set; }
        public String Name; { get set; }
        public int Level;
        public TypeClass HeroType; {get set; }
        private boolean Excluido; { get set; }
        public int Life;
        public int Force;

        public String Attack(int Bonus)
        {
            return this.Name + " Atacou usando bola de fogo";
        }

        public String toString()
        {
            
            String retorno = "";
            retorno += "Nome: " + this.Name;
            retorno += "Classe: " + this.HeroType;
            retorno += "Nivel: " + this.Level;
            retorno += "Life: " + this.Life;
            retorno += "Força: " + this.Force;
            retorno += "Excluido: " + this.Excluido;
            
            return retorno;
        }

        public String retornaTitulo()
        {
            return this.Name;
        }
        public LinkedList<Hero> retornaId()
        {
            return this.Id;
        }
        public boolean retornaExcluido()
        {
            return this.Excluido;
        }
        public void Excluir()
        {
            this.Excluido = true;
        }
    }
