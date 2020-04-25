import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.event.*;


public class Main {
    
    //functions
    
    public void chM()//changer la masse
    {
        String from=c1_masse.getSelectedItem().toString();
        String to=c2_masse.getSelectedItem().toString();
        double x;
        
        try{
        
        if(t1_masse.getText().isEmpty() )
            x=0;
        else
            x=Double.valueOf(t1_masse.getText());
        
        
        
        if(! from.equals(to) )
        {
            switch(from)
            {
            case "t":
                switch(to)
                {
                    case "q"://t -> q
                        t2_masse.setText(String.valueOf(x*10));
                        break;
                    case "Kg":// t -> kg
                        t2_masse.setText(String.valueOf(x*1000));
                        break;
                    case "g":// t->g
                        t2_masse.setText(String.valueOf(x*Math.pow(10,6) ) );
                        break;
                    case "mg"://t->mg
                        t2_masse.setText(String.valueOf(x*Math.pow(10,9)));
                        break;
                    case "livres"://t->liv
                        t2_masse.setText(String.valueOf(x*2204.623));
                        break;
                }
                break;
            case "q":
                switch(to)
                {
                    case "t"://q->t
                       t2_masse.setText(String.valueOf(x/10) );
                       break;
                    case "Kg"://q->kg
                        t2_masse.setText(String.valueOf(x*100) );
                        break;
                    case "g"://q->g
                        t2_masse.setText(String.valueOf(x*100000) );
                        break;
                    case "mg"://q->mg
                        t2_masse.setText(String.valueOf(x*Math.pow(10,8)) );
                        break;
                    case "livres"://q->livres
                        t2_masse.setText(String.valueOf(x/10 * 2204.623) );
                        break;
                }
                break;
            case "Kg":
                switch(to)
                {
                    case "t"://kg->t
                        t2_masse.setText(String.valueOf(x/1000));
                        break;
                    case "q"://kg->q
                        t2_masse.setText(String.valueOf(x/100));
                        break;
                    case "g"://kg->g
                        t2_masse.setText(String.valueOf(x*1000));
                        break;
                    case "mg"://kg->mg
                        t2_masse.setText(String.valueOf(x*1000000));
                        break;
                    case "livres"://kg->livres
                        t2_masse.setText(String.valueOf(x/1000 *2204.623));
                        break;
                }
                break;
            case "g":
                switch(to)
                {
                    case "t"://g->t
                        t2_masse.setText(String.valueOf(x/1000000));
                        break;
                    case "q"://g->q
                        t2_masse.setText(String.valueOf(x/100000));
                        break;
                    case "Kg"://g->kg
                        t2_masse.setText(String.valueOf(x/1000));
                        break;
                    case "mg"://g->mg
                        t2_masse.setText(String.valueOf(x*1000));
                        break;
                    case "livres"://g->livres
                        t2_masse.setText(String.valueOf(x/1000000 *2204.623));
                        break;
                        
                }
                break;
            case "mg":
                switch(to)
                {
                    case "g"://mg->g
                        t2_masse.setText(String.valueOf(x/1000));
                        break;
                    case "Kg"://mg->kg
                        t2_masse.setText(String.valueOf(x*Math.pow(10,-6)));
                        break;
                    case "q"://mg->q
                        t2_masse.setText(String.valueOf(x*Math.pow(10,-8)));
                        break;
                    case "t"://mg->t
                        t2_masse.setText(String.valueOf(x*Math.pow(10,-9)));
                        break;
                    case "livres"://mg->livres
                        t2_masse.setText(String.valueOf(x*Math.pow(10,-9) * 2204.623));
                        break;
                }
                break;
            case "livres":
                switch(to)
                {
                    case "t"://livres->t
                        t2_masse.setText(String.valueOf(x/2204.623));
                        break;
                    case "q"://livres->q
                        t2_masse.setText(String.valueOf(x/2204.623 *10));
                        break;
                    case "Kg"://livres->Kg
                        t2_masse.setText(String.valueOf(x/2204.623 * 1000));
                        break;
                    case "g"://livres->g
                        t2_masse.setText(String.valueOf(x/2204.623 * Math.pow(10,6)));
                        break;
                    case "mg"://livres->mg
                        t2_masse.setText(String.valueOf(x/2204.623 * Math.pow(10,9)));
                        break;
                }
                break;
            }
            
        }
        else
        {
            t2_masse.setText(t1_masse.getText());
        }
        
        }//end try
        catch(NumberFormatException e)
        {
            t2_masse.setText("Error! enter a postive integer");
        }
                

    }
    //end chM
    
    
    public void chL()//changer le longueur
    {
        
        try
        {
        
        String from=c1_longueur.getSelectedItem().toString();
        String to=c2_longueur.getSelectedItem().toString();
        double x;
        
        
            if(t1_longueur.getText().isEmpty() )
            x=0;
        else
            x=Double.valueOf(t1_longueur.getText());
        
        
            
            
        
        
        
        if(! from.equals(to) )
        {
            switch(from)
            {
            case "Km":
                switch(to)
                {
                    case "m"://km -> m
                        t2_longueur.setText(String.valueOf(x*1000));
                        break;
                    case "cm":// km -> cm
                        t2_longueur.setText(String.valueOf(x*100000));
                        break;
                    case "mm":// km->mm
                        t2_longueur.setText(String.valueOf(x*1000000 ) );
                        break;
                    case "µm"://km->µm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,9)));
                        break;
                    case "nm"://km->nm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,12)));
                        break;
                    case "pouces"://km->pouce
                        t2_longueur.setText(String.valueOf(x*39370.08));
                        break;
                    case "pieds"://km->pieds
                        t2_longueur.setText(String.valueOf(x*3280.84));
                        break;
                    case "yards"://km->yards
                        t2_longueur.setText(String.valueOf(x*1093.613));
                        break;
                    case "miles"://km->miles
                        t2_longueur.setText(String.valueOf(x*0.621371));
                        break;
                    
                }
                break;
            case "m":
                switch(to)
                {
                    case "Km"://m->km
                       t2_longueur.setText(String.valueOf(x/1000) );
                       break;
                    case "cm"://m->cm
                        t2_longueur.setText(String.valueOf(x*100) );
                        break;
                    case "mm"://m->mm
                        t2_longueur.setText(String.valueOf(x*1000) );
                        break;
                    case "µm"://m->µm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,6)) );
                        break;
                    case "nm"://m->nm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,9)) );
                        break;
                    case "pouces"://m->pouces
                        t2_longueur.setText(String.valueOf(x*39.37008) );
                        break;
                    case "pieds"://m->pieds
                        t2_longueur.setText(String.valueOf(x*3.28084) );
                        break;
                    case "yards"://m->yards
                        t2_longueur.setText(String.valueOf(x*1.093613) );
                        break;
                    case "miles"://m->miles
                        t2_longueur.setText(String.valueOf(x*0.000621) );
                        break;
                }
                break;
            case "cm":
                switch(to)
                {
                    case "Km"://cm->km
                        t2_longueur.setText(String.valueOf(x/100000));
                        break;
                    case "m"://cm->m
                        t2_longueur.setText(String.valueOf(x/100));
                        break;
                    case "mm"://cm->mm
                        t2_longueur.setText(String.valueOf(x*10));
                        break;
                    case "µm"://cm->µm
                        t2_longueur.setText(String.valueOf(x*10000));
                        break;
                    case "nm"://cm->nm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,7)));
                        break;
                    case "pouces"://cm->pouces
                        t2_longueur.setText(String.valueOf(x/100*39.37008));
                        break;
                    case "pieds"://cm->pieds
                        t2_longueur.setText(String.valueOf(x/100*3280.84));
                        break;
                    case "yards"://cm->yards
                        t2_longueur.setText(String.valueOf(x/100*1.093613));
                        break;
                    case "miles"://cm->miles
                        t2_longueur.setText(String.valueOf(x/100*0.000621));
                        break;
                }
                break;
            case "mm":
                switch(to)
                {
                    case "Km"://mm->Km
                        t2_longueur.setText(String.valueOf(x/1000000));
                        break;
                    case "m"://mm->m
                        t2_longueur.setText(String.valueOf(x/1000));
                        break;
                    case "cm"://mm->cm
                        t2_longueur.setText(String.valueOf(x/10));
                        break;
                    case "µm"://mm->µm
                        t2_longueur.setText(String.valueOf(x*1000));
                        break;
                    case "nm"://mm->nm
                        t2_longueur.setText(String.valueOf(x/1000000));
                        break;
                    case "pouces"://mm->pouces
                        t2_longueur.setText(String.valueOf(x/1000*39.37008));
                        break;
                    case "pieds"://mm->pieds
                        t2_longueur.setText(String.valueOf(x/1000*3.28084));
                        break;
                    case "yards"://mm->yards
                        t2_longueur.setText(String.valueOf(x/1000*1.093613));
                        break;
                    case "miles"://mm->miles
                        t2_longueur.setText(String.valueOf(x/1000*0.000621));
                        break;
                        
                }
                break;
            case "µm":
                switch(to)
                {
                    case "Km"://µm->km
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-9)));
                        break;
                    case "m"://um->m
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-6)));
                        break;
                    case "cm"://um->cm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-4)));
                        break;
                    case "mm"://um->mm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-3)));
                        break;
                    case "nm"://um->nm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,3) * 2204.623));
                        break;
                    case "pouces"://um->pouces
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-6)*39.37008));
                        break;
                    case "pieds"://um->pieds
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-6)*3.28084));
                        break;
                    case "yards"://um->yards
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-6)*1.093613));
                        break;
                    case "miles"://um->miles
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-6)*0.000621));
                        break;
                }
                break;
            case "nm":
                switch(to)
                {
                    case "Km"://nm->km
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-12)));
                        break;
                    case "m"://nm->m
                        t2_longueur.setText(String.valueOf(x*Math.pow(10,-9)));
                        break;
                    case "cm"://nm->cm
                        t2_longueur.setText(String.valueOf(x*Math.pow(10, -7)));
                        break;
                    case "mm"://nm->mm
                        t2_longueur.setText(String.valueOf(x * Math.pow(10,-6)));
                        break;
                    case "µm"://nm->um
                        t2_longueur.setText(String.valueOf(x* Math.pow(10,-3)));
                        break;
                    case "pouces"://nm->pouces
                        t2_longueur.setText(String.valueOf(x* Math.pow(10,-9)*39.37008));
                        break;
                    case "pieds"://nm->pieds
                        t2_longueur.setText(String.valueOf(x* Math.pow(10,-9)*3.28084));
                        break;
                    case "yards"://nm->yards
                        t2_longueur.setText(String.valueOf(x* Math.pow(10,-9)*1.093613));
                        break;
                    case "miles"://nm->miles
                        t2_longueur.setText(String.valueOf(x* Math.pow(10,-9)*0.000621));
                        break;
                }
                break;
                
            case "pouces":
                switch(to)
                {
                    case "m"://pouces->m
                        t2_longueur.setText(String.valueOf(x/39.37008));
                        break;
                    case "Km"://pouces->km
                        t2_longueur.setText(String.valueOf(x/39.37008 / 1000));
                        break;
                    case "cm"://pouces->cm
                        t2_longueur.setText(String.valueOf(x/39.37008*100));
                        break;
                    case "mm"://pouces->mm
                        t2_longueur.setText(String.valueOf(x/39.37008*1000));
                        break;
                    case "µm"://pouces->um
                        t2_longueur.setText(String.valueOf(x/39.37008*Math.pow(10,6)));
                        break;
                    case "nm"://pouces->nm
                        t2_longueur.setText(String.valueOf(x/39.37008*Math.pow(10, 9)));
                        break;
                    case "pieds"://pouces->pieds
                        t2_longueur.setText(String.valueOf(x/39.37008*3.28084));
                        break;
                    case "yards"://pouces->yards
                        t2_longueur.setText(String.valueOf(x/39.37008*1.093613));
                        break;
                    case "miles"://pouces->miles
                        t2_longueur.setText(String.valueOf(x/39.37008*0.000621));
                        break;
                }
                break;
            case "pieds":
                 switch(to)
                {
                    case "m"://pieds->m
                        t2_longueur.setText(String.valueOf(x/3.28084));
                        break;
                    case "Km"://pieds->km
                        t2_longueur.setText(String.valueOf(x/3.28084 / 1000));
                        break;
                    case "cm"://pieds->cm
                        t2_longueur.setText(String.valueOf(x/3.28084*100));
                        break;
                    case "mm"://pieds->mm
                        t2_longueur.setText(String.valueOf(x/3.28084*1000));
                        break;
                    case "µm"://pieds->um
                        t2_longueur.setText(String.valueOf(x/3.28084*Math.pow(10, 6)));
                        break;
                    case "nm"://pieds->nm
                        t2_longueur.setText(String.valueOf(x/3.28084*Math.pow(10, 9)));
                        break;
                    case "pouces"://pieds->pouces
                        t2_longueur.setText(String.valueOf(x/3.28084*39.37008));
                        break;
                    case "yards"://pieds->yards
                         t2_longueur.setText(String.valueOf(x/3.28084*1.093613));
                        break;
                    case "miles"://pieds->miles
                        t2_longueur.setText(String.valueOf(x/3.28084*0.000621));
                        break;
                }
                break;
            case "yards":
                 switch(to)
                {
                  case "m"://yards->m
                         t2_longueur.setText(String.valueOf(x/1.093613));
                        break;
                    case "Km"://yards->km
                        t2_longueur.setText(String.valueOf(x/1.093613 / 1000));
                        break;
                    case "cm"://yards->cm
                        t2_longueur.setText(String.valueOf(x/1.093613*100));
                        break;
                    case "mm"://yards->mm
                        t2_longueur.setText(String.valueOf(x/1.093613*1000));
                        break;
                    case "µm"://yards->um
                        t2_longueur.setText(String.valueOf(x/1.093613*Math.pow(10,6)));
                        break;
                    case "nm"://yards->nm
                        t2_longueur.setText(String.valueOf(x/1.093613*Math.pow(10, 9)));
                        break;
                    case "pieds"://yards->pieds
                        t2_longueur.setText(String.valueOf(x/1.093613*3.28084));
                        break;
                    case "pouces"://yards->pouces
                        t2_longueur.setText(String.valueOf(x/1.093613*39.37008));
                        break;
                    case "miles"://yards->miles
                        t2_longueur.setText(String.valueOf(x/1.093613*0.000621));
                        break;  
                }
                break;
            case "miles":
                 switch(to)
                {
                    case "m"://miles->m
                        t2_longueur.setText(String.valueOf(x/0.000621));
                        break;
                    case "Km"://miles->km
                        t2_longueur.setText(String.valueOf(x/0.000621 / 1000));
                        break;
                    case "cm"://miles->cm
                        t2_longueur.setText(String.valueOf(x/0.000621*100));
                        break;
                    case "mm"://miles->mm
                        t2_longueur.setText(String.valueOf(x/0.000621*1000));
                        break;
                    case "µm"://miles->um
                        t2_longueur.setText(String.valueOf(x/0.000621*Math.pow(10, 6)));
                        break;
                    case "nm"://miles->nm
                        t2_longueur.setText(String.valueOf(x/0.000621*Math.pow(10, 9)));
                        break;
                    case "pieds"://miles->pieds
                        t2_longueur.setText(String.valueOf(x/0.000621*3.28084));
                        break;
                    case "yards"://miles->yards
                        t2_longueur.setText(String.valueOf(x/0.000621*1.093613));
                        break;
                    case "pouces"://miles->pouces
                        t2_longueur.setText(String.valueOf(x/0.000621*39.37008));
                        break;
                }
                break;
            }
            
        }
        else
        {
            t2_longueur.setText(t1_longueur.getText());
        }
        
        
        }//end try
        catch(NumberFormatException e)
        {
            t2_longueur.setText("Error! enter a postive integer");
        }
        
    }
    //end chL
    
    
    public void chS()//changer la surface
    {
        String from=c1_surface.getSelectedItem().toString();
        String to=c2_surface.getSelectedItem().toString();
        double x;
        
        try{
        
        if(t1_surface.getText().isEmpty() )
            x=0;
        else
            x=Double.valueOf(t1_surface.getText());
        
        
        
        if(! from.equals(to) )
        {
            switch(from)
            {
            case "Km²":
                switch(to)
                {
                    case "ha"://km -> ha
                        t2_surface.setText(String.valueOf(x*100));
                        break;
                    case "a":// km -> a
                        t2_surface.setText(String.valueOf(x*10000));
                        break;
                    case "m²":// km->m
                        t2_surface.setText(String.valueOf(x*Math.pow(10,6) ) );
                        break;
                    case "cm²"://km->cm
                        t2_surface.setText(String.valueOf(x*Math.pow(10,10)));
                        break;
                    case "mm²"://km->mm
                        t2_surface.setText(String.valueOf(x*Math.pow(10, 12)));
                        break;
                }
                break;
            case "ha":
                switch(to)
                {
                    case "Km²"://ha->km
                       t2_surface.setText(String.valueOf(x/100) );
                       break;
                    case "a"://ha->a
                        t2_surface.setText(String.valueOf(x*100) );
                        break;
                    case "m²"://ha->m
                        t2_surface.setText(String.valueOf(x*10000) );
                        break;
                    case "cm²"://ha->cm
                        t2_surface.setText(String.valueOf(x*Math.pow(10,8)) );
                        break;
                    case "mm²"://ha->mm
                        t2_surface.setText(String.valueOf(x*Math.pow(10,10)) );
                        break;
                }
                break;
            case "a":
                switch(to)
                {
                    case "Km²"://a->km
                        t2_surface.setText(String.valueOf(x/10000));
                        break;
                    case "ha"://a->a
                        t2_surface.setText(String.valueOf(x/100));
                        break;
                    case "m²"://a->m
                        t2_surface.setText(String.valueOf(x*100));
                        break;
                    case "cm²"://a->cm
                        t2_surface.setText(String.valueOf(x*1000000));
                        break;
                    case "mm²"://a->mm
                        t2_surface.setText(String.valueOf(x*Math.pow(10,8)));
                        break;
                }
                break;
            case "m²":
                switch(to)
                {
                    case "Km²"://m->km
                        t2_surface.setText(String.valueOf(x*Math.pow(10,-6)));
                        break;
                    case "ha"://m->ha
                        t2_surface.setText(String.valueOf(x/10000));
                        break;
                    case "a"://m->a
                        t2_surface.setText(String.valueOf(x/100));
                        break;
                    case "cm²"://m->cm
                        t2_surface.setText(String.valueOf(x*10000));
                        break;
                    case "mm²"://m->mm
                        t2_surface.setText(String.valueOf(x*1000000));
                        break;
                        
                }
                break;
            case "cm²":
                switch(to)
                {
                    case "Km²"://cm->km
                        t2_surface.setText(String.valueOf(x*Math.pow(10,-10)));
                        break;
                    case "ha"://cm->ha
                        t2_surface.setText(String.valueOf(x*Math.pow(10,-8)));
                        break;
                    case "a"://cm->a
                        t2_surface.setText(String.valueOf(x*Math.pow(10,-6)));
                        break;
                    case "m²"://cm->m
                        t2_surface.setText(String.valueOf(x*Math.pow(10,-4)));
                        break;
                    case "mm²"://cm->mm
                        t2_surface.setText(String.valueOf(x*100 ));
                        break;
                }
                break;
            case "mm²":
                switch(to)
                {
                    case "Km²"://mm->km
                        t2_surface.setText(String.valueOf(x*Math.pow(10,-12)));
                        break;
                    case "ha"://mm->ha
                        t2_surface.setText(String.valueOf(x*Math.pow(10, -10)));
                        break;
                    case "a"://mm->a
                        t2_surface.setText(String.valueOf(x * Math.pow(10, -8)));
                        break;
                    case "m²"://mm->m
                        t2_surface.setText(String.valueOf(x * Math.pow(10,-6)));
                        break;
                    case "cm²"://mm->cm
                        t2_surface.setText(String.valueOf(x* Math.pow(10,-2)));
                        break;
                }
                break;
            }
            
        }
        else
        {
            t2_surface.setText(t1_surface.getText());
        }
        
        }//end try
        catch(NumberFormatException e)
        {
            t2_surface.setText("Error! enter a postive integer");
        }
                

    }
    //end chS
    
    
    
    public void chV()//changer le volume
    {
        String from=c1_volume.getSelectedItem().toString();
        String to=c2_volume.getSelectedItem().toString();
        double x;
        
        try{
        
        if(t1_volume.getText().isEmpty() )
            x=0;
        else
            x=Double.valueOf(t1_volume.getText());
        
        
        
        if(! from.equals(to) )
        {
            switch(from)
            {
            case "m³":
                switch(to)
                {
                    case "cm³"://m -> cm
                        t2_volume.setText(String.valueOf(x*Math.pow(10, 6)));
                        break;
                    case "mm³":// m -> mm
                        t2_volume.setText(String.valueOf(x*Math.pow(10,9)));
                        break;
                    case "L":// m->l
                        t2_volume.setText(String.valueOf(x*1000 ) );
                        break;
                    case "mL"://m->ml
                        t2_volume.setText(String.valueOf(x*Math.pow(10,6)));
                        break;
                    case "gallons"://m->g
                        t2_volume.setText(String.valueOf(x*1000*4.54));
                        break;
                }
                break;
            case "cm³":
                switch(to)
                {
                    case "m³"://cm->m
                       t2_volume.setText(String.valueOf(x*Math.pow(10,-6)) );
                       break;
                    case "mm³"://cm->mm
                        t2_volume.setText(String.valueOf(x*1000) );
                        break;
                    case "L"://cm->l
                        t2_volume.setText(String.valueOf(x*Math.pow(10, -3)) );
                        break;
                    case "mL"://cm->ml
                        t2_volume.setText(String.valueOf(x) );
                        break;
                    case "gallons"://ha->mm
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-3)*4.54) );
                        break;
                }
                break;
            case "mm³":
                switch(to)
                {
                    case "m³"://mm->m
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-9)));
                        break;
                    case "cm³"://mm->cm
                        t2_volume.setText(String.valueOf(x/1000));
                        break;
                    case "L"://mm->l
                        t2_volume.setText(String.valueOf(x*Math.pow(10, -6)));
                        break;
                    case "mL"://mm->ml
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-3)));
                        break;
                    case "gallons"://mm->g
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-6)*4.54));
                        break;
                }
                break;
            case "L":
                switch(to)
                {
                    case "m³"://m->km
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-6)));
                        break;
                    case "cm³"://m->ha
                        t2_volume.setText(String.valueOf(x/10000));
                        break;
                    case "mm³"://m->a
                        t2_volume.setText(String.valueOf(x/100));
                        break;
                    case "mL"://m->cm
                        t2_volume.setText(String.valueOf(x*10000));
                        break;
                    case "gallons"://m->mm
                        t2_volume.setText(String.valueOf(x*1000000));
                        break;
                        
                }
                break;
            case "mL":
                switch(to)
                {
                    case "m³"://cm->km
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-10)));
                        break;
                    case "cm³"://cm->ha
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-8)));
                        break;
                    case "mm³"://cm->a
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-6)));
                        break;
                    case "L"://cm->m
                        t2_volume.setText(String.valueOf(x*Math.pow(10,-4)));
                        break;
                    case "gallons"://cm->mm
                        t2_volume.setText(String.valueOf(x*100 ));
                        break;
                }
                break;
            case "gallons":
                switch(to)
                {
                    case "m³"://g->m
                        t2_volume.setText(String.valueOf(x/4.54*Math.pow(10,-3)));
                        break;
                    case "cm³"://g->cm
                        t2_volume.setText(String.valueOf(x/4.54*Math.pow(10, 3)));
                        break;
                    case "mm³"://g->cm
                        t2_volume.setText(String.valueOf(x/4.54 * Math.pow(10, 6)));
                        break;
                    case "L"://g->l
                        t2_volume.setText(String.valueOf(x/4.54 ));
                        break;
                    case "mL"://g->ml
                        t2_volume.setText(String.valueOf(x/4.54*1000));
                        break;
                }
                break;
            }
            
        }
        else
        {
            t2_volume.setText(t1_volume.getText());
        }
        
        }//end try
        catch(NumberFormatException e)
        {
            t2_volume.setText("Error! enter a postive integer");
        }
                

    }
    //end chV
    
    
    
    public void chT()//changer la température
    {
        String from=c1_temperature.getSelectedItem().toString();
        String to=c2_temperature.getSelectedItem().toString();
        double x;
        
        try{
        
        if(t1_temperature.getText().isEmpty() )
            x=0;
        else
            x=Double.valueOf(t1_temperature.getText());
        
        
        if(! from.equals(to) )
        {
            switch(from)
            {
                case "°C":
                    switch(to)
                    {
                        case "F"://c->f
                            t2_temperature.setText(String.valueOf(x*1.8 + 32));
                            break;
                        case "K"://c->k
                            t2_temperature.setText(String.valueOf(x + 273.15));
                            break;
                    }
                    break;
                case "F":
                    switch(to)
                    {
                        case "°C"://f->c
                            t2_temperature.setText(String.valueOf((x-32)/1.8));
                            break;
                        case "K"://f->k
                            t2_temperature.setText(String.valueOf((x-32)/1.8 + 273.15));
                            break;
                    }
                    break;
                case "K":
                    switch(to)
                    {
                        case "°C"://k->c
                            t2_temperature.setText(String.valueOf(x-273.15));
                            break;
                        case "F"://k->f
                            t2_temperature.setText(String.valueOf((x-273.15)*1.8 + 32));
                            break;
                    }
                    break;
            }
        }
        else
        {
            t2_temperature.setText(t1_temperature.getText());
        }
        
        }//end rry
        catch(NumberFormatException e)
        {
            t2_temperature.setText("Error! enter a postive integer");
        }
        
        
    }
        //end chT
        
    //declartions
    JFrame f=new JFrame("Convertisseur des unités");
    
    JMenuBar menuB;
    
    JMenu about;
    
    JMenuItem aboutItem;
    
    JPanel p_masse,p_longueur,p_surface,p_volume,p_temperature;
    
    JTabbedPane tb=new JTabbedPane();
    
    
    
    String[] masse={"t","q","Kg","g","mg","livres"};
    String[] longueur={"Km","m","cm","mm","µm","nm","pouces","pieds","yards","miles"};
    String[] surface={"Km²","ha","a","m²","cm²","mm²"};
    String[] volume={"m³","cm³","mm³","L","mL","gallons"};
    String[] temperature={"°C","F","K"};
    
    JComboBox c1_masse,c2_masse,c1_longueur,c2_longueur,
               c1_surface,c2_surface,
               c1_volume,c2_volume,
               c1_temperature,c2_temperature;
    
    
    JTextField t1_masse,t2_masse,t1_longueur,t2_longueur,
                t1_surface,t2_surface,t1_volume,t2_volume,
                t1_temperature,t2_temperature;
    
    
    Font ft=new Font("Arial", Font.BOLD ,16);
    
    Main()
    {
        
        menuB=new JMenuBar();
        
        about =new JMenu("About");
        about.setMnemonic(KeyEvent.VK_A);
        menuB.add(about);
        
        aboutItem=new JMenuItem("Contacter le createur");
        
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Un convertisseur des unités créeé par:\nMohamed Islam Boumendjel\nAlgérie 2019\nE-mail: is20lam01@gmail.com", "Contacter le createur",1);
            }
        });
        
        about.add(aboutItem);
        
        f.setJMenuBar(menuB);
        
        
        c1_masse = new JComboBox(masse);
        c2_masse = new JComboBox(masse);
        
        t1_masse = new JTextField();
        t2_masse = new JTextField();
        
        c1_longueur = new JComboBox(longueur);
        c2_longueur = new JComboBox(longueur);
        
        t1_longueur = new JTextField();
        t2_longueur = new JTextField();
        
        c1_surface = new JComboBox(surface);
        c2_surface = new JComboBox(surface);
        
        t1_surface = new JTextField();
        t2_surface = new JTextField();
        
        c1_volume = new JComboBox(volume);
        c2_volume = new JComboBox(volume);
        
        t1_volume = new JTextField();
        t2_volume = new JTextField();
        
        c1_temperature = new JComboBox(temperature);
        c2_temperature = new JComboBox(temperature);
        
        t1_temperature = new JTextField();
        t2_temperature = new JTextField();
        
        
        t2_masse.setEditable(false);
        t2_longueur.setEditable(false);
        t2_surface.setEditable(false);
        t2_volume.setEditable(false);
        t2_temperature.setEditable(false);
        
        
        p_masse=new JPanel(new GridLayout(2,2,5,5) );
        p_longueur=new JPanel(new GridLayout(2,2,5,5) );
        p_surface=new JPanel(new GridLayout(2,2,5,5) );
        p_volume=new JPanel(new GridLayout(2,2,5,5) );
        p_temperature=new JPanel(new GridLayout(2,2,5,5) );
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(tb);
        
        tb.addTab("Masse", p_masse);
        tb.addTab("Longueur", p_longueur);
        tb.addTab("Surface", p_surface);
        tb.addTab("Volume", p_volume);
        tb.addTab("Température", p_temperature);
        
        
        
        
        tb.setMnemonicAt(0, KeyEvent.VK_M);
        tb.setMnemonicAt(1, KeyEvent.VK_L);
        tb.setMnemonicAt(2, KeyEvent.VK_S);
        tb.setMnemonicAt(3, KeyEvent.VK_V);
        tb.setMnemonicAt(4, KeyEvent.VK_T);
        
        
        p_masse.add(t1_masse);
        p_masse.add(c1_masse);
        p_masse.add(t2_masse);
        p_masse.add(c2_masse);
        
        
        
        p_longueur.add(t1_longueur);
        p_longueur.add(c1_longueur);
        p_longueur.add(t2_longueur);
        p_longueur.add(c2_longueur);
        
        
        p_surface.add(t1_surface);
        p_surface.add(c1_surface);
        p_surface.add(t2_surface);
        p_surface.add(c2_surface);
        
        
        p_volume.add(t1_volume);
        p_volume.add(c1_volume);
        p_volume.add(t2_volume);
        p_volume.add(c2_volume);
        
        
        p_temperature.add(t1_temperature);
        p_temperature.add(c1_temperature);
        p_temperature.add(t2_temperature);
        p_temperature.add(c2_temperature);
        
        
        f.setFont(ft);
        
        p_masse.setFont(ft);
        p_longueur.setFont(ft);
        p_surface.setFont(ft);
        p_volume.setFont(ft);
        p_temperature.setFont(ft);
        
        tb.setFont(ft);
        
        c1_masse.setFont(ft);
        c1_longueur.setFont(ft);
        c1_surface.setFont(ft);
        c1_volume.setFont(ft);
        c1_temperature.setFont(ft);
        
        c2_masse.setFont(ft);
        c2_longueur.setFont(ft);
        c2_surface.setFont(ft);
        c2_volume.setFont(ft);
        c2_temperature.setFont(ft);
        
        t1_masse.setFont(ft);
        t1_longueur.setFont(ft);
        t1_surface.setFont(ft);
        t1_volume.setFont(ft);
        t1_temperature.setFont(ft);
        
        
        t2_masse.setFont(ft);
        t2_longueur.setFont(ft);
        t2_surface.setFont(ft);
        t2_volume.setFont(ft);
        t2_temperature.setFont(ft);
        
        
        
        
        t1_masse.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                chM();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                chM();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                chM();
            }
        });
       
           
        t1_longueur.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                chL();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                chL();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                chL();
            }
        });
        
        
        
        t1_surface.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                chS();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                chS();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                chS();
            }
        });
        
        
        
        t1_volume.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                chV();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                chV();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                chV();
            }
        });
        
        
        
        t1_temperature.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                chT();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                chT();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                chT();
            }
        });
        
        
        
        f.setSize(600,130);
        f.setResizable(false);
        f.show();
        
    }
   
    public static void main(String[] args) {
       
           new Main(); 
       
      
    }
    
}
