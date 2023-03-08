package Problem1.Builder;

import Problem1.Components.*;

public class I9PC implements PCBuilder{
    private PC pc = new PC(4);
    @Override
    public void buildCPU() {
        pc.addComponent(new IntelCoreI9());
    }

    @Override
    public void buildGPU(int size) {
        if(size==2)
            pc.addComponent(new GPU2GB());
        else
            pc.addComponent(new GPU4GB());
    }

    @Override
    public void buildRAM(int type) {
        if(type==2666)
            pc.addComponent(new RAM2666MHz());
        else
            pc.addComponent(new RAM3200MHz());
    }

    @Override
    public void buildBasePC() {
        pc.addComponent(new BasePc());
    }

    @Override
    public void buildCooler() {

    }

    @Override
    public void buildDVDDrive() {
        pc.addComponent(new DVDDrive());
    }

    @Override
    public PC getPC() {
        return pc;
    }
}
