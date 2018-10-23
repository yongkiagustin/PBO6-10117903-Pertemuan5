/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117903.latihan51.gajikaryawan;

/**
 *
 * @author yongki
 */
public class Manager extends karyawan {

    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganKehadiran(int hadir) {
        return tunjanganKehadiran = hadir * 10000;

    }

    public float tunjanganJabatan(String jabatan) {
        if (jabatan.equalsIgnoreCase("manager")) {
            return this.tunjanganJabatan = 2000000;
        } else if (jabatan.equalsIgnoreCase("kabag")) {
            return this.tunjanganJabatan = 1000000;
        } else {
            return this.tunjanganJabatan = 0;
        }
    }

    public float tunjanganGolongan(int golongan) {
        if (this.golongan == 1) {
            return this.tunjanganGolongan = 500000;

        } else if (this.golongan == 2) {
            return this.tunjanganGolongan = 1000000;
        } else if (this.golongan == 3) {
            return this.tunjanganGolongan = 1500000;
        } else {
            return this.tunjanganGolongan = 0;

        }

    }

    public float gajiTotal() {
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }
}
