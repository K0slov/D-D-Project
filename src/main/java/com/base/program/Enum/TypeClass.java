package com.base.program.Enum;

    public enum TypeClass
    {
        Wizard(1),
        Archer(2),
        WarriorIndisponivel (3),
        PaladinIndisponivel (4),
        NecromancerIndisponivel (5);
    
    
        final int classeHeroi;
        TypeClass(int valorOpcao){
        classeHeroi = valorOpcao;
    }}
    //  public enum LifeClass
    //  {
    //      Wizard (80),
    //      Archer = 60,
    //      Warrior = 90,
    //      Paladin = 70,
    //      Necromancer = 50,
    //  }

