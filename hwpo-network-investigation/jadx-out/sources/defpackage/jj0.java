package defpackage;

import android.graphics.Color;
import com.intercom.twig.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class jj0 extends hf2<kj0> implements q55, r55<kj0> {
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final String[] y;

    public jj0(ArrayList arrayList) {
        this.a = null;
        this.b = null;
        this.c = "DataSet";
        this.d = mrb.a.t;
        this.e = true;
        this.g = h66.b.u;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = true;
        this.k = true;
        this.l = new sf6();
        this.m = 17.0f;
        this.n = true;
        this.a = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        this.a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList2.add(-16777216);
        this.c = BuildConfig.FLAVOR;
        this.p = -3.4028235E38f;
        this.q = Float.MAX_VALUE;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.o = arrayList;
        if (!arrayList.isEmpty()) {
            this.p = -3.4028235E38f;
            this.q = Float.MAX_VALUE;
            this.r = -3.4028235E38f;
            this.s = Float.MAX_VALUE;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                kj0 kj0Var = (kj0) ((qj3) obj);
                if (kj0Var != null && !Float.isNaN(kj0Var.t)) {
                    if (kj0Var.w == null) {
                        float f = kj0Var.t;
                        if (f < this.q) {
                            this.q = f;
                        }
                        if (f > this.p) {
                            this.p = f;
                        }
                    } else {
                        float f2 = -kj0Var.y;
                        if (f2 < this.q) {
                            this.q = f2;
                        }
                        float f3 = kj0Var.z;
                        if (f3 > this.p) {
                            this.p = f3;
                        }
                    }
                    float f4 = kj0Var.v;
                    if (f4 < this.s) {
                        this.s = f4;
                    }
                    if (f4 > this.r) {
                        this.r = f4;
                    }
                }
            }
        }
        this.t = Color.rgb(255, 187, 115);
        this.u = 1;
        this.v = Color.rgb(215, 215, 215);
        this.w = -16777216;
        this.x = 120;
        this.y = new String[]{"Stack"};
        this.t = Color.rgb(0, 0, 0);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            float[] fArr = ((kj0) arrayList.get(i2)).w;
            if (fArr != null && fArr.length > this.u) {
                this.u = fArr.length;
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            float[] fArr2 = ((kj0) arrayList.get(i3)).w;
        }
    }

    @Override // defpackage.q55
    public final boolean B() {
        return this.u > 1;
    }

    @Override // defpackage.q55
    public final String[] D() {
        return this.y;
    }

    @Override // defpackage.r55
    public final int F() {
        return this.t;
    }

    @Override // defpackage.q55
    public final int d() {
        return this.w;
    }

    @Override // defpackage.q55
    public final int q() {
        return this.v;
    }

    @Override // defpackage.q55
    public final int w() {
        return this.u;
    }

    @Override // defpackage.q55
    public final int z() {
        return this.x;
    }
}
