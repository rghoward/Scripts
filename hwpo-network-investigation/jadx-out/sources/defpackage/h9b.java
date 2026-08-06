package defpackage;

import com.github.mikephil.charting.charts.BarChart;
import com.hwpo_training_app.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class h9b implements mh4<g2b> {
    public final /* synthetic */ o8b t;
    public final /* synthetic */ ej0 u;

    public h9b(o8b o8bVar, ej0 ej0Var) {
        this.t = o8bVar;
        this.u = ej0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mh4
    public final g2b invoke() {
        o8b.a aVar = o8b.Companion;
        ej0 ej0Var = this.u;
        if (ej0Var != null) {
            xn0 xn0Var = ej0Var.b;
            ArrayList arrayList = ej0Var.a;
            ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add((ej0.a) ((js7) obj).t);
            }
            ArrayList arrayList3 = new ArrayList(ph1.n(arrayList, 10));
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                arrayList3.add((String) ((js7) obj2).u);
            }
            ArrayList arrayList4 = new ArrayList(ph1.n(arrayList2, 10));
            int size3 = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList2.get(i5);
                i5++;
                int i6 = i4 + 1;
                if (i4 < 0) {
                    ws0.m();
                    throw null;
                }
                ej0.a aVar2 = (ej0.a) obj3;
                arrayList4.add(new kj0(i4, aVar2.a, aVar2.b));
                i4 = i6;
            }
            jj0 jj0Var = new jj0(arrayList4);
            o8b o8bVar = this.t;
            int color = o8bVar.requireContext().getColor(R.color.iconPrimaryActive);
            if (jj0Var.a == null) {
                jj0Var.a = new ArrayList();
            }
            jj0Var.a.clear();
            jj0Var.a.add(Integer.valueOf(color));
            Iterator it = arrayList2.iterator();
            if (!it.hasNext()) {
                vl.b();
                return null;
            }
            float fMax = ((ej0.a) it.next()).a;
            while (it.hasNext()) {
                fMax = Math.max(fMax, ((ej0.a) it.next()).a);
            }
            ArrayList arrayList5 = new ArrayList();
            int size4 = arrayList2.size();
            int i7 = 0;
            while (i7 < size4) {
                Object obj4 = arrayList2.get(i7);
                i7++;
                if (((ej0.a) obj4).a != 0.0f) {
                    arrayList5.add(obj4);
                }
            }
            Iterator it2 = arrayList5.iterator();
            if (!it2.hasNext()) {
                vl.b();
                return null;
            }
            float fMin = ((ej0.a) it2.next()).a;
            while (it2.hasNext()) {
                fMin = Math.min(fMin, ((ej0.a) it2.next()).a);
            }
            float fMax2 = Math.max(0.0f, fMin - (fMax / 10.0f));
            float f = fMax - fMax2;
            if (f <= 1.0f && f != 0.0f) {
                i = 1;
            }
            float fFloatValue = xn0Var.a() ? new BigDecimal(String.valueOf(fMax2)).setScale(i, RoundingMode.HALF_UP).floatValue() : (float) Math.rint(fMax2);
            if (fFloatValue == fMin) {
                fFloatValue = xn0Var.a() ? fFloatValue - 0.1f : fFloatValue - 1.0f;
            }
            float fP = o8b.p(fFloatValue, fMax, xn0Var);
            BarChart barChart = o8bVar.q().b;
            barChart.getXAxis().g = new oa5(arrayList3);
            mrb axisLeft = barChart.getAxisLeft();
            axisLeft.A = true;
            axisLeft.D = fFloatValue;
            axisLeft.E = Math.abs(axisLeft.C - fFloatValue);
            mrb axisLeft2 = barChart.getAxisLeft();
            axisLeft2.B = true;
            axisLeft2.C = fP;
            axisLeft2.E = Math.abs(fP - axisLeft2.D);
            barChart.setData(new gj0(jj0Var, 0.7f));
            barChart.invalidate();
        }
        return g2b.a;
    }
}
