package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lz4 implements xz8 {
    public final int a;
    public final pz4 b;
    public int c = -1;

    public lz4(pz4 pz4Var, int i) {
        this.b = pz4Var;
        this.a = i;
    }

    @Override // defpackage.xz8
    public final void a() throws i83.a, wz8 {
        int i = this.c;
        pz4 pz4Var = this.b;
        if (i == -2) {
            pz4Var.w();
            throw new wz8(sk0.c("Unable to bind a sample queue to TrackGroup with MIME type ", pz4Var.b0.a(this.a).d[0].o, "."));
        }
        if (i == -1) {
            pz4Var.G();
            return;
        }
        if (i != -3) {
            pz4Var.G();
            pz4.b bVar = pz4Var.O[i];
            i83 i83Var = bVar.h;
            if (i83Var == null || i83Var.getState() != 1) {
                return;
            }
            i83.a aVarF = bVar.h.f();
            aVarF.getClass();
            throw aVarF;
        }
    }

    @Override // defpackage.xz8
    public final boolean b() {
        if (this.c == -3) {
            return true;
        }
        if (!f()) {
            return false;
        }
        int i = this.c;
        pz4 pz4Var = this.b;
        return !pz4Var.E() && pz4Var.O[i].t(pz4Var.m0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // defpackage.xz8
    public final int c(long j) throws Throwable {
        zy4 next;
        Object objB;
        if (!f()) {
            return 0;
        }
        int i = this.c;
        pz4 pz4Var = this.b;
        if (pz4Var.E()) {
            return 0;
        }
        pz4.b bVar = pz4Var.O[i];
        int iR = bVar.r(j, pz4Var.m0);
        ArrayList<zy4> arrayList = pz4Var.G;
        if (arrayList == null) {
            Iterator<zy4> it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objB = next;
            } else {
                objB = null;
            }
        } else if (arrayList.isEmpty()) {
            objB = null;
        } else {
            objB = p51.b(1, arrayList);
        }
        zy4 zy4Var = (zy4) objB;
        if (zy4Var != null && !zy4Var.f()) {
            iR = Math.min(iR, zy4Var.e(i) - bVar.p());
        }
        bVar.C(iR);
        return iR;
    }

    @Override // defpackage.xz8
    public final int d(jd4 jd4Var, nn2 nn2Var, int i) {
        id4 id4Var;
        if (this.c == -3) {
            nn2Var.h(4);
            return -4;
        }
        if (f()) {
            int i2 = this.c;
            pz4 pz4Var = this.b;
            ArrayList<zy4> arrayList = pz4Var.G;
            if (!pz4Var.E()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = arrayList.get(i4).k;
                        int length = pz4Var.O.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (pz4Var.g0[i6] && pz4Var.O[i6].w() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    String str = n6b.a;
                    if (i4 > arrayList.size() || i4 < 0) {
                        zn3.b();
                        return 0;
                    }
                    if (i4 != 0) {
                        arrayList.subList(0, i4).clear();
                    }
                    zy4 zy4Var = arrayList.get(0);
                    id4 id4Var2 = zy4Var.d;
                    if (!id4Var2.equals(pz4Var.Z)) {
                        jq6.a aVar = pz4Var.D;
                        aVar.a(new cq6(aVar, new mp6(1, pz4Var.u, id4Var2, zy4Var.e, zy4Var.f, n6b.Z(zy4Var.g), -9223372036854775807L)));
                    }
                    pz4Var.Z = id4Var2;
                }
                if (arrayList.isEmpty() || arrayList.get(0).f()) {
                    int iX = pz4Var.O[i2].x(jd4Var, nn2Var, i, pz4Var.m0);
                    if (iX == -5) {
                        id4 id4VarD = jd4Var.b;
                        id4VarD.getClass();
                        if (i2 == pz4Var.U) {
                            int iI1 = ek5.i1(pz4Var.O[i2].w());
                            while (i3 < arrayList.size() && arrayList.get(i3).k != iI1) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                id4Var = arrayList.get(i3).d;
                            } else {
                                id4Var = pz4Var.Y;
                                id4Var.getClass();
                            }
                            id4VarD = id4VarD.d(id4Var);
                        }
                        jd4Var.b = id4VarD;
                    }
                    return iX;
                }
            }
        }
        return -3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void e() {
        xl7.g(this.c == -1);
        pz4 pz4Var = this.b;
        pz4Var.w();
        pz4Var.d0.getClass();
        int[] iArr = pz4Var.d0;
        int i = this.a;
        int i2 = iArr[i];
        if (i2 != -1) {
            boolean[] zArr = pz4Var.g0;
            if (zArr[i2]) {
                i2 = -2;
            } else {
                zArr[i2] = true;
            }
        } else if (pz4Var.c0.contains(pz4Var.b0.a(i))) {
            i2 = -3;
        } else {
            i2 = -2;
        }
        this.c = i2;
    }

    public final boolean f() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
