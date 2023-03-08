package Problem1;

import Problem1.Builder.PCBuilder;

public class Director {
    public void build(PCBuilder pcb){
        pcb.buildBasePC();
        pcb.buildCPU();
        pcb.buildCooler();
        pcb.buildDVDDrive();
    }
    public void addRAM(int type,PCBuilder pcb){
        pcb.buildRAM(type);
    }

    public void addGPU(int size,PCBuilder pcb){
        pcb.buildGPU(size);
    }
}
