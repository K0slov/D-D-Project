package com.base.program.Interface;

import java.util.List;
import com.base.program.Entities.Hero;

public interface IRepository<T>
    {
         List<T> Lista();
         T RetornaPorId(int id);
         void Insere(T hero);
         void Atualiza(int id, T hero);
         Hero ProximoId();         
    }

    