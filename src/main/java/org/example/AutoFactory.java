package org.example;

import java.util.ArrayList;

public class AutoFactory
{
    int ProdSize = 0;
    ProductionLine ProdLine;

    private  ArrayList<Car> BuildCars;

    public AutoFactory(int prodSize, ProductionLine prodLine) {
        ProdSize = prodSize;
        ProdLine = prodLine;
        BuildCars = new ArrayList<>();
    }

    public void RunProd(){
        for(int CarsBuild =0; CarsBuild<ProdSize;CarsBuild++){
            BuildCars.add(ProdLine.build());
        }
    }

    public int GetBuildCnt(){
        return  BuildCars.size();
    }

}
