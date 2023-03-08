package Problem1.Builder;

public interface PCBuilder {

    void buildCPU();
    void buildGPU(int size);
    void buildRAM(int type);
    void buildBasePC();
    void buildCooler();
    void buildDVDDrive();
    PC getPC();
}
