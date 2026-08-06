package defpackage;

import defpackage.pj0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class ya1<T extends pj0> implements v55 {
    public final mj0 a;
    public final ArrayList b = new ArrayList();

    public ya1(mj0 mj0Var) {
        this.a = mj0Var;
    }

    public static float d(ArrayList arrayList, float f, mrb.a aVar) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            rw4 rw4Var = (rw4) arrayList.get(i);
            if (rw4Var.h == aVar) {
                float fAbs = Math.abs(rw4Var.d - f);
                if (fAbs < f2) {
                    f2 = fAbs;
                }
            }
        }
        return f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [t55] */
    /* JADX WARN: Type inference failed for: r10v1, types: [t55] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t55] */
    @Override // defpackage.v55
    public rw4 a(float f, float f2) {
        ?? r10;
        mj0 mj0Var;
        float f3;
        oj0 oj0Var;
        qj3 qj3VarE;
        mj0 mj0Var2 = this.a;
        mrb.a aVar = mrb.a.t;
        rf6 rf6VarB = mj0Var2.a(aVar).b(f, f2);
        float f4 = (float) rf6VarB.b;
        rf6.c(rf6VarB);
        ArrayList arrayList = this.b;
        arrayList.clear();
        oj0 oj0VarB = b();
        if (oj0VarB != null) {
            int iC = oj0VarB.c();
            int i = 0;
            while (i < iC) {
                ?? B = oj0VarB.b(i);
                if (B.K()) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayListY = B.y(f4);
                    if (arrayListY.size() == 0 && (qj3VarE = B.e(f4, Float.NaN)) != null) {
                        arrayListY = B.y(qj3VarE.b());
                    }
                    if (arrayListY.size() != 0) {
                        int size = arrayListY.size();
                        int i2 = 0;
                        while (i2 < size) {
                            r10 = B;
                            int i3 = i2 + 1;
                            qj3 qj3Var = (qj3) arrayListY.get(i2);
                            mj0 mj0Var3 = mj0Var2;
                            rf6 rf6VarA = mj0Var2.a(r10.G()).a(qj3Var.b(), qj3Var.a());
                            ?? r8 = r10;
                            ArrayList arrayList3 = arrayList2;
                            arrayList3.add(new rw4(qj3Var.b(), qj3Var.a(), (float) rf6VarA.b, (float) rf6VarA.c, i, r8.G()));
                            arrayList2 = arrayList3;
                            arrayListY = arrayListY;
                            size = size;
                            r10 = r8;
                            i2 = i3;
                            mj0Var2 = mj0Var3;
                            f4 = f4;
                            oj0VarB = oj0VarB;
                        }
                        r10 = B;
                    }
                    mj0Var = mj0Var2;
                    f3 = f4;
                    oj0Var = oj0VarB;
                    arrayList.addAll(arrayList2);
                } else {
                    mj0Var = mj0Var2;
                    f3 = f4;
                    oj0Var = oj0VarB;
                }
                i++;
                mj0Var2 = mj0Var;
                f4 = f3;
                oj0VarB = oj0Var;
            }
        }
        mj0 mj0Var4 = mj0Var2;
        rw4 rw4Var = null;
        if (!arrayList.isEmpty()) {
            float fD = d(arrayList, f2, aVar);
            mrb.a aVar2 = mrb.a.u;
            if (fD >= d(arrayList, f2, aVar2)) {
                aVar = aVar2;
            }
            float maxHighlightDistance = mj0Var4.getMaxHighlightDistance();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                rw4 rw4Var2 = (rw4) arrayList.get(i4);
                if (rw4Var2.h == aVar) {
                    float fC = c(f, f2, rw4Var2.c, rw4Var2.d);
                    if (fC < maxHighlightDistance) {
                        rw4Var = rw4Var2;
                        maxHighlightDistance = fC;
                    }
                }
            }
        }
        return rw4Var;
    }

    public oj0 b() {
        return this.a.getData();
    }

    public float c(float f, float f2, float f3, float f4) {
        return (float) Math.hypot(f - f3, f2 - f4);
    }
}
