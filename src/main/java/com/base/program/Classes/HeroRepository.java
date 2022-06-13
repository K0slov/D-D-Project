package com.base.program.Classes;

import java.util.LinkedList;

import com.base.program.Entities.Hero;
import com.base.program.Interface.IRepository;

    public class HeroRepository implements IRepository<Hero>
    {
        private LinkedList<Hero> listaHero = new LinkedList<Hero>();
        public void Atualiza(int id, Hero player)
        {
            listaHero = player.Id;
        }
        public void Exclui(int id)
        {
            listaHero.remove();
        }
        public void Insere(Hero player)
        {
            listaHero.add(player);
        }
        public LinkedList<Hero> Lista()
        {
            return listaHero;
        }
        public Hero ProximoId()
        {
            return listaHero.getFirst();
        }
        public Hero RetornaPorId(int id)
        {
            return listaHero.get(id);
        }
    }

