package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fy9 extends ln4 {
    public final pt7 x;
    public final ot7 y;
    public apa z;

    public fy9() {
        super(20);
        this.x = new pt7();
        this.y = new ot7();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // defpackage.ln4
    public final su6 C0(xu6 xu6Var, ByteBuffer byteBuffer) {
        su6.a hy9Var;
        long j;
        long j2;
        pt7 pt7Var = this.x;
        ot7 ot7Var = this.y;
        apa apaVar = this.z;
        if (apaVar != null) {
            long j3 = xu6Var.B;
            synchronized (apaVar) {
                j2 = apaVar.b;
            }
            if (j3 != j2) {
                apa apaVar2 = new apa(xu6Var.y);
                this.z = apaVar2;
                apaVar2.a(xu6Var.y - xu6Var.B);
            }
        } else {
            apa apaVar3 = new apa(xu6Var.y);
            this.z = apaVar3;
            apaVar3.a(xu6Var.y - xu6Var.B);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        pt7Var.K(bArrArray, iLimit);
        ot7Var.l(bArrArray, iLimit);
        ot7Var.o(39);
        long jG = (((long) ot7Var.g(1)) << 32) | ((long) ot7Var.g(32));
        ot7Var.o(20);
        int iG = ot7Var.g(12);
        int iG2 = ot7Var.g(8);
        pt7Var.N(14);
        if (iG2 == 0) {
            hy9Var = new hy9();
        } else if (iG2 == 255) {
            long jB = pt7Var.B();
            int i = iG - 4;
            pt7Var.k(new byte[i], 0, i);
            hy9Var = new x98(jB, jG);
        } else if (iG2 == 4) {
            int iZ = pt7Var.z();
            ArrayList arrayList = new ArrayList(iZ);
            for (int i2 = 0; i2 < iZ; i2++) {
                pt7Var.B();
                boolean z = (pt7Var.z() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iZ2 = pt7Var.z();
                    boolean z2 = (iZ2 & 64) != 0;
                    boolean z3 = (iZ2 & 32) != 0;
                    if (z2) {
                        pt7Var.B();
                    }
                    if (!z2) {
                        int iZ3 = pt7Var.z();
                        ArrayList arrayList3 = new ArrayList(iZ3);
                        for (int i3 = 0; i3 < iZ3; i3++) {
                            pt7Var.z();
                            pt7Var.B();
                            arrayList3.add(new iy9.a());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        pt7Var.z();
                        pt7Var.B();
                    }
                    pt7Var.G();
                    pt7Var.z();
                    pt7Var.z();
                }
                arrayList.add(new iy9.b(arrayList2));
            }
            hy9Var = new iy9(arrayList);
        } else if (iG2 == 5) {
            apa apaVar4 = this.z;
            pt7Var.B();
            boolean z4 = (pt7Var.z() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iZ4 = pt7Var.z();
                boolean z5 = (iZ4 & 64) != 0;
                boolean z6 = (iZ4 & 32) != 0;
                boolean z7 = (iZ4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : ooa.d(jG, pt7Var);
                if (!z5) {
                    int iZ5 = pt7Var.z();
                    ArrayList arrayList4 = new ArrayList(iZ5);
                    for (int i4 = 0; i4 < iZ5; i4++) {
                        pt7Var.z();
                        apaVar4.b(!z7 ? ooa.d(jG, pt7Var) : -9223372036854775807L);
                        arrayList4.add(new gy9.a());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    pt7Var.z();
                    pt7Var.B();
                }
                pt7Var.G();
                pt7Var.z();
                pt7Var.z();
                j = jD;
            }
            hy9Var = new gy9(j, apaVar4.b(j), list);
        } else if (iG2 != 6) {
            hy9Var = null;
        } else {
            apa apaVar5 = this.z;
            long jD2 = ooa.d(jG, pt7Var);
            hy9Var = new ooa(jD2, apaVar5.b(jD2));
        }
        return hy9Var == null ? new su6(new su6.a[0]) : new su6(hy9Var);
    }
}
