package defpackage;

import android.R;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class y8b implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ y8b(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                mr0 mr0Var = (mr0) obj;
                o8b o8bVar = (o8b) obj2;
                o8b.a aVar = o8b.Companion;
                if (mr0Var != null) {
                    ArrayList arrayList = mr0Var.a;
                    ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
                    int size = arrayList.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add((mr0.a) ((js7) obj3).t);
                    }
                    ArrayList arrayList3 = new ArrayList(ph1.n(arrayList, 10));
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj4 = arrayList.get(i4);
                        i4++;
                        arrayList3.add((String) ((js7) obj4).u);
                    }
                    ArrayList arrayList4 = new ArrayList(ph1.n(arrayList2, 10));
                    int size3 = arrayList2.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj5 = arrayList2.get(i6);
                        i6++;
                        int i7 = i5 + 1;
                        if (i5 < 0) {
                            ws0.m();
                            throw null;
                        }
                        mr0.a aVar2 = (mr0.a) obj5;
                        float f = i5;
                        float f2 = aVar2.b;
                        float f3 = aVar2.a - f2;
                        float[] fArr = new float[2];
                        fArr[i2] = f2;
                        fArr[1] = f3;
                        g2b g2bVar = g2b.a;
                        jl3 jl3Var = aVar2.c;
                        float f4 = 0.0f;
                        for (int i8 = i2; i8 < 2; i8++) {
                            f4 += fArr[i8];
                        }
                        kj0 kj0Var = new kj0(f, f4, jl3Var);
                        kj0Var.w = fArr;
                        float fAbs = 0.0f;
                        float f5 = 0.0f;
                        for (int i9 = i2; i9 < 2; i9++) {
                            float f6 = fArr[i9];
                            if (f6 <= 0.0f) {
                                fAbs += Math.abs(f6);
                            } else {
                                f5 += f6;
                            }
                        }
                        kj0Var.y = fAbs;
                        kj0Var.z = f5;
                        float[] fArr2 = kj0Var.w;
                        if (fArr2 != null && fArr2.length != 0) {
                            kj0Var.x = new th8[fArr2.length];
                            float f7 = -fAbs;
                            int i10 = i2;
                            float f8 = 0.0f;
                            while (true) {
                                th8[] th8VarArr = kj0Var.x;
                                if (i10 < th8VarArr.length) {
                                    float f9 = fArr2[i10];
                                    if (f9 < 0.0f) {
                                        float f10 = f7 - f9;
                                        th8VarArr[i10] = new th8(f7, f10);
                                        f7 = f10;
                                    } else {
                                        float f11 = f9 + f8;
                                        th8VarArr[i10] = new th8(f8, f11);
                                        f8 = f11;
                                    }
                                    i10++;
                                }
                            }
                        }
                        arrayList4.add(kj0Var);
                        i5 = i7;
                        i2 = 0;
                    }
                    jj0 jj0Var = new jj0(arrayList4);
                    jj0Var.a = ws0.i(Integer.valueOf(o8bVar.requireContext().getColor(R.color.transparent)), Integer.valueOf(o8bVar.requireContext().getColor(com.hwpo_training_app.R.color.iconPrimaryActive)));
                    j9b j9bVar = new j9b(o8bVar.q().b);
                    Iterator it = arrayList2.iterator();
                    if (!it.hasNext()) {
                        vl.b();
                        return null;
                    }
                    int i11 = ((mr0.a) it.next()).a;
                    while (it.hasNext()) {
                        int i12 = ((mr0.a) it.next()).a;
                        if (i11 < i12) {
                            i11 = i12;
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size4 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        Object obj6 = arrayList2.get(i13);
                        i13++;
                        if (((mr0.a) obj6).b != -1) {
                            arrayList5.add(obj6);
                        }
                    }
                    Iterator it2 = arrayList5.iterator();
                    if (!it2.hasNext()) {
                        vl.b();
                        return null;
                    }
                    int i14 = ((mr0.a) it2.next()).b;
                    while (it2.hasNext()) {
                        int i15 = ((mr0.a) it2.next()).b;
                        if (i14 > i15) {
                            i14 = i15;
                        }
                    }
                    float f12 = i14;
                    float f13 = i11;
                    float fMax = Math.max(0.0f, f12 - ((float) Math.rint(f13 / 10.0f)));
                    float fP = o8b.p(fMax, f13, xn0.D);
                    BarChart barChart = o8bVar.q().b;
                    barChart.getXAxis().g = new oa5(arrayList3);
                    mrb axisLeft = barChart.getAxisLeft();
                    axisLeft.A = true;
                    axisLeft.D = fMax;
                    axisLeft.E = Math.abs(axisLeft.C - fMax);
                    mrb axisLeft2 = barChart.getAxisLeft();
                    axisLeft2.B = true;
                    axisLeft2.C = fP;
                    axisLeft2.E = Math.abs(fP - axisLeft2.D);
                    barChart.setData(new gj0(jj0Var, 0.15f));
                    barChart.setHighlighter(j9bVar);
                    barChart.invalidate();
                }
                return g2b.a;
            default:
                ((MaterialButton) obj2).setEnabled(((Boolean) obj).booleanValue());
                return g2b.a;
        }
    }
}
