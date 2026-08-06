package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t8d {
    public final String a;
    public final boolean b;
    public final glc c;
    public final BitSet d;
    public final BitSet e;
    public final n30 f;
    public final n30 g;
    public final /* synthetic */ z0c h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t8d(z0c z0cVar, String str, glc glcVar, BitSet bitSet, BitSet bitSet2, n30 n30Var, n30 n30Var2) {
        this.h = z0cVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = n30Var;
        this.g = new n30();
        for (Integer num : (n30.c) n30Var2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) n30Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = glcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(azb azbVar) {
        int iA = azbVar.a();
        if (azbVar.c != null) {
            this.e.set(iA, true);
        }
        Boolean bool = azbVar.d;
        if (bool != null) {
            this.d.set(iA, bool.booleanValue());
        }
        if (azbVar.e != null) {
            Integer numValueOf = Integer.valueOf(iA);
            n30 n30Var = this.f;
            Long l = (Long) n30Var.get(numValueOf);
            long jLongValue = azbVar.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                n30Var.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (azbVar.f != null) {
            Integer numValueOf2 = Integer.valueOf(iA);
            n30 n30Var2 = this.g;
            List arrayList = (List) n30Var2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                n30Var2.put(numValueOf2, arrayList);
            }
            if (azbVar.b()) {
                arrayList.clear();
            }
            t5c.a();
            tkc tkcVar = this.h.a;
            t7c t7cVar = tkcVar.d;
            ufc ufcVar = wfc.F0;
            String str = this.a;
            if (t7cVar.r(str, ufcVar) && azbVar.c()) {
                arrayList.clear();
            }
            t5c.a();
            boolean zR = tkcVar.d.r(str, ufcVar);
            Long l2 = azbVar.f;
            if (!zR) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yic b(int i) {
        ArrayList arrayList;
        List list;
        wic wicVarE = yic.E();
        wicVarE.h();
        ((yic) wicVarE.u).F(i);
        wicVarE.h();
        ((yic) wicVarE.u).I(this.b);
        glc glcVar = this.c;
        if (glcVar != null) {
            wicVarE.h();
            ((yic) wicVarE.u).H(glcVar);
        }
        elc elcVarF = glc.F();
        ArrayList arrayListM = qzc.M(this.d);
        elcVarF.h();
        ((glc) elcVarF.u).J(arrayListM);
        ArrayList arrayListM2 = qzc.M(this.e);
        elcVarF.h();
        ((glc) elcVarF.u).H(arrayListM2);
        n30 n30Var = this.f;
        if (n30Var == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(n30Var.v);
            for (Integer num : (n30.c) n30Var.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) n30Var.get(num);
                if (l != null) {
                    njc njcVarB = pjc.B();
                    njcVarB.h();
                    ((pjc) njcVarB.u).C(iIntValue);
                    long jLongValue = l.longValue();
                    njcVarB.h();
                    ((pjc) njcVarB.u).D(jLongValue);
                    arrayList2.add((pjc) njcVarB.j());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            elcVarF.h();
            ((glc) elcVarF.u).L(arrayList);
        }
        n30 n30Var2 = this.g;
        if (n30Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(n30Var2.v);
            for (Integer num2 : (n30.c) n30Var2.keySet()) {
                ilc ilcVarC = klc.C();
                int iIntValue2 = num2.intValue();
                ilcVarC.h();
                ((klc) ilcVarC.u).D(iIntValue2);
                List list2 = (List) n30Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    ilcVarC.h();
                    ((klc) ilcVarC.u).E(list2);
                }
                arrayList3.add((klc) ilcVarC.j());
            }
            list = arrayList3;
        }
        elcVarF.h();
        ((glc) elcVarF.u).N(list);
        wicVarE.h();
        ((yic) wicVarE.u).G((glc) elcVarF.j());
        return (yic) wicVarE.j();
    }

    public /* synthetic */ t8d(z0c z0cVar, String str) {
        this.h = z0cVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new n30();
        this.g = new n30();
    }
}
