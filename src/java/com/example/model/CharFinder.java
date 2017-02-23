/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.*;
/**
 *
 * @author Sneha
 */
public class CharFinder {
    public List getChar(String spec) {
    List TWch = new ArrayList();
    if(spec.equals("Werewolf"))
        {
            TWch.add("Scott");
            TWch.add("Derek");
            TWch.add("Liam");
            TWch.add("Ennis");
            TWch.add("Deucalion");
            TWch.add("Kali");
            TWch.add("Ennis");
            TWch.add("Aiden");
            TWch.add("Ethan");
            TWch.add("Peter");
            TWch.add("Cora");
            TWch.add("Satomi");
            TWch.add("Brett");
        }
    if(spec.equals("Human"))
        {
            TWch.add("Stiles");
            TWch.add("Deaton");
            TWch.add("Alison");
            TWch.add("Chris");
            TWch.add("Melissa");
            TWch.add("Sheriff");
            TWch.add("Ken");
            TWch.add("Victoria");
            TWch.add("Gerard");
            TWch.add("Jennifer");
            TWch.add("Morrell");
            TWch.add("Braeden");
            TWch.add("Mason");
        }
    else if(spec.equals("Kanima"))
        {
            TWch.add("Jackson");
        }
    
    else if(spec.equals("Kitsunae"))
        {
            TWch.add("Kira");
            TWch.add("Noshiko");
        }
    else if(spec.equals("Banshee"))
        {
            TWch.add("Lydia");
            TWch.add("Lorraine");
            TWch.add("Meredith");
        }
    else if(spec.equals("Werecoyote"))
        {
            TWch.add("Malia");
        }
    else if(spec.equals("Werejaguar"))
        {
            TWch.add("Kate");
        }
    else if(spec.equals("Hellhound"))
        {
            TWch.add("Parrish");
        }
    else if(spec.equals("Chimera"))
        {
            TWch.add("Theo");
            TWch.add("Tracey");
            TWch.add("Josh");
            TWch.add("Hayden");
            TWch.add("Cory");
            TWch.add("Donovan");
        }
    return(TWch);
    }
}

