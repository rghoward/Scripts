package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rp4 {
    public static cmb a(vx1 vx1Var, int i, ArrayList<cmb> arrayList, cmb cmbVar) {
        int i2;
        int i3 = i == 0 ? vx1Var.p0 : vx1Var.q0;
        if (i3 != -1 && (cmbVar == null || i3 != cmbVar.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                cmb cmbVar2 = arrayList.get(i4);
                if (cmbVar2.b == i3) {
                    if (cmbVar != null) {
                        cmbVar.c(i, cmbVar2);
                        arrayList.remove(cmbVar);
                    }
                    cmbVar = cmbVar2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return cmbVar;
        }
        if (cmbVar == null) {
            if (vx1Var instanceof dw4) {
                dw4 dw4Var = (dw4) vx1Var;
                int i5 = 0;
                while (true) {
                    if (i5 >= dw4Var.s0) {
                        i2 = -1;
                        break;
                    }
                    vx1 vx1Var2 = dw4Var.r0[i5];
                    if ((i == 0 && (i2 = vx1Var2.p0) != -1) || (i == 1 && (i2 = vx1Var2.q0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        cmb cmbVar3 = arrayList.get(i6);
                        if (cmbVar3.b == i2) {
                            cmbVar = cmbVar3;
                            break;
                        }
                    }
                }
            }
            if (cmbVar == null) {
                cmbVar = new cmb();
                cmbVar.a = new ArrayList<>();
                cmbVar.d = null;
                cmbVar.e = -1;
                int i7 = cmb.f;
                cmb.f = i7 + 1;
                cmbVar.b = i7;
                cmbVar.c = i;
            }
            arrayList.add(cmbVar);
        }
        ArrayList<vx1> arrayList2 = cmbVar.a;
        if (arrayList2.contains(vx1Var)) {
            return cmbVar;
        }
        arrayList2.add(vx1Var);
        if (vx1Var instanceof vp4) {
            vp4 vp4Var = (vp4) vx1Var;
            vp4Var.u0.b(vp4Var.v0 == 0 ? 1 : 0, cmbVar, arrayList);
        }
        int i8 = cmbVar.b;
        if (i == 0) {
            vx1Var.p0 = i8;
            vx1Var.J.b(i, cmbVar, arrayList);
            vx1Var.L.b(i, cmbVar, arrayList);
        } else {
            vx1Var.q0 = i8;
            vx1Var.K.b(i, cmbVar, arrayList);
            vx1Var.N.b(i, cmbVar, arrayList);
            vx1Var.M.b(i, cmbVar, arrayList);
        }
        vx1Var.Q.b(i, cmbVar, arrayList);
        return cmbVar;
    }

    public static boolean b(vx1.a aVar, vx1.a aVar2, vx1.a aVar3, vx1.a aVar4) {
        vx1.a aVar5 = vx1.a.w;
        vx1.a aVar6 = vx1.a.u;
        vx1.a aVar7 = vx1.a.t;
        return (aVar3 == aVar7 || aVar3 == aVar6 || (aVar3 == aVar5 && aVar != aVar6)) || (aVar4 == aVar7 || aVar4 == aVar6 || (aVar4 == aVar5 && aVar2 != aVar6));
    }
}
